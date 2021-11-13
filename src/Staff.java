import java.io.Serializable;

/**
 * Class to symbolise a staff member Inherits from person
 */
public class Staff extends Person implements Serializable {

	/**
	 * Unique ID that is assigned to each employee
	 */
	private int employeeID;

	/**
	 * Specific job title of each employee Based on the jobTitle Enum
	 */
	private jobTitle jobTitle;

	/**
	 * Gender of an employee Based on the gender Enum
	 */
	private gender gender;

	/**
	 * Constructer function for the staff object Name and phone number is passed
	 * into the super constructor while the rest are unique to the staff class
	 * 
	 * @param name       of the staff
	 * @param phoneNum   of the stuff
	 * @param employeeID unique to staff
	 * @param jobTitle   Specific role of the staff
	 * @param gender     of the staff
	 */
	public Staff(String name, int phoneNum, int employeeID, jobTitle jobTitle, gender gender) {
		super(name, phoneNum);
		this.employeeID = employeeID;
		this.jobTitle = jobTitle;
		this.gender = gender;
	}

	/**
	 * gets the unique employee ID of the staff
	 * 
	 * @return this staff's employeeID
	 */
	public int getEmployeeID() {
		return this.employeeID;
	}

	/**
	 * overrides the employeeID set during construction
	 * 
	 * @param employeeID to replace current employeeID
	 */
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	/**
	 * gets the job title of this staff
	 * 
	 * @return this staff's jobTitle
	 */
	public jobTitle getJobTitle() {
		return this.jobTitle;
	}

	/**
	 * overrides the employeeID set during construction
	 * 
	 * @param jobTitle
	 */
	public void setJobTitle(jobTitle jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * gets the gender of this staff
	 * 
	 * @return gender of this staff
	 */
	public gender getGender() {
		return this.gender;
	}

	/**
	 * overrides the gender of the staff that is generated during construction
	 * 
	 * @param gender to overwrite current gender attribute
	 */
	public void setGender(gender gender) {
		this.gender = gender;
	}

}