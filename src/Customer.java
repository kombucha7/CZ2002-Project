public class Customer extends Person {

	private boolean membership;

	/**
	 * 
	 * @param name
	 * @param phoneNum
	 * @param membership
	 */
	public Customer(String name, int phoneNum, boolean membership) {
		super(name, phoneNum);
		this.membership = membership;
	}

	public boolean getMembership() {
		return this.membership;
	}

	/**
	 * 
	 * @param membership
	 */
	public void setMembership(boolean membership) {
		this.membership = membership;
	}

}