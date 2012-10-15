import java.util.Calendar;


public class Member {
	
	private String name, telNr, instrument;
	Calendar enteringDate, exitDate;
	
	public Member(String memberName, String telNumber, String instrument){
		
		this.name = memberName;
		this.telNr = telNumber;
		this.instrument = instrument;
		this.enteringDate = Calendar.getInstance();
		
	}
	
	public void memberExit(){
		
		this.exitDate = Calendar.getInstance();
		
	}
	
	public Calendar getEntryDate(){
		
		return this.enteringDate;
		
	}
	
	public Calendar getExitDate(){
		
		return this.exitDate;
		
	}
	
	public String toString(){
		return "Name: " + name + ", Instrument: " + instrument;
	}

}
