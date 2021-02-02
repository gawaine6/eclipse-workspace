package wp;
// 자바 빈즈에 대해서 알아봅시다
import java.io.Serializable;

public class Member implements Serializable{
	private static final long serialVersionUID = 1L;
	/*
	 * 멤버라는 객체를 만들어서 파일에 serializable 해라
	 * 근데 이걸 할라면 멤버에 대한 정의가 있어야 한다
	 */
	private int id;
	private String name = "hong gil dong";
	private String phone;
	private String gender = "male";
	private String birth;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String toString() {
		return "id : " + id + ", name : " + name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
}