import java.util.ArrayList;

public class Address {
	private String street;
	private int number;
	private String zip;
	private String buildingtype;
	private ArrayList<Meter> meters;
	private Account account;
	
	public Address (String street, int number, String zip, String buildingtype) {
		this.street = street;
		this.number = number;
		this.zip = zip;
		this.buildingtype = buildingtype;
		meters = new ArrayList<Meter>();
	}

	public String getStreet() {
		return street;
	}

	public int getNumber() {
		return number;
	}

	public String getZip() {
		return zip;
	}

	public String getBuildingtype() {
		return buildingtype;
	}

	public Account getAccount() {
		return account;
	}

	public ArrayList<Meter> getMeters() {
		return meters;
	}
	
	public boolean removeMeter(String id) {
		for(Meter m : meters) {
			if( m.getID().equals(id)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean addMeter( Meter m ) {
		return meters.add(m);
	}
	
	public void setAccount(Account account) {
		this.account = account;
	}
	
}
