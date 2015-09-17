import java.util.Date;

public class MeterReading {
	private float reading;
	private Date date;
	private String flag;
	private Meter meter;
	
	public MeterReading(float reading, Date date, String flag, Meter meter) {
		this.reading = reading;
		this.date = date;
		this.flag = flag;
		this.meter = meter;
	}

	public float getReading() {
		return reading;
	}

	public Date getDate() {
		return date;
	}

	public String getFlag() {
		return flag;
	}

	public Meter getMeter() {
		return meter;
	}
	

}
