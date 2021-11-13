import java.io.Serializable;

/**
 * Abstract class that is an abstraction of an actual person
 * is the superclass for other people-like classes like staff or member
 */
public abstract class Person implements Serializable {

	/**
	 * Attribute to store the name of the person
	 */
	private String name;

	/**
	 * Attribute to store the phone number of a person for verification
	 */
	private int phoneNum;

	/**
	 * Constructor class for Person that takes in the name and phone number for the person
	 * @param name of person to be created
	 * @param phoneNum of person to be created
	 */
	public Person(String name, int phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
	}

	/**
	 * gets the name of the person
	 * @return name of this person
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * overrides the name of the person
	 * should not be used unless for debugging purposes
	 * @param name to override attribute with
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * gets the phone number of this person
	 * @return phone number of this person
	 */
	public int getPhoneNum() {
		return this.phoneNum;
	}

	/**
	 * overrides the phone number of a person
	 * should not be used unless for debugging purposes
	 * @param phoneNum to be used for overriding
	 */
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}

}