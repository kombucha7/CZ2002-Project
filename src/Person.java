public abstract class Person {

	private String name;
	private int phoneNum;

	/**
	 * 
	 * @param name
	 * @param phoneNum
	 */
	public Person(String name, int phoneNum) {
		// TODO - implement Person.Person
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNum() {
		return this.phoneNum;
	}

	/**
	 * 
	 * @param phoneNum
	 */
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}

}