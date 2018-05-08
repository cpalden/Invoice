/**
 * Describes a product with description and a price.
 * @author chime
 *
 */
public class Product {
	private String description;
	private double price;
	/**
	 * Constructs a product from a description and a price.
	 * @param aDescription the product description.
	 * @param aPrice the product price.
	 */
	public Product(String aDescription, double aPrice)
	{
		description = aDescription;
		price = aPrice;
	}
	/**
    Gets the product's description
    @return the description
  */
  public String getDescription()
  {
	 return description;
  }

  /**
    gets product's price.
    @return the price.
  */
  public double getPrice()
  {
	  return price;
  }
}
