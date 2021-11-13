import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Class to read and write to serializable classes This allows us to save the
 * state of an object and reload it when we run the program again This feature
 * is used in our App to prevent hardcoding of "static" things like items in the
 * menu which would have to be entered every time we run the program otherwise
 * functions were written for all list classes but not all of them were used in
 * the actual restaurant class due to the different natures of each object
 */
public class ObjectReaderWriter {

	/**
	 * Constructor for class Will not be used due to the static nature of the
	 * functions
	 */
	private ObjectReaderWriter() {
	}

	/**
	 * Static Function to read serialized orderList from OrderList.txt Uses
	 * FileInputStream to read the raw bytes from the serialized orderList file Then
	 * uses ObjectInputStream to deserialize the raw bytes loaded from
	 * FileInputStream The deserialized object is then assigned into a temporary
	 * OrderList object which is returned
	 * 
	 * @return deserialized orderlist, if it is null, create new orderList and
	 *         return that instead
	 */
	public static OrderList readOrderList() {
		try {
			FileInputStream inputfile = new FileInputStream("savedstates/OrderList.txt");
			ObjectInputStream inputobject = new ObjectInputStream(inputfile);

			OrderList inputlist = (OrderList) inputobject.readObject();

			inputfile.close();
			inputobject.close();
			if (inputlist == null)
				return new OrderList();
			return inputlist;
		} catch (ClassNotFoundException c) {
			System.out.println("ClassNotFoundException!");
			c.printStackTrace();
			return null;
		} catch (StreamCorruptedException s) {
			System.out.println("StreamCorruptedException!");
			s.printStackTrace();
			return null;
		} catch (InvalidClassException i) {
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return null;
		} catch (OptionalDataException o) {
			System.out.println("OptionalDataException!");
			o.printStackTrace();
			return null;
		} catch (IOException i) {
			System.out.println("IOException!");
			i.printStackTrace();
			return null;
		}
	}

	/**
	 * Uses the FileOutputStream to designate a file to write the raw bytes of a
	 * serialised object to Then loads that file into ObjectOutputStream to
	 * serialise and write the object in memory into the file designated in
	 * FileOutputStream
	 * 
	 * File paths are predesignated
	 * 
	 * @param writelist OrderList object to be save
	 * @return true if successful, false is failed
	 */
	public static boolean writeOrderList(OrderList writelist) {

		if (writelist == null) {
			return false;
		}

		if (!Files.exists(Paths.get("savedstates/OrderList.txt"))) {
			new File("savedstates").mkdir();
		}

		try {
			FileOutputStream outputfile = new FileOutputStream("savedstates/OrderList.txt");
			ObjectOutputStream outputobject = new ObjectOutputStream(outputfile);

			outputobject.writeObject(writelist);

			outputobject.close();
			outputfile.close();

			return true;
		} catch (InvalidClassException i) {
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return false;
		} catch (NotSerializableException n) {
			System.out.println("NotSerializableException!");
			n.printStackTrace();
			return false;
		} catch (IOException i) {
			System.out.println("IOException!");
			i.printStackTrace();
			return false;
		}
	}

	/**
	 * Static Function to read serialized ReservationList from ReservationList.txt
	 * Uses FileInputStream to read the raw bytes from the serialized
	 * ReservationList file Then uses ObjectInputStream to deserialize the raw bytes
	 * loaded from FileInputStream The deserialized object is then assigned into a
	 * temporary ReservationList object which is returned
	 * 
	 * @return deserialized ReservationList, if it is null, create new
	 *         ReservationList and return that instead
	 */
	public static ReservationList readReservationList() {
		try {
			FileInputStream inputfile = new FileInputStream("savedstates/ReservationList.txt");
			ObjectInputStream inputobject = new ObjectInputStream(inputfile);

			ReservationList inputlist = (ReservationList) inputobject.readObject();

			inputfile.close();
			inputobject.close();
			if (inputlist == null)
				return new ReservationList();
			return inputlist;
		} catch (ClassNotFoundException c) {
			System.out.println("ClassNotFoundException!");
			c.printStackTrace();
			return null;
		} catch (StreamCorruptedException s) {
			System.out.println("StreamCorruptedException!");
			s.printStackTrace();
			return null;
		} catch (InvalidClassException i) {
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return null;
		} catch (OptionalDataException o) {
			System.out.println("OptionalDataException!");
			o.printStackTrace();
			return null;
		} catch (IOException i) {
			System.out.println("IOException!");
			i.printStackTrace();
			return null;
		}
	}

