import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ObjectReaderWriter
{
    private ObjectReaderWriter() {}

    public static OrderList readOrderList()
    {
        try
        {
            FileInputStream inputfile = new FileInputStream("savedstates/OrderList.txt");
            ObjectInputStream inputobject = new ObjectInputStream (inputfile);

            OrderList inputlist = (OrderList) inputobject.readObject();

            inputfile.close();
            inputobject.close();
            if(inputlist==null) return new OrderList();
            return inputlist;
        }
        catch (ClassNotFoundException c)
		{
			System.out.println("ClassNotFoundException!");
			c.printStackTrace();
			return null;
		}
		catch (StreamCorruptedException s)
		{
			System.out.println("StreamCorruptedException!");
			s.printStackTrace();
			return null;
		}
		catch (InvalidClassException i)
		{
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return null;
		}
		catch (OptionalDataException o)
		{
			System.out.println("OptionalDataException!");
			o.printStackTrace();
			return null;
		}
		catch (IOException i)
		{
			System.out.println("IOException!");
			i.printStackTrace();
			return null;
		}
    }

    public static boolean writeOrderList(OrderList writelist)
    {

		if (writelist == null)
		{
			return false;
		}
		
		if (!Files.exists(Paths.get("savedstates/OrderList.txt")))
		{
			new File("savedstates").mkdir();
		}
		
		try
		{
			FileOutputStream fileOut = new FileOutputStream ("savedstates/OrderList.txt");
			ObjectOutputStream objectOut = new ObjectOutputStream (fileOut);
			
			objectOut.writeObject(writelist);
			
			objectOut.close();
			fileOut.close();
			
			return true;
		}
		catch (InvalidClassException i)
		{
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return false;
		}
		catch (NotSerializableException n)
		{
			System.out.println("NotSerializableException!");
			n.printStackTrace();
			return false;
		}
		catch (IOException i)
		{
			System.out.println("IOException!");
			i.printStackTrace();
			return false;
		}
    }

    public static ReservationList readReservationList()
    {
        try
        {
            FileInputStream inputfile = new FileInputStream("savedstates/ReservationList.txt");
            ObjectInputStream inputobject = new ObjectInputStream (inputfile);

            ReservationList inputlist = (ReservationList) inputobject.readObject();

            inputfile.close();
            inputobject.close();
            if(inputlist==null) return new ReservationList();
            return inputlist;
        }
        catch (ClassNotFoundException c)
		{
			System.out.println("ClassNotFoundException!");
			c.printStackTrace();
			return null;
		}
		catch (StreamCorruptedException s)
		{
			System.out.println("StreamCorruptedException!");
			s.printStackTrace();
			return null;
		}
		catch (InvalidClassException i)
		{
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return null;
		}
		catch (OptionalDataException o)
		{
			System.out.println("OptionalDataException!");
			o.printStackTrace();
			return null;
		}
		catch (IOException i)
		{
			System.out.println("IOException!");
			i.printStackTrace();
			return null;
		}
    }
    
    public static boolean writeReservationList(ReservationList writelist)
    {

		if (writelist == null)
		{
			return false;
		}
		
		if (!Files.exists(Paths.get("savedstates/ReservationList.txt")))
		{
			new File("savedstates").mkdir();
		}
		
		try
		{
			FileOutputStream fileOut = new FileOutputStream ("savedstates/ReservationList.txt");
			ObjectOutputStream objectOut = new ObjectOutputStream (fileOut);
			
			objectOut.writeObject(writelist);
			
			objectOut.close();
			fileOut.close();
			
			return true;
		}
		catch (InvalidClassException i)
		{
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return false;
		}
		catch (NotSerializableException n)
		{
			System.out.println("NotSerializableException!");
			n.printStackTrace();
			return false;
		}
		catch (IOException i)
		{
			System.out.println("IOException!");
			i.printStackTrace();
			return false;
		}
    }

    public static MemberList readMemberList()
    {
        try
        {
            FileInputStream inputfile = new FileInputStream("savedstates/MemberList.txt");
            ObjectInputStream inputobject = new ObjectInputStream (inputfile);

            MemberList inputlist = (MemberList) inputobject.readObject();

            inputfile.close();
            inputobject.close();
            if(inputlist==null) return new MemberList();
            return inputlist;
        }
        catch (ClassNotFoundException c)
		{
			System.out.println("ClassNotFoundException!");
			c.printStackTrace();
			return null;
		}
		catch (StreamCorruptedException s)
		{
			System.out.println("StreamCorruptedException!");
			s.printStackTrace();
			return null;
		}
		catch (InvalidClassException i)
		{
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return null;
		}
		catch (OptionalDataException o)
		{
			System.out.println("OptionalDataException!");
			o.printStackTrace();
			return null;
		}
		catch (IOException i)
		{
			System.out.println("IOException!");
			i.printStackTrace();
			return null;
		}
    }
    
    public static boolean writeMemberList(MemberList writelist)
    {

		if (writelist == null)
		{
			return false;
		}
		
		if (!Files.exists(Paths.get("savedstates/MemberList.txt")))
		{
			new File("savedstates").mkdir();
		}
		
		try
		{
			FileOutputStream fileOut = new FileOutputStream ("savedstates/MemberList.txt");
			ObjectOutputStream objectOut = new ObjectOutputStream (fileOut);
			
			objectOut.writeObject(writelist);
			
			objectOut.close();
			fileOut.close();
			
			return true;
		}
		catch (InvalidClassException i)
		{
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return false;
		}
		catch (NotSerializableException n)
		{
			System.out.println("NotSerializableException!");
			n.printStackTrace();
			return false;
		}
		catch (IOException i)
		{
			System.out.println("IOException!");
			i.printStackTrace();
			return false;
		}
    }

    public static StaffList readStaffList()
    {
        try
        {
            FileInputStream inputfile = new FileInputStream("savedstates/StaffList.txt");
            ObjectInputStream inputobject = new ObjectInputStream (inputfile);

            StaffList inputlist = (StaffList) inputobject.readObject();

            inputfile.close();
            inputobject.close();
            if(inputlist==null) return new StaffList();
            return inputlist;
        }
        catch (ClassNotFoundException c)
		{
			System.out.println("ClassNotFoundException!");
			c.printStackTrace();
			return null;
		}
		catch (StreamCorruptedException s)
		{
			System.out.println("StreamCorruptedException!");
			s.printStackTrace();
			return null;
		}
		catch (InvalidClassException i)
		{
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return null;
		}
		catch (OptionalDataException o)
		{
			System.out.println("OptionalDataException!");
			o.printStackTrace();
			return null;
		}
		catch (IOException i)
		{
			System.out.println("IOException!");
			i.printStackTrace();
			return null;
		}
    }
    
    public static boolean writeStaffList(StaffList writelist)
    {

		if (writelist == null)
		{
			return false;
		}
		
		if (!Files.exists(Paths.get("savedstates/StaffList.txt")))
		{
			new File("savedstates").mkdir();
		}
		
		try
		{
			FileOutputStream fileOut = new FileOutputStream ("savedstates/StaffList.txt");
			ObjectOutputStream objectOut = new ObjectOutputStream (fileOut);
			
			objectOut.writeObject(writelist);
			
			objectOut.close();
			fileOut.close();
			
			return true;
		}
		catch (InvalidClassException i)
		{
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return false;
		}
		catch (NotSerializableException n)
		{
			System.out.println("NotSerializableException!");
			n.printStackTrace();
			return false;
		}
		catch (IOException i)
		{
			System.out.println("IOException!");
			i.printStackTrace();
			return false;
		}
    }

    public static TableList readTableList()
    {
        try
        {
            FileInputStream inputfile = new FileInputStream("savedstates/TableList.txt");
            ObjectInputStream inputobject = new ObjectInputStream (inputfile);

            TableList inputlist = (TableList) inputobject.readObject();

            inputfile.close();
            inputobject.close();
            if(inputlist==null) return new TableList();
            return inputlist;
        }
        catch (ClassNotFoundException c)
		{
			System.out.println("ClassNotFoundException!");
			c.printStackTrace();
			return null;
		}
		catch (StreamCorruptedException s)
		{
			System.out.println("StreamCorruptedException!");
			s.printStackTrace();
			return null;
		}
		catch (InvalidClassException i)
		{
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return null;
		}
		catch (OptionalDataException o)
		{
			System.out.println("OptionalDataException!");
			o.printStackTrace();
			return null;
		}
		catch (IOException i)
		{
			System.out.println("IOException!");
			i.printStackTrace();
			return null;
		}
    }
    
    public static boolean writeTableList(TableList writelist)
    {

		if (writelist == null)
		{
			return false;
		}
		
		if (!Files.exists(Paths.get("savedstates/TableList.txt")))
		{
			new File("savedstates").mkdir();
		}
		
		try
		{
			FileOutputStream fileOut = new FileOutputStream ("savedstates/TableList.txt");
			ObjectOutputStream objectOut = new ObjectOutputStream (fileOut);
			
			objectOut.writeObject(writelist);
			
			objectOut.close();
			fileOut.close();
			
			return true;
		}
		catch (InvalidClassException i)
		{
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return false;
		}
		catch (NotSerializableException n)
		{
			System.out.println("NotSerializableException!");
			n.printStackTrace();
			return false;
		}
		catch (IOException i)
		{
			System.out.println("IOException!");
			i.printStackTrace();
			return false;
		}
    }

    public static TimeHandler readTimeHandler()
    {
        try
        {
            FileInputStream inputfile = new FileInputStream("savedstates/TimeHandler.txt");
            ObjectInputStream inputobject = new ObjectInputStream (inputfile);

            TimeHandler inputlist = (TimeHandler) inputobject.readObject();

            inputfile.close();
            inputobject.close();
            if(inputlist==null) return new TimeHandler();
            return inputlist;
        }
        catch (ClassNotFoundException c)
		{
			System.out.println("ClassNotFoundException!");
			c.printStackTrace();
			return null;
		}
		catch (StreamCorruptedException s)
		{
			System.out.println("StreamCorruptedException!");
			s.printStackTrace();
			return null;
		}
		catch (InvalidClassException i)
		{
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return null;
		}
		catch (OptionalDataException o)
		{
			System.out.println("OptionalDataException!");
			o.printStackTrace();
			return null;
		}
		catch (IOException i)
		{
			System.out.println("IOException!");
			i.printStackTrace();
			return null;
		}
    }
    
    public static boolean writeTimeHandler(TimeHandler writelist)
    {

		if (writelist == null)
		{
			return false;
		}
		
		if (!Files.exists(Paths.get("savedstates/TimeHandler.txt")))
		{
			new File("savedstates").mkdir();
		}
		
		try
		{
			FileOutputStream fileOut = new FileOutputStream ("savedstates/TimeHandler.txt");
			ObjectOutputStream objectOut = new ObjectOutputStream (fileOut);
			
			objectOut.writeObject(writelist);
			
			objectOut.close();
			fileOut.close();
			
			return true;
		}
		catch (InvalidClassException i)
		{
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return false;
		}
		catch (NotSerializableException n)
		{
			System.out.println("NotSerializableException!");
			n.printStackTrace();
			return false;
		}
		catch (IOException i)
		{
			System.out.println("IOException!");
			i.printStackTrace();
			return false;
		}
    }


    public static Menu readMenu()
    {
        try
        {
            FileInputStream inputfile = new FileInputStream("savedstates/Menu.txt");
            ObjectInputStream inputobject = new ObjectInputStream (inputfile);

            Menu inputlist = (Menu) inputobject.readObject();

            inputfile.close();
            inputobject.close();
            if(inputlist==null) inputlist = new Menu();
            return inputlist;
        }
        catch (ClassNotFoundException c)
		{
			System.out.println("ClassNotFoundException!");
			c.printStackTrace();
			return null;
		}
		catch (StreamCorruptedException s)
		{
			System.out.println("StreamCorruptedException!");
			s.printStackTrace();
			return null;
		}
		catch (InvalidClassException i)
		{
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return null;
		}
		catch (OptionalDataException o)
		{
			System.out.println("OptionalDataException!");
			o.printStackTrace();
			return null;
		}
		catch (IOException i)
		{
			System.out.println("IOException!");
			i.printStackTrace();
			return null;
		}
    }
    
    public static boolean writeMenu(Menu writelist)
    {

		if (writelist == null)
		{
			return false;
		}
		
		if (!Files.exists(Paths.get("savedstates/Menu.txt")))
		{
			new File("savedstates").mkdir();
		}
		
		try
		{
			FileOutputStream fileOut = new FileOutputStream ("savedstates/Menu.txt");
			ObjectOutputStream objectOut = new ObjectOutputStream (fileOut);
			
			objectOut.writeObject(writelist);
			
			objectOut.close();
			fileOut.close();
			
			return true;
		}
		catch (InvalidClassException i)
		{
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return false;
		}
		catch (NotSerializableException n)
		{
			System.out.println("NotSerializableException!");
			n.printStackTrace();
			return false;
		}
		catch (IOException i)
		{
			System.out.println("IOException!");
			i.printStackTrace();
			return false;
		}
    }

    public static RevenueReport readRevenueReport()
    {
        try
        {
            FileInputStream inputfile = new FileInputStream("savedstates/RevenueReport.txt");
            ObjectInputStream inputobject = new ObjectInputStream (inputfile);

            RevenueReport inputlist = (RevenueReport) inputobject.readObject();

            inputfile.close();
            inputobject.close();
            if(inputlist==null) return new RevenueReport();
            return inputlist;
        }
        catch (ClassNotFoundException c)
		{
			System.out.println("ClassNotFoundException!");
			c.printStackTrace();
			return null;
		}
		catch (StreamCorruptedException s)
		{
			System.out.println("StreamCorruptedException!");
			s.printStackTrace();
			return null;
		}
		catch (InvalidClassException i)
		{
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return null;
		}
		catch (OptionalDataException o)
		{
			System.out.println("OptionalDataException!");
			o.printStackTrace();
			return null;
		}
		catch (IOException i)
		{
			System.out.println("IOException!");
			i.printStackTrace();
			return null;
		}
    }
    
    public static boolean writeRevenueReport(RevenueReport writelist)
    {

		if (writelist == null)
		{
			return false;
		}
		
		if (!Files.exists(Paths.get("savedstates/RevenueReport.txt")))
		{
			new File("savedstates").mkdir();
		}
		
		try
		{
			FileOutputStream fileOut = new FileOutputStream ("savedstates/RevenueReport.txt");
			ObjectOutputStream objectOut = new ObjectOutputStream (fileOut);
			
			objectOut.writeObject(writelist);
			
			objectOut.close();
			fileOut.close();
			
			return true;
		}
		catch (InvalidClassException i)
		{
			System.out.println("InvalidClassException!");
			i.printStackTrace();
			return false;
		}
		catch (NotSerializableException n)
		{
			System.out.println("NotSerializableException!");
			n.printStackTrace();
			return false;
		}
		catch (IOException i)
		{
			System.out.println("IOException!");
			i.printStackTrace();
			return false;
		}
    }
}