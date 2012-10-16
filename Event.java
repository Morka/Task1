import java.util.Calendar;
import java.text.SimpleDateFormat;

/*
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public abstract class Event{
	
	private int duration; //duration of the Event
	private String location; //location of the Event
	private Calendar date; //date AND time of the Event
	
	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

	
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
