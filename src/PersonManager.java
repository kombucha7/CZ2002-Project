/**
 * interface class for managing objects that inherits from the Person Abstract
 * class
 */
public interface PersonManager {

	/**
	 * Used to create a new object and add it into its arrayList
	 */
	void add_Person();

	/**
	 * Used to delete an object from its arrayList Object will be selected based on
	 * its ID that is assigned to it upon creation
	 * 
	 * @param ID of object to be deleted
	 */
	void delete_Person(int ID);

}