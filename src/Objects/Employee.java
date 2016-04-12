package Objects;

public class Employee {
	private Date employeeStartDate;
	public Date getEmployeeStartDate() {
		return employeeStartDate;
	}
	public void setEmployeeStartDate(Date employeeStartDate) {
		this.employeeStartDate = employeeStartDate;
	}
	public String getSocialSecurity() {
		return socialSecurity;
	}
	public void setSocialSecurity(String socialSecurity) {
		this.socialSecurity = socialSecurity;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	private String socialSecurity;
	private String role;
	private String location;
	private String employeeId;
	

}
