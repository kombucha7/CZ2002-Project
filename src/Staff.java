public class Staff extends Person {

	private int employeeID;
	private jobTItle jobTitle;
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
		throw new UnsupportedOperationException();
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
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param jobTitle
	 */
	public void setJobTitle(jobTitle jobTitle) {
		// TODO - implement Staff.setJobTitle
		throw new UnsupportedOperationException();
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