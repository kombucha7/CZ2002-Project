public class Customer extends Person {

	private boolean membership;

	/**
	 * 
	 * @param name
	 * @param phoneNum
	 * @param membership
	 */
	public Customer(String name, int phoneNum, boolean membership) {
		// TODO - implement Customer.Customer
		throw new UnsupportedOperationException();
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