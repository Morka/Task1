import java.util.Calendar;

/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public class Song
{
	private String name;  	//song name
	private int length; 	//length in seconds
	private Calendar start;	//Date of first appearence in repertoire
	private Calendar end;	//last Date of the song in repertoire
	
	public Song(String name, int length)
	{
		this.name = name;
		this.length = length;
		this.start = Calendar.getInstance(); //sets current Date
		this.end = null;
	}
	
	/**
	 * sets "end" date
	 *
	 * @param date 
	 *
	 * @return Calendar
	 */
	
	public void setDate(Calendar date)
	{
		this.end = date;
	}
	
	/**
	 * gives back the "start" date
	 *
	 * @param 
	 *
	 * @return Calendar containing the start date
	 */
	
	public Calendar getStartDate()
	{
		return start;
	}
	
	/**
	 * gives back the "end" date
	 *
	 * @param 
	 *
	 * @return Calendar containing the end date
	 */
	 
	public Calendar getEndDate()
	{
		return end;
	}
	
	/**
	 * gives back the "name" of the Song
	 *
	 * @param 
	 *
	 * @return String which contains the name
	 */
	
	public String getName()
	{
		return name;
	}
	
	/**
	 * gives back the "length" of the Song
	 *
	 * @param 
	 *
	 * @return integer containing the length
	 */
	
	public int getLength()
	{
		return length;
	}	
	
	public String toString()
	{
		return "name: " + name + ", length: " + length;
	}
}


