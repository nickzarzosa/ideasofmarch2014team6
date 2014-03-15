package monterey_housing.ideasofmarch2014team6;

public class Rental {
	private String city;
	private String address;
	private String numBedrooms;
	private String phoneNum;
	private String rent;
	private String otherInfo;
	
	/**
	 * default constructor
	 */
	public Rental(){
		
	}
	
	/**
	 * Alternate Constructor with all parameters
	 * @param city
	 * @param address
	 * @param numBedrooms
	 * @param rent
	 * @param phoneNum
	 * @param otherInfo
	 */
	public Rental(String city, String address, String numBedrooms, String rent, String phoneNum, String otherInfo){
		this.city = city;
		this.address = address;
		this.numBedrooms = numBedrooms;
		this.rent = rent;
		this.phoneNum = phoneNum;
		this.otherInfo = otherInfo;
	}
}