	/**
	 * Uses the FileOutputStream to designate a file to write the raw bytes of a
	 * serialised object to Then loads that file into ObjectOutputStream to
	 * serialise and write the object in memory into the file designated in
	 * FileOutputStream
	 * 
	 * File paths are predesignated
	 * 
	 * @param writelist ReservationList object to be save
	 * @return true if successful, false is failed
	 */
	public static boolean writeReservationList(ReservationList writelist) {

		if (writelist == null) {
			return false;
		}

		if (!Files.exists(Paths.get("savedstates/ReservationList.txt"))) {
			new File("savedstates").mkdir();
		}

		try {
			FileOutputStream outputfile = new FileOutputStream("savedstates/ReservationList.txt");
			ObjectOutputStream outputobject = new ObjectOutputStream(outputfile);

			outputobject.writeObject(writelist);

			outputobject.close();
			outputfile.close();

			return true;
		} catch (InvalidClassException i) {
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return false;
		} catch (NotSerializableException n) {
			System.out.println("NotSerializableException!");
			n.printStackTrace();
			return false;
		} catch (IOException i) {
			System.out.println("IOException!");
			i.printStackTrace();
			return false;
		}
	}

	/**
	 * Static Function to read serialized MemberList from MemberList.txt Uses
	 * FileInputStream to read the raw bytes from the serialized MemberList file
	 * Then uses ObjectInputStream to deserialize the raw bytes loaded from
	 * FileInputStream The deserialized object is then assigned into a temporary
	 * MemberList object which is returned
	 * 
	 * @return deserialized MemberList, if it is null, create new MemberList and
	 *         return that instead
	 */
	public static MemberList readMemberList() {
		try {
			FileInputStream inputfile = new FileInputStream("savedstates/MemberList.txt");
			ObjectInputStream inputobject = new ObjectInputStream(inputfile);

			MemberList inputlist = (MemberList) inputobject.readObject();

			inputfile.close();
			inputobject.close();
			if (inputlist == null)
				return new MemberList();
			return inputlist;
		} catch (ClassNotFoundException c) {
			System.out.println("ClassNotFoundException!");
			c.printStackTrace();
			return null;
		} catch (StreamCorruptedException s) {
			System.out.println("StreamCorruptedException!");
			s.printStackTrace();
			return null;
		} catch (InvalidClassException i) {
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return null;
		} catch (OptionalDataException o) {
			System.out.println("OptionalDataException!");
			o.printStackTrace();
			return null;
		} catch (IOException i) {
			System.out.println("IOException!");
			i.printStackTrace();
			return null;
		}
	}

	/**
	 * Uses the FileOutputStream to designate a file to write the raw bytes of a
	 * serialised object to Then loads that file into ObjectOutputStream to
	 * serialise and write the object in memory into the file designated in
	 * FileOutputStream
	 * 
	 * File paths are predesignated
	 * 
	 * @param writelist MemberList object to be save
	 * @return true if successful, false is failed
	 */
	public static boolean writeMemberList(MemberList writelist) {

		if (writelist == null) {
			return false;
		}

		if (!Files.exists(Paths.get("savedstates/MemberList.txt"))) {
			new File("savedstates").mkdir();
		}

		try {
			FileOutputStream outputfile = new FileOutputStream("savedstates/MemberList.txt");
			ObjectOutputStream outputobject = new ObjectOutputStream(outputfile);

			outputobject.writeObject(writelist);

			outputobject.close();
			outputfile.close();

			return true;
		} catch (InvalidClassException i) {
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return false;
		} catch (NotSerializableException n) {
			System.out.println("NotSerializableException!");
			n.printStackTrace();
			return false;
		} catch (IOException i) {
			System.out.println("IOException!");
			i.printStackTrace();
			return false;
		}
	}

