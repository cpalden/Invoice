/**
 * This program demonstrates the invoice classes by printing sample invoice.
 * @author chime
 *
 */

public class InvoicePrinter {
	public static void main(String[] args)
	{
		Address address = new Address("Kijimuna Jewellery Store",
				"200 Jameson Ave", "Toronto", "ON", "123456");
		Invoice invoice = new Invoice(address); 
		invoice.add(new Product("Silver Ring", 45), 3);
		invoice.add(new Product("Silcer Bracelet", 120), 2);
		invoice.add(new Product("Silver Necklace", 125), 2);
		
		System.out.println(invoice.format());
	}
}
