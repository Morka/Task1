import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public abstract class Event{
	
	private int duration; //duration of the Event
	private String location; //location of the Event
	private Calendar date; //date AND time of the Event
	
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

	
	public Event(int duration, String location, Calendar date){
		this.duration = duration;
		this.location = location;
		this.date = date;
	}
	
	/**
	 * Gives back the "location" of the Event
	 *
	 * @param  
	 *
	 * @return String which contains the location
	 */
	
	public String getLocation(){
		return location;
	}
	
	/**
	 * Gives back the "duration" of the Event
	 *
	 * @param  
	 *
	 * @return integer which gives back the Duration
	 */
	
	public int getDuration(){
		return duration;
	}
	
	/**
	 * Sets "date" of the Event
	 *
	 * @param date date of the event 
	 */
	
	public void setDate(Calendar date){
		this.date = date;
	}	
	
	/**
	 * Gives back the "date" of the Event
	 *
	 * @param  
	 *
	 * @return Calendar which contains the date
	 */
	
	public Calendar getDate(){
		return date;
	}
	
	public String toString(){
		return "Location: " + location + ", Duration: " + duration + ", Date: " + dateFormat.format(date.getTime());
	}
	
}
