public class Staff extends Person {

	private int employeeID;
	private jobTitle jobTitle;
	private gender gender;

	/**
	 * 
	 * @param name
	 * @param phoneNum
	 * @param employeeID
	 * @param jobTitle
	 * @param gender
	 */
	public Staff(String name, int phoneNum, int employeeID, jobTitle jobTitle, gender gender) {
		// TODO - implement Staff.Staff
		super(name,phoneNum);
		this.employeeID = employeeID;
		this.jobTitle = jobTitle;
		this.gender = gender;
	}

	public int getEmployeeID() {
		return this.employeeID;
	}

	/**
	 * 
	 * @param employeeID
	 */
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public jobTitle getJobTitle() {
		// TODO - implement Staff.getJobTitle
		return this.jobTitle;
	}

	/**
	 * 
	 * @param jobTitle
	 */
	public void setJobTitle(jobTitle jobTitle) {
		// TODO - implement Staff.setJobTitle
		this.jobTitle = jobTitle;
	}

	public gender getGender() {
		return this.gender;
	}

	/**
	 * 
	 * @param gender
	 */
	public void setGender(gender gender) {
		this.gender = gender;
	}

}