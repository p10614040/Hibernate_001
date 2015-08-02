import java.util.Date;

/**
 * 
 * @Title Student.java
 * @Package 
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年7月30日 下午11:12:48
 * @copyright USTCINFO
 */

/**
 * @author YanLiang
 *
 */
public class Student {

	private int sid;	// 学号
	private String name;	// 姓名
	private String gender;	// 性别
	private Date birthDate;	// 出生 日期
	private String address;	// 地址
	
	public Student() {
	}

	/**
	 * @param sid
	 * @param name
	 * @param gender
	 * @param birthDate
	 * @param address
	 */
	public Student(int sid, String name, String gender, Date birthDate,
			String address) {
		this.sid = sid;
		this.name = name;
		this.gender = gender;
		this.birthDate = birthDate;
		this.address = address;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", gender=" + gender
				+ ", birthDate=" + birthDate + ", address=" + address + "]";
	}
	
}
