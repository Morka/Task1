import java.util.Calendar;

/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public class Rehearsal extends Event{
	
	private int rent;

	public Rehearsal(int duration, String location, Calendar date, int rent){
		super(duration, location, date);
		
		this.rent = rent;
	}
	
	/**
	 * sets the "rent" of the Rehearsal
	 *
	 * @param rent 
	 *
	 */
	
	public void setRent(int rent){
		this.rent = rent;
	}
	
	/**
	 * gives back rent
	 *
	 * @return integer that contains the rent
	 */
	
	public int getRent(){
		return rent;
	}
	
	public String toString(){
		return super.toString() + ", Rent: " + rent;
	}
}
