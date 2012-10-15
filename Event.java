import java.util.Date;

public abstract class Event{
	
	protected int duration; //duration of the Event
	
	protected String location; //location of the Event
	
	protected Date date; //date AND time of the Event *SimpleDateFormat*
	
	public Event(int duration, String location, Date date){
		this.duration = duration;
		this.location = location;
		this.date = date;
	}
	
	/*
	public void setLocation(String location){
		this.location = location;
	}*/
	
	public String getLocation(){
		return location;
	}
	/*
	public void setDuration(int duration){
		this.duration = duration;
	}*/
	
	public int getDuration(){
		return duration;
	}
	
	public void setDate(Date date){
		this.date = date;
	}	
	
	public Date getDate(){
		return date;
	}
	
	public String toString(){
		return "Location: " + location + ", Duration: " + duration + ", Date: " + date;
	}
	
}
