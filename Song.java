import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Song
{
	private String name;  	//song name
	private int length; 	//length in seconds
	private Calendar start;	//Date of first appearence in repertoire
	private Calendar end;	//last Date of the song in repertoire
	
	public Song(String name, int length)
	{
		this.start = Calendar.getInstance(); //sets current Date
		
		this.name = name;
		this.length = length;
		this.end = null;
	}
	
	public void setDate(Calendar date)
	{
		this.start = date;
	}
	
	public Calendar getStartDate()
	{
		return start
	}
	
	public Calendar getEndDate()
	{
		return end;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getLength()
	{
		return length;
	}	
	
	public String toString()
	{
		return "name: " + name + ", length: " + length;
	}
}


