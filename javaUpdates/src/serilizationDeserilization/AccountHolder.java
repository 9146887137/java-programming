package serilizationDeserilization;

import java.io.Serializable;

//if i want to make my object Serializable so we implements serializable interface
public class AccountHolder implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private long adhar;
	private String email;
	private String gender;
	private int age;
	private long acno;
	private String address;

	public AccountHolder() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAdhar() {
		return adhar;
	}

	public void setAdhar(long adhar) {
		this.adhar = adhar;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getAcno() {
		return acno;
	}

	public void setAcno(long acno) {
		this.acno = acno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "AccountHolder [name=" + name + ", adhar=" + adhar + ", email=" + email + ", gender=" + gender + ", age="
				+ age + ", acno=" + acno + ", address=" + address + "]";
	}
	

}
