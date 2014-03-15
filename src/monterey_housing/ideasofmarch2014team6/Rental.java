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
	
	//-------------
	//mutator methods
	//------------
	
	/**
	 * sets the city
	 * @param city
	 */
	public void setCity(String city){
		this.city = city;
	}
	
	/**
	 * sets the address
	 * @param address
	 */
	public void setAddress(String address){
		this.address = address;
	}
	
	/**
	 * sets the number of bedrooms
	 * @param numBedrooms
	 */
	public void setNumBedrooms(String numBedrooms){
		this.numBedrooms = numBedrooms;
	}
	/**
	 * sets the rent 
	 * @param rent
	 */
	public void setRent(String rent){
		this.rent = rent;
	}
	
	/**
	 * sets the phone number
	 * @param phoneNum
	 */
	public void setPhoneNum(String phoneNum){
		this.phoneNum = phoneNum;
	}
	
	/**
	 * sets the other info field
	 * @param otherInfo
	 */
	public void setOtherInfo(String otherInfo){
		this.otherInfo = otherInfo;
	}
	
	//-------------
	// accessor methods
	//--------------
	
	/**
	 * returns the city
	 * @return city
	 */
	public String getCity(){
		return this.city;
	}
	
	/**
	 * returns the address
	 * @return address
	 */
	public String getAddress(){
		return this.address;
	}
	
	/**
	 * returns number of bedrooms
	 * @return numBedrooms
	 */
	public String getNumBedrooms(){
		return this.numBedrooms;
	}
	
	
	/**
	 * returns the rent
	 * @return rent
	 */
	public String getRent(){
		return this.rent;
	}
	
	/**
	 * returns the phone number
	 * @return phoneNum
	 */
	public String getPhoneNum(){
		return this.phoneNum;
	}
	
	/**
	 * returns the other info field
	 * @return otherInfo
	 */
	public String getOtherInfo(){
		return this.otherInfo;
	}
}
