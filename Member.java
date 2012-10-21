import java.util.Calendar;

/*
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public class Member {
	
	private String name, telNr, instrument;
	Calendar enteringDate, exitDate;
	
	public Member(String memberName, String telNumber, String instrument){
		
		this.name = memberName;
		this.telNr = telNumber;
		this.instrument = instrument;
		this.enteringDate = Calendar.getInstance();
		
	}
	
	/*
	 * sets the "exitDate" of the member to the current date
	 *
	 */
	
	public void memberExit(){
		
		this.exitDate = Calendar.getInstance();
		
	}
	
	/*
	 * Gives back a the "enteringDate" of the Member
	 *
	 * @return Calendar
	 */
	
	public Calendar getEntryDate(){
		
		return this.enteringDate;
		
	}
	
	/*
	 * Gives back a the "exitDate" of the Member
	 *
	 * @return Calendar
	 */
	
	public Calendar getExitDate(){
		
		return this.exitDate;
		
	}
	
	public String toString(){
		return "Name: " + name + ", Instrument: " + instrument;
	}

}
