/**
 * Describes a mailing address.
 * @author chime
 *
 */
public class Address {
	private String name;
	private String street;
	private String city;
	private String province;
	private String zip;
	/**
	 * Constructs a mailing address.
	 * @param aName the recipient name.
	 * @param aStreet the street.
	 * @param aCity the city.
	 * @param aProvince the province.
	 * @param aZip the zip code.
	 */
	public Address(String aName,String aStreet, 
			String aCity, String aProvince, String aZip)
	{
		name = aName;
		street = aStreet;
		city = aCity;
		province = aProvince;
		zip = aZip;
	}
	
	/**
    formats the address.
    @return the address as a string with 3 lines.
  */
  public String format()
  {
	  return name + "\n" + street + "\n"
			  + city + ", " + province + " " +zip;
  }
}