	/**
	 * Static Function to read serialized StaffList from StaffList.txt Uses
	 * FileInputStream to read the raw bytes from the serialized StaffList file Then
	 * uses ObjectInputStream to deserialize the raw bytes loaded from
	 * FileInputStream The deserialized object is then assigned into a temporary
	 * StaffList object which is returned
	 * 
	 * @return deserialized StaffList, if it is null, create new StaffList and
	 *         return that instead
	 */
	public static StaffList readStaffList() {
		try {
			FileInputStream inputfile = new FileInputStream("savedstates/StaffList.txt");
			ObjectInputStream inputobject = new ObjectInputStream(inputfile);

			StaffList inputlist = (StaffList) inputobject.readObject();

			inputfile.close();
			inputobject.close();
			if (inputlist == null)
				return new StaffList();
			return inputlist;
		} catch (ClassNotFoundException c) {
			System.out.println("ClassNotFoundException!");
			c.printStackTrace();
			return null;
		} catch (StreamCorruptedException s) {
			System.out.println("StreamCorruptedException!");
			s.printStackTrace();
			return null;
		} catch (InvalidClassException i) {
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return null;
		} catch (OptionalDataException o) {
			System.out.println("OptionalDataException!");
			o.printStackTrace();
			return null;
		} catch (IOException i) {
			System.out.println("IOException!");
			i.printStackTrace();
			return null;
		}
	}

	/**
	 * Uses the FileOutputStream to designate a file to write the raw bytes of a
	 * serialised object to Then loads that file into ObjectOutputStream to
	 * serialise and write the object in memory into the file designated in
	 * FileOutputStream
	 * 
	 * File paths are predesignated
	 * 
	 * @param writelist StaffList object to be save
	 * @return true if successful, false is failed
	 */
	public static boolean writeStaffList(StaffList writelist) {

		if (writelist == null) {
			return false;
		}

		if (!Files.exists(Paths.get("savedstates/StaffList.txt"))) {
			new File("savedstates").mkdir();
		}

		try {
			FileOutputStream outputfile = new FileOutputStream("savedstates/StaffList.txt");
			ObjectOutputStream outputobject = new ObjectOutputStream(outputfile);

			outputobject.writeObject(writelist);

			outputobject.close();
			outputfile.close();

			return true;
		} catch (InvalidClassException i) {
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return false;
		} catch (NotSerializableException n) {
			System.out.println("NotSerializableException!");
			n.printStackTrace();
			return false;
		} catch (IOException i) {
			System.out.println("IOException!");
			i.printStackTrace();
			return false;
		}
	}

	/**
	 * Static Function to read serialized TableList from TableList.txt Uses
	 * FileInputStream to read the raw bytes from the serialized TableList file Then
	 * uses ObjectInputStream to deserialize the raw bytes loaded from
	 * FileInputStream The deserialized object is then assigned into a temporary
	 * TableList object which is returned
	 * 
	 * @return deserialized TableList, if it is null, create new TableList and
	 *         return that instead
	 */
	public static TableList readTableList() {
		try {
			FileInputStream inputfile = new FileInputStream("savedstates/TableList.txt");
			ObjectInputStream inputobject = new ObjectInputStream(inputfile);

			TableList inputlist = (TableList) inputobject.readObject();

			inputfile.close();
			inputobject.close();
			if (inputlist == null)
				return new TableList();
			return inputlist;
		} catch (ClassNotFoundException c) {
			System.out.println("ClassNotFoundException!");
			c.printStackTrace();
			return null;
		} catch (StreamCorruptedException s) {
			System.out.println("StreamCorruptedException!");
			s.printStackTrace();
			return null;
		} catch (InvalidClassException i) {
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return null;
		} catch (OptionalDataException o) {
			System.out.println("OptionalDataException!");
			o.printStackTrace();
			return null;
		} catch (IOException i) {
			System.out.println("IOException!");
			i.printStackTrace();
			return null;
		}
	}

