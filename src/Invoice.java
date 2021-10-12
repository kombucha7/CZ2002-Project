import java.util.Date;
import java.util.ArrayList;


public class Invoice {

	private final static double TAXRATE = 0.17;
	private Order order;
	private int invoicenum;
	private double tax;
	private double finalprice;
	private Date invoicetime;
	private ArrayList<Fooditem> items;


	public Invoice(Order order)
	{
		this.order = order;
		Date invoicetime = new Date();
		invoicenum = invoicetime.hashCode();
		tax = 0;
		finalprice = 0;
		items = this.order.getOrderlist();
	}

	public void calculateInvoice() {
		// TODO - implement Invoice.calculateInvoice
		tax = this.order.getTotalprice() * TAXRATE;
		finalprice = this.order.getTotalprice() * (TAXRATE + 1);
	}

	public void printInvoice() {
		// TODO - implement Invoice.printInvoice
		System.out.println("		temp restaurant name		");
		System.out.println("************************************");
		System.out.println("Date & Time: " + this.invoicetime);
		System.out.println("Invoice Number: " + this.invoicenum);
		System.out.println("Table Number: " + this.order.getTableID());
		System.out.println("Staff ID: " + this.order.getStaffID());
		System.out.println("Items ordered: ");
		for(int i=0; i<items.size(); i++)
		{
			System.out.printf("%s			%d\n", items.get(i).getName(), items.get(i).getPrice());
		}
		System.out.println("Subtotal: " + this.order.getTotalprice());
		System.out.println("GST: " + tax);
		System.out.println("Total: " + finalprice);
	}

}