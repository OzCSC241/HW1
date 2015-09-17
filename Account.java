import java.util.ArrayList;

public class Account {
	private String accnum;
	private Customer customer;
	private double bal;
	private ArrayList<Address> addresses;
	
	public Account (String accnum, Customer customer) {
		this.accnum = accnum;
		this.customer = customer;
		bal = 0;
		addresses = new ArrayList<Address>();
	}

	public String getAccnum() {
		return accnum;
	}

	public Customer getCustomer() {
		return customer;
	}

	public double getBal() {
		return bal;
	}

	public ArrayList<Address> getAddresses() {
		return addresses;
	}
	
	public boolean addAddress(Address a) {
		return addresses.add(a);
	}
	
	public boolean removeAddress(Address a) {
		for( Address adr : addresses ) {
			if (adr.equals(a)) {
				return true;
			}
		}
		return false;
	}
}
