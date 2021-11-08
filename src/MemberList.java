import java.util.ArrayList;
import java.util.Scanner;

public class MemberList implements PersonManager{
	//ArrayList<String> cars = new ArrayList<String>();
	private ArrayList<Member> memberList;
	private int totalmembers;

	public MemberList() {
		memberList = new ArrayList<Member>();
		this.totalmembers=0;
		Member tempmem1 = new Member("Liam", 98765431);
		memberList.add(tempmem1);
		Member tempmem2 = new Member("Noah", 98765432);
		memberList.add(tempmem2);
		Member tempmem3 = new Member("Olver", 98765433);
		memberList.add(tempmem3);
		Member tempmem4 = new Member("Elijah", 98765434);
		memberList.add(tempmem4);
		Member tempmem5 = new Member("William", 98765435);
		memberList.add(tempmem5);
		Member tempmem6 = new Member("Olivia", 98765436);
		memberList.add(tempmem6);
		Member tempmem7 = new Member("Emma", 98765437);
		memberList.add(tempmem7);
		Member tempmem8 = new Member("Ava", 98765438);
		memberList.add(tempmem8);
		Member tempmem9 = new Member("Charlotte", 98765439);
		memberList.add(tempmem9);
		Member tempmem10 = new Member("Sophia", 98765441);
		memberList.add(tempmem10);
	}

	public void add_Person(Member member) {
		memberList.add(member);
		totalmembers++;
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
		Member tempmem = new Member(name, num);
		memberList.add(tempmem);
		totalmembers++;
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
				System.out.println("Member removed");
				return;
			}
		}

		System.out.println("Member not found");
	}

	public ArrayList<Member> getMemberIDList() {
		return this.memberList;
	}

	public int getTotalmembers() {
		return this.memberList.size();
	}


	public void printList() {
		for (int i = 0; i < memberList.size(); i++) {
			System.out.println(memberList.get(i).getName() + " " +
					memberList.get(i).getPhoneNum());
		}
	}

	public boolean checkMember(int phonenum) // add to vpp
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