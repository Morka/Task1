import java.util.Date;

public class Rehearsal extends Event{
	
	private int rent;

	public Rehearsal(int duration, String location, Date date, int rent){
		super(duration, location, date);
		
		this.rent = rent;
	}
	
	public void setRent(int rent){
		this.rent = rent;
	}
	
	public int getRent(){
		return rent;
	}
	
	public String toString(){
		return super.toString() + ", Rent: " + rent;
	}
}