	/**
	 * Uses the FileOutputStream to designate a file to write the raw bytes of a
	 * serialised object to Then loads that file into ObjectOutputStream to
	 * serialise and write the object in memory into the file designated in
	 * FileOutputStream
	 * 
	 * File paths are predesignated
	 * 
	 * @param writelist TableList object to be save
	 * @return true if successful, false is failed
	 */
	public static boolean writeTableList(TableList writelist) {

		if (writelist == null) {
			return false;
		}

		if (!Files.exists(Paths.get("savedstates/TableList.txt"))) {
			new File("savedstates").mkdir();
		}

		try {
			FileOutputStream outputfile = new FileOutputStream("savedstates/TableList.txt");
			ObjectOutputStream outputobject = new ObjectOutputStream(outputfile);

			outputobject.writeObject(writelist);

			outputobject.close();
			outputfile.close();

			return true;
		} catch (InvalidClassException i) {
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return false;
		} catch (NotSerializableException n) {
			System.out.println("NotSerializableException!");
			n.printStackTrace();
			return false;
		} catch (IOException i) {
			System.out.println("IOException!");
			i.printStackTrace();
			return false;
		}
	}

	/**
	 * Static Function to read serialized TimeHandler from TimeHandler.txt Uses
	 * FileInputStream to read the raw bytes from the serialized TimeHandler file
	 * Then uses ObjectInputStream to deserialize the raw bytes loaded from
	 * FileInputStream The deserialized object is then assigned into a temporary
	 * TimeHandler object which is returned
	 * 
	 * @return deserialized TimeHandler, if it is null, create new TimeHandler and
	 *         return that instead
	 */
	public static TimeHandler readTimeHandler() {
		try {
			FileInputStream inputfile = new FileInputStream("savedstates/TimeHandler.txt");
			ObjectInputStream inputobject = new ObjectInputStream(inputfile);

			TimeHandler inputlist = (TimeHandler) inputobject.readObject();

			inputfile.close();
			inputobject.close();
			if (inputlist == null)
				return new TimeHandler();
			return inputlist;
		} catch (ClassNotFoundException c) {
			System.out.println("ClassNotFoundException!");
			c.printStackTrace();
			return null;
		} catch (StreamCorruptedException s) {
			System.out.println("StreamCorruptedException!");
			s.printStackTrace();
			return null;
		} catch (InvalidClassException i) {
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return null;
		} catch (OptionalDataException o) {
			System.out.println("OptionalDataException!");
			o.printStackTrace();
			return null;
		} catch (IOException i) {
			System.out.println("IOException!");
			i.printStackTrace();
			return null;
		}
	}

	/**
	 * Uses the FileOutputStream to designate a file to write the raw bytes of a
	 * serialised object to Then loads that file into ObjectOutputStream to
	 * serialise and write the object in memory into the file designated in
	 * FileOutputStream
	 * 
	 * File paths are predesignated
	 * 
	 * @param writelist TimeHandler object to be save
	 * @return true if successful, false is failed
	 */
	public static boolean writeTimeHandler(TimeHandler writelist) {

		if (writelist == null) {
			return false;
		}

		if (!Files.exists(Paths.get("savedstates/TimeHandler.txt"))) {
			new File("savedstates").mkdir();
		}

		try {
			FileOutputStream outputfile = new FileOutputStream("savedstates/TimeHandler.txt");
			ObjectOutputStream outputobject = new ObjectOutputStream(outputfile);

			outputobject.writeObject(writelist);

			outputobject.close();
			outputfile.close();

			return true;
		} catch (InvalidClassException i) {
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return false;
		} catch (NotSerializableException n) {
			System.out.println("NotSerializableException!");
			n.printStackTrace();
			return false;
		} catch (IOException i) {
			System.out.println("IOException!");
			i.printStackTrace();
			return false;
		}
	}

	/**
	 * Static Function to read serialized Menu from Menu.txt Uses FileInputStream to
	 * read the raw bytes from the serialized Menu file Then uses ObjectInputStream
	 * to deserialize the raw bytes loaded from FileInputStream The deserialized
	 * object is then assigned into a temporary Menu object which is returned
	 * 
	 * @return deserialized Menu, if it is null, create new Menu and return that
	 *         instead
	 */
	public static Menu readMenu() {
		try {
			FileInputStream inputfile = new FileInputStream("savedstates/Menu.txt");
			ObjectInputStream inputobject = new ObjectInputStream(inputfile);

			Menu inputlist = (Menu) inputobject.readObject();

			inputfile.close();
			inputobject.close();
			if (inputlist == null)
				inputlist = new Menu();
			return inputlist;
		} catch (ClassNotFoundException c) {
			System.out.println("ClassNotFoundException!");
			c.printStackTrace();
			return null;
		} catch (StreamCorruptedException s) {
			System.out.println("StreamCorruptedException!");
			s.printStackTrace();
			return null;
		} catch (InvalidClassException i) {
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return null;
		} catch (OptionalDataException o) {
			System.out.println("OptionalDataException!");
			o.printStackTrace();
			return null;
		} catch (IOException i) {
			System.out.println("IOException!");
			i.printStackTrace();
			return null;
		}
	}

