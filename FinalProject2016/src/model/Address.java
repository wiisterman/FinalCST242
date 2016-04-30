package model;

public class Address 
{

	private String streetNum;
	private String streetName;
	private String city;
	private String state;
	private String zip;
	
	
	
	
	public Address(String streetNum, String streetName, String city, String state, String zip) {
		super();
		this.streetNum = streetNum;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	public String getStreetNum() {
		return streetNum;
	}
	public String getStreetName() {
		return streetName;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getZip() {
		return zip;
	}
	public void setStreetNum(String streetNum) {
		this.streetNum = streetNum;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [streetNum=" + streetNum + ", streetName=" + streetName + ", city=" + city + ", state=" + state
				+ ", zip=" + zip + "]";
	}
	
	
}
