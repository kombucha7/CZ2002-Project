import java.util.ArrayList;
import java.util.Scanner;

public class StaffList {

	private ArrayList<Staff> staffList;
	private int numStaff;

	public StaffList() {
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