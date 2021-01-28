package com.css.corejava.main;

public class Traniee {
	private int tranieeeId;
	private String tranieeName;
	private int contactNo;
	private String email;
	private String gender;
	private int age;

	// constructor
	public Traniee(int tranieeeId, String tranieeName, int contactNo, String email, String gender, int age) {
		super();
		this.tranieeeId = tranieeeId;
		this.tranieeName = tranieeName;
		this.contactNo = contactNo;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

	public Traniee() {
		super();
		// TODO Auto-generated constructor stub
	}

	// getters and setters
	public int getTranieeeId() {
		return tranieeeId;
	}

	public void setTranieeeId(int tranieeeId) {
		this.tranieeeId = tranieeeId;
	}

	public String getTranieeName() {
		return tranieeName;
	}

	public void setTranieeName(String tranieeName) {
		this.tranieeName = tranieeName;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
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

	@Override
	public String toString() {
		return "Traniee [tranieeeId=" + tranieeeId + ", tranieeName=" + tranieeName + ", contactNo=" + contactNo
				+ ", email=" + email + ", gender=" + gender + ", age=" + age + "]";
	}

}
