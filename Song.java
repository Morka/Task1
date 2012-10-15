import java.util.Date;

public class Song
{
	private String name;  	//song name
	private int length; 	//length in seconds
	private Date start;	//Date of first appearence in repertoire
	private Date end;	//last Date of the song in repertoire
	
	public Song(String name, int length)
	{
		this.name = name;
		this.length = length;
		this.start = new Date(); //sets current Date
		this.end = null;
	}
	
	public void setDate(Date date)
	{
		this.start = date;
	}
	
	public Date getStartDate()
	{
		return start;
	}
	
	public Date getEndDate()
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