	/**
	 * Uses the FileOutputStream to designate a file to write the raw bytes of a
	 * serialised object to Then loads that file into ObjectOutputStream to
	 * serialise and write the object in memory into the file designated in
	 * FileOutputStream
	 * 
	 * File paths are predesignated
	 * 
	 * @param writelist Menu object to be save
	 * @return true if successful, false is failed
	 */
	public static boolean writeMenu(Menu writelist) {

		if (writelist == null) {
			return false;
		}

		if (!Files.exists(Paths.get("savedstates/Menu.txt"))) {
			new File("savedstates").mkdir();
		}

		try {
			FileOutputStream outputfile = new FileOutputStream("savedstates/Menu.txt");
			ObjectOutputStream outputobject = new ObjectOutputStream(outputfile);

			outputobject.writeObject(writelist);

			outputobject.close();
			outputfile.close();

			return true;
		} catch (InvalidClassException i) {
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return false;
		} catch (NotSerializableException n) {
			System.out.println("NotSerializableException!");
			n.printStackTrace();
			return false;
		} catch (IOException i) {
			System.out.println("IOException!");
			i.printStackTrace();
			return false;
		}
	}

	/**
	 * Static Function to read serialized RevenueReport from RevenueReport.txt Uses
	 * FileInputStream to read the raw bytes from the serialized RevenueReport file
	 * Then uses ObjectInputStream to deserialize the raw bytes loaded from
	 * FileInputStream The deserialized object is then assigned into a temporary
	 * RevenueReport object which is returned
	 * 
	 * @return deserialized RevenueReport, if it is null, create new RevenueReport
	 *         and return that instead
	 */
	public static RevenueReport readRevenueReport() {
		try {
			FileInputStream inputfile = new FileInputStream("savedstates/RevenueReport.txt");
			ObjectInputStream inputobject = new ObjectInputStream(inputfile);

			RevenueReport inputlist = (RevenueReport) inputobject.readObject();

			inputfile.close();
			inputobject.close();
			if (inputlist == null)
				return new RevenueReport();
			return inputlist;
		} catch (ClassNotFoundException c) {
			System.out.println("ClassNotFoundException!");
			c.printStackTrace();
			return null;
		} catch (StreamCorruptedException s) {
			System.out.println("StreamCorruptedException!");
			s.printStackTrace();
			return null;
		} catch (InvalidClassException i) {
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return null;
		} catch (OptionalDataException o) {
			System.out.println("OptionalDataException!");
			o.printStackTrace();
			return null;
		} catch (IOException i) {
			System.out.println("IOException!");
			i.printStackTrace();
			return null;
		}
	}

	/**
	 * Uses the FileOutputStream to designate a file to write the raw bytes of a
	 * serialised object to Then loads that file into ObjectOutputStream to
	 * serialise and write the object in memory into the file designated in
	 * FileOutputStream
	 * 
	 * File paths are predesignated
	 * 
	 * @param writelist RevenueReport object to be save
	 * @return true if successful, false is failed
	 */
	public static boolean writeRevenueReport(RevenueReport writelist) {

		if (writelist == null) {
			return false;
		}

		if (!Files.exists(Paths.get("savedstates/RevenueReport.txt"))) {
			new File("savedstates").mkdir();
		}

		try {
			FileOutputStream outputfile = new FileOutputStream("savedstates/RevenueReport.txt");
			ObjectOutputStream outputobject = new ObjectOutputStream(outputfile);

			outputobject.writeObject(writelist);

			outputobject.close();
			outputfile.close();

			return true;
		} catch (InvalidClassException i) {
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return false;
		} catch (NotSerializableException n) {
			System.out.println("NotSerializableException!");
			n.printStackTrace();
			return false;
		} catch (IOException i) {
			System.out.println("IOException!");
			i.printStackTrace();
			return false;
		}
	}
}