
public class InovoiceTest {

	
	public static void main(String [] ergs) {
		Inovoice invoice1 = new Inovoice("12345" ,"widget" , 5 ,9.99);
		Inovoice invoice2 = new Inovoice("23456" ,"gadget" , 7 ,10.99);
		
		System.out.println("Invoice 1");
		displayInvoice(invoice1);

		System.out.println("Invoice 2");
		displayInvoice(invoice2);
	}
	
	


	public static void displayInvoice(Inovoice invoice) {
		System.out.println("partnumber =" + invoice.getPartnumber());
		System.out.println("Quantity =" + invoice.getQuantity());
		System.out.println("partdiscription =" + invoice.getPartDescription());
		System.out.println("price oer item =" + invoice.getPricePeritem());
		System.out.println("invoice amount =" + invoice.getInvoiceAmount());
	}
}
