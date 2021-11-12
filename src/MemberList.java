import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberList implements PersonManager, Serializable {

	private ArrayList<Member> memberList;

	public MemberList() {
		memberList = new ArrayList<Member>();
		Member tempMem1 = new Member("Liam", 98765431);
		memberList.add(tempMem1);
		Member tempMem2 = new Member("Noah", 98765432);
		memberList.add(tempMem2);
		Member tempMem3 = new Member("Olver", 98765433);
		memberList.add(tempMem3);
		Member tempMem4 = new Member("Elijah", 98765434);
		memberList.add(tempMem4);
		Member tempMem5 = new Member("William", 98765435);
		memberList.add(tempMem5);
		Member tempMem6 = new Member("Olivia", 98765436);
		memberList.add(tempMem6);
		Member tempMem7 = new Member("Emma", 98765437);
		memberList.add(tempMem7);
		Member tempMem8 = new Member("Ava", 98765438);
		memberList.add(tempMem8);
		Member tempMem9 = new Member("Charlotte", 98765439);
		memberList.add(tempMem9);
		Member tempMem10 = new Member("Sophia", 98765441);
		memberList.add(tempMem10);
	}

	public void add_Person(Member member) {
		memberList.add(member);
	}

	public void add_Person()
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int num;
		System.out.println("Please enter member name: ");
		name = sc.next();
		System.out.println("Please enter member phone number: ");
		num = sc.nextInt();
		Member tempMem = new Member(name, num);
		memberList.add(tempMem);
		sc.close();
	}

	/**
	 * 
	 * @param memberID
	 */
	public void delete_Person(int memberID) {
		for (int i = 0; i < memberList.size(); i++){
			if (memberList.get(i).getPhoneNum() == memberID){
				memberList.remove(i);
				System.out.println("Member removed.");
				return;
			}
		}

		System.out.println("Member not found.");
	}

	public ArrayList<Member> getMemberIDList() {
		return this.memberList;
	}

	public int getTotalMembers() {
		return this.memberList.size();
	}


	public void printList() {
		for (int i = 0; i < memberList.size(); i++) {
			System.out.println(memberList.get(i).getName() + " " +
					memberList.get(i).getPhoneNum());
		}
	}

	public boolean checkMember(int phonenum) 
	{
		for(int i = 0; i < memberList.size(); i++)
		{
			if(memberList.get(i).getPhoneNum() == phonenum)
			{
				return true;
			}
		}
		return false;
	}

}