import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * List class containing all staff objects created Also includes functions to
 * interact with individual staff objects
 */
public class StaffList implements PersonManager, Serializable {

	/**
	 * Staff ArrayList containing all staff objects
	 */
	private ArrayList<Staff> staffList;

	/**
	 * static variable to create a unique staffID for every staff member
	 */
	private static int numStaff = 1;

	/**
	 * constructor function for StaffList constructs Staff Arraylist within
	 */
	public StaffList() {
		staffList = new ArrayList<Staff>();

		// kept as backup in case serialized objects corrupts
		// remember to delete before submission
		/*
		 * Staff tempStaff1 = new Staff("John", 12345678, numStaff++, jobTitle.Cashier,
		 * gender.Male); staffList.add(tempStaff1); Staff tempStaff2 = new Staff("Tom",
		 * 22345678, numStaff++, jobTitle.Cashier, gender.Male);
		 * staffList.add(tempStaff2); Staff tempStaff3 = new Staff("Harry", 32345678,
		 * numStaff++, jobTitle.Waiter, gender.Male); staffList.add(tempStaff3); Staff
		 * tempStaff4 = new Staff("Jim", 42345678, numStaff++, jobTitle.Waiter,
		 * gender.Male); staffList.add(tempStaff4); Staff tempStaff5 = new Staff("Ryan",
		 * 52345678, numStaff++, jobTitle.Waiter, gender.Male);
		 * staffList.add(tempStaff5); Staff tempStaff6 = new Staff("Emma", 62345678,
		 * numStaff++, jobTitle.Waiter, gender.Female); staffList.add(tempStaff6); Staff
		 * tempStaff7 = new Staff("Ava", 72345678, numStaff++, jobTitle.Waiter,
		 * gender.Female); staffList.add(tempStaff7); Staff tempStaff8 = new
		 * Staff("Charlotte", 82345678, numStaff++, jobTitle.Chef, gender.Female);
		 * staffList.add(tempStaff8); Staff tempStaff9 = new Staff("Olivia", 92345678,
		 * numStaff++, jobTitle.Chef, gender.Female); staffList.add(tempStaff9); Staff
		 * tempStaff10 = new Staff("Sophia", 13345678, numStaff++, jobTitle.Manager,
		 * gender.Female); staffList.add(tempStaff10);
		 */
	}

	/**
	 * function to add a new staff to stafflist. uses scanner to parse for
	 * parameters for construction of staff
	 */
	public void add_Person() {
		int choice;
		boolean flag = true;
		jobTitle tempTitle = jobTitle.Cashier;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter staff name: ");
		String tempName = sc.next();
		System.out.println("Please enter staff phoneNum: ");
		int tempNum = sc.nextInt();
		System.out.println("Please enter staff title: ");
		while (flag) {
			System.out.printf("Please enter staff title: \n(1) Waiter\n(2) Cashier\n(3) Manager\n(4) Chef\n");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				tempTitle = jobTitle.Waiter;
				flag = false;
				break;

			case 2:
				tempTitle = jobTitle.Cashier;
				flag = false;
				break;

			case 3:
				tempTitle = jobTitle.Manager;
				flag = false;
				break;

			case 4:
				tempTitle = jobTitle.Chef;
				flag = false;
				break;

			default:
				System.out.println("Invalid choice");
				break;
			}
		}
		flag = true;
		gender tempGender = gender.Male;
		System.out.println("Please enter staff gender: ");
		while (flag) {
			System.out.printf("Please enter staff gender: \n(1) Male\n(2) Female\n");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				tempGender = gender.Male;
				flag = false;
				break;

			case 2:
				tempGender = gender.Female;
				flag = false;
				break;

			default:
				System.out.println("Invalid choice");
				break;
			}
		}
		Staff tempStaff = new Staff(tempName, tempNum, numStaff++, tempTitle, tempGender);
		staffList.add(tempStaff);
	}

	/**
	 * Adds an externally generated staff object into the stafflist
	 * 
	 * @param staff to be added to stafflist
	 */
	public void add_Person(Staff staff) {
		staffList.add(staff);
	}

	/**
	 * Function to delete a staff in the staffList. Staff to be deleted is based on
	 * the staffID passed into the function. Prints error message if staff cannot be
	 * found for deletion
	 * 
	 * @param staffID of staff to be deleted
	 */
	public void delete_Person(int staffID) {
		for (int i = 0; i < staffList.size(); i++) {
			if (staffList.get(i).getEmployeeID() == staffID) {
				staffList.remove(i);
				System.out.println("Staff has been removed");
				return;
			}
		}
		System.out.println("Unable to find staff in system");
	}

	/**
	 * gets staff arraylist
	 * 
	 * @return arraylist containing staff objects
	 */
	public ArrayList<Staff> getStaffList() {
		return this.staffList;
	}

	/**
	 * gets the total number of staff members based on the size of the arraylist
	 * 
	 * @return size of arraylist
	 */
	public int getNumStaff() {
		return this.staffList.size();
	}

	/**
	 * prints all staff members in stafflist as well as their name, employeeID and
	 * jobTitle
	 */
	public void printList() {
		System.out.println("Name  |  ID  |  Title");
		for (int i = 0; i < staffList.size(); i++) {
			System.out.println(staffList.get(i).getName() + "   " + staffList.get(i).getEmployeeID() + "   "
					+ staffList.get(i).getJobTitle());
		}
	}

}