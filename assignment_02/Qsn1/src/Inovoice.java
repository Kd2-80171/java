/*Q1. Create a class called Invoice that a hardware store might use to represent an invoice for an item
sold at the store. An Invoice should include four pieces of information as fields—a part number
(type String), a part description (type String), a quantity of the item being purchased (type int) and a
price per item (double). Your class should have a constructor
that initializes the four instance variables. Provide a set and a get method for each instance variable.
calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
amount as a double value.
If the quantity is not positive, it should be set to 0.
If the price per item is not positive, it should be set to 0.0.
Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.*/


class Inovoice {

	private String partnumber;
	private String partDescription ;
	private int quantity ;
	private double pricePeritem;
	
	public Inovoice (String Partnumber , String partDescription ,int quantity ,double pricePeritem)
	{
		this.partnumber = partnumber;
		this.partDescription = partDescription;
		//setquantity(quantity); //not negative 
		//setpricePeritem(pricePeritem)
	}

	public String getPartnumber() {
		return partnumber;
	}

	public void setPartnumber(String partnumber) {
		this.partnumber = partnumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity(){
	
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity > 0) {
			this.quantity = quantity;
		}else {
			this.quantity = 0;
		}
		this.quantity = quantity;
	}

	public double getPricePeritem() {
		return pricePeritem;
	}

	public void setPricePeritem(double pricePeritem) {
		if (pricePeritem > 0.0) {
			this.pricePeritem = pricePeritem;
			
		}else {
			this.pricePeritem = 0.0;
		}
		this.pricePeritem = pricePeritem;
	}
	
	
	public double getInvoiceAmount()
	{
		return quantity * pricePeritem;
	}
	
}
