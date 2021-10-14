public class Staff extends Person {

	private int employeeID;
	private jobTItle jobTitle;
	private gender gender;

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