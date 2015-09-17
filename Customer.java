import java.util.ArrayList;

public class Customer {
	private String lastname;
	private String firstname;
	private Address mailingaddress;
	private ArrayList<Account> accounts;
	
	public Customer (String lastname, String firstname, Address mailingaddress) {
		this.lastname = lastname;
		this.firstname = firstname;
		this.mailingaddress = mailingaddress;
		accounts = new ArrayList<Account>();
	}

	public String getLastname() {
		return lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public Address getMailingaddress() {
		return mailingaddress;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}
	
	public boolean addAccount(Account a) {
		return accounts.add(a);
	}
	
	public boolean removeAccount(Account a) {
		for( Account acc : accounts ) {
			if(acc.equals(a)){
				return true;
			}
		}
		return false;
	}
}
