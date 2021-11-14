import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * List class that stores all member objects in a member ArrayList also provides
 * essential functions to interact with individual member objects persons who
 * are in this list are able to enjoy member discount when making payment
 */
public class MemberList implements PersonManager, Serializable {

	/**
	 * ArrayList to store all member objects
	 */
	private ArrayList<Member> memberList;

	/**
	 * Constructor for memberlist object Initilises the member ArrayList within
	 */
	public MemberList() {
		memberList = new ArrayList<Member>();
	}

	/**
	 * Function for adding a member Uses scanner to parse for parameters
	 */
	public void add_Person() {
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Please enter member name: ");
				String name = sc.next();
				for (int i=0; i<name.length(); i++) {
					if (Character.isDigit(name.charAt(0))) {
						throw new InputMismatchException();
					}
				}
				System.out.println("Please enter member phone number: (8 Digits)");
				int num = sc.nextInt();
				String numStr = "" + num;
				if (numStr.length() != 8) { throw new InputMismatchException();}
				Member tempMem = new Member(name, num);
				memberList.add(tempMem);
				System.out.println(name + " has been added to the memberList!\n");
				break;
			} catch (InputMismatchException inputError) {
				System.out.println("Please re-enter input");
			}
		}
	}

	/**
	 * Overloaded function for adding a member by passing in the member object that
	 * is created externally
	 * 
	 * @param member object to be added to the list
	 */
	public void add_Person(Member member) {
		memberList.add(member);
	}

	/**
	 * Function to delete a member based on their phone number Prints error message
	 * if member cannot be found
	 * 
	 * @param memberID of member to be deleted
	 */
	public void delete_Person(int memberID) {
		for (int i = 0; i < memberList.size(); i++) {
			if (memberList.get(i).getPhoneNum() == memberID) {
				memberList.remove(i);
				System.out.println("Member removed.");
				return;
			}
		}
		System.out.println("Member not found.");
	}

	/**
	 * gets the arraylist of members
	 * 
	 * @return arraylist of members
	 */
	public ArrayList<Member> getMemberIDList() {
		return this.memberList;
	}

	/**
	 * gets the total number of members based on the size of the arraylist
	 * 
	 * @return size of memberlist
	 */
	public int getTotalMembers() {
		return this.memberList.size();
	}

	/**
	 * prints the name and phone number of all members
	 */
	public void printList() {
		for (int i = 0; i < memberList.size(); i++) {
			System.out.println(memberList.get(i).getName() + " " + memberList.get(i).getPhoneNum());
		}
	}

	/**
	 * verify if a phonenumber is in the memberlist
	 * 
	 * @param phonenum of member to be searched for
	 * @return true if phone number matches one in the memberlist
	 */
	public boolean checkMember(int phonenum) {
		for (int i = 0; i < memberList.size(); i++) {
			if (memberList.get(i).getPhoneNum() == phonenum) {
				return true;
			}
		}
		return false;
	}

}