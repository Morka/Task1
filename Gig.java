import java.util.Date;

public class Gig extends Event{
	
	private int fee;
	
	public Gig(int duration, String location, Date date, int fee){
		super(duration, location, date);
		
		this.fee = fee;
	}
	
	public int getFee(){
		return fee;
	}
	
	public void setFee(int fee){
		this.fee = fee;
	}
	/*
	public String toString(){
		return location + ";" + duration + ";" + date + ";" + fee;
	}*/
	
	public String toString(){
		return super.toString() + ", Fee: " + fee;
	}
}
