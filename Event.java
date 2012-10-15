import java.util.Calendar;
import java.text.SimpleDateFormat;

public abstract class Event{
	
	protected int duration; //duration of the Event
	
	protected String location; //location of the Event
	
	protected Calendar date; //date AND time of the Event *SimpleDateFormat*
	
	protected SimpleDateFormat dateFormat = new SimpleDateFormat("dd.mm.yyyy");

	
	public Event(int duration, String location, Calendar date){
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
	
	public void setDate(Calendar date){
		this.date = date;
	}	
	
	public Calendar getDate(){
		return date;
	}
	
	public String toString(){
		return "Location: " + location + ", Duration: " + duration + ", Date: " + dateFormat.format(date.getTime());
	}
	
}
