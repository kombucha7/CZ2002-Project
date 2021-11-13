/**
 * Member class which inherits from the person class Type of customer that is
 * able to enjoy the member discount
 */
public class Member extends Person {

	/**
	 * Constructor for member object which takes in the name and phone number of the
	 * person It calls the super constructor(person) to create the object
	 * 
	 * @param name     of the person to be created
	 * @param phoneNum of the person to be created
	 */
	public Member(String name, int phoneNum) {
		super(name, phoneNum);
	}

}