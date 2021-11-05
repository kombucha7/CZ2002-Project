import java.util.ArrayList;

public class MemberList {
	//ArrayList<String> cars = new ArrayList<String>();
	private ArrayList<Member> memberList = new ArrayList<Member>();
	private int totalmembers;

	public void MemberIDList() {
	}

	public void add_Member(Member member) {
		memberList.add(member);
	}

	/**
	 * 
	 * @param memberID
	 */
	public void delete_Member(int memberID) {
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

}