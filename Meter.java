import java.util.ArrayList;

public class Meter {
	private String id; 
	private ArrayList<MeterReading> readings;
	private String brand;
	private String type;
	private String loc;
	private Address adr;
	
	public Meter ( String id, String brand, String type ) {
		this.id = id;
		this.brand = brand;
		this.type = type;
		readings = new ArrayList<MeterReading>();
	}

	public String getID() {
		return id;
	}

	public ArrayList<MeterReading> getReadings() {
		return readings;
	}

	public String getBrand() {
		return brand;
	}

	public String getType() {
		return type;
	}

	public String getLocation() {
		return loc;
	}

	public Address getAddress() {
		return adr;
	}
	
	public MeterReading getCurrentReading(){
		return readings.get(readings.size() - 1);
	}
	
	public void addReading(MeterReading m) {
		readings.add(m);
	}
	
	public void setLocation(Address a, String n) {
		
	}
}
