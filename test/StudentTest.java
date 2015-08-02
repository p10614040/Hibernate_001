import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @Title StudentTest.java
 * @Package 
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年7月30日 下午11:21:00
 * @copyright USTCINFO
 */

/**
 * @author YanLiang
 *
 */
public class StudentTest {
	
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;

	/**
	 * @author yan.liang
	 * @date 2015年7月30日 下午11:21:00
	 * @Description Hibernate初始化
	 */
	@Before
	public void setUp() throws Exception {
		Configuration config = new Configuration().configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		sessionFactory = config.buildSessionFactory(serviceRegistry);
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
	}

	/**
	 * @author yan.liang
	 * @date 2015年7月30日 下午11:21:00
	 * @Description Hibernate释放资源
	 */
	@After
	public void tearDown() throws Exception {
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

	@Test
	public void test() {
		Student student = new Student(3, "张三", "男", new Date(), "钓鱼岛");
		session.save(student);
	}

}
