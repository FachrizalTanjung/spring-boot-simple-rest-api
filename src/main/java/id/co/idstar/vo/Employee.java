package id.co.idstar.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {

	private Integer id;

	@JsonProperty("employee_name")
	private String employeeName;

	@JsonProperty("employee_salary")
	private String employeeSalary;

	@JsonProperty("employee_age")
	private String employeeAge;

	@JsonProperty("profile_image")
	private String profileImage;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(String employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(String employeeAge) {
		this.employeeAge = employeeAge;
	}

	public String getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

}
