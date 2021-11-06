import java.util.ArrayList;
import java.util.Scanner;

public class StaffList {

	private ArrayList<Staff> staffList;
	private static int numStaff = 1;

	public StaffList() {
		staffList = new ArrayList<Staff>(); 

		Staff tempstaff1 = new Staff("John", 12345678, numStaff++, jobTitle.Cashier, gender.Male);
		staffList.add(tempstaff1);
		Staff tempstaff2 = new Staff("Tom", 22345678, numStaff++, jobTitle.Cashier, gender.Male);
		staffList.add(tempstaff2);
		Staff tempstaff3 = new Staff("Harry", 32345678, numStaff++, jobTitle.Waiter, gender.Male);
		staffList.add(tempstaff3);
		Staff tempstaff4 = new Staff("Jim", 42345678, numStaff++, jobTitle.Waiter, gender.Male);
		staffList.add(tempstaff4);
		Staff tempstaff5 = new Staff("Ryan", 52345678, numStaff++, jobTitle.Waiter, gender.Male);
		staffList.add(tempstaff5);
		Staff tempstaff6 = new Staff("Emma", 62345678, numStaff++, jobTitle.Waiter, gender.Female);
		staffList.add(tempstaff6);
		Staff tempstaff7 = new Staff("Ava", 72345678, numStaff++, jobTitle.Waiter, gender.Female);
		staffList.add(tempstaff7);
		Staff tempstaff8 = new Staff("Charlotte", 82345678, numStaff++, jobTitle.Chef, gender.Female);
		staffList.add(tempstaff8);
		Staff tempstaff9 = new Staff("Olivia", 92345678, numStaff++, jobTitle.Chef, gender.Female);
		staffList.add(tempstaff9);
		Staff tempstaff10 = new Staff("Sophia", 13345678, numStaff++, jobTitle.Manager, gender.Female);
		staffList.add(tempstaff10);
	}

	public void add_Staff()
	{
		int choice;
		boolean flag = true;
		jobTitle tempTitle = jobTitle.Cashier;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter staff name: ");
		String tempname = sc.next();
		System.out.println("Please enter staff phoneNum: ");
		int tempnum = sc.nextInt();
		System.out.println("Please enter staff title: ");
		while(flag)
		{
			System.out.printf("Please enter staff title: \n(1) Waiter\n(2) Cashier\n(3) Manager\n(4) Chef\n");
			choice = sc.nextInt();
			switch(choice)
			{
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
		gender tempgender = gender.Male;
		System.out.println("Please enter staff gender: ");
		while(flag)
		{
			System.out.printf("Please enter staff gender: \n(1) Male\n(2) Female\n");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					tempgender = gender.Male;
					flag = false;
					break;
				
				case 2:
					tempgender = gender.Female;
					flag = false;
					break;

				default:
					System.out.println("Invalid choice");
					break;
			}
		}
		Staff tempstaff = new Staff(tempname, tempnum, numStaff++, tempTitle, tempgender);
		staffList.add(tempstaff);
	}

	public void add_Staff(Staff staff) {
		staffList.add(staff);
	}

	public void delete_Staff(int staffID) {
		for (int i = 0; i < staffList.size(); i++){
			if (staffList.get(i).getEmployeeID() == staffID){
				staffList.remove(i);
				System.out.println("Staff has been removed");
				return;
			}
		}

		System.out.println("Unable to find staff in system");
	}

	public ArrayList<Staff> getStaffList() {
		return this.staffList;
	}


	public int getNumStaff() {
		return this.staffList.size();
	}


	public void printList() {
		for (int i = 0; i < staffList.size(); i++) {
			System.out.println(staffList.get(i).getName() + " " +
					staffList.get(i).getEmployeeID() + " " +
					staffList.get(i).getJobTitle());
		}
	}

}