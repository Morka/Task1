import java.util.ArrayList;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/*
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public class Band {
	
	private ArrayList<Member> memberList = new ArrayList<Member>(); 
	//private ArrayList<Gig> gigList = new ArrayList<Gig>();
	//private ArrayList<Rehearsal> rehearsalList = new ArrayList<Rehearsal>();
	private ArrayList<Event> eventList = new ArrayList<Event>(); 
	private ArrayList<Song> songList = new ArrayList<Song>();
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

	
	public Band(){
	
	}
	
	/*
	 * Adds new "Member" to "memberList"
	 *
	 * @param newMember Member to be added
	 *
	 */
	public void addMember(Member newMember){
		
		this.memberList.add(newMember);
		
	}
	
	/*
	 * Adds new "Event" to "eventList"
	 *
	 * @param newEvent Event to be added
	 *
	 */
	
	public void addEvent(Event newEvent){
		
		this.eventList.add(newEvent);
		
	}
	
	/*
	 * Adds new "Song" to "songList"
	 *
	 * @param newSong Song to be added
	 *
	 * @return
	 */
	
	public void addTrack(Song newSong){
		
		this.songList.add(newSong);
		
	}
	
	/*
	 * Shows Rehearsals on one specific Date
	 * 
	 * @param specificDate One specific Date
	 *
	 * @return String which contains Rehearsals taking place at the time or null
	 */
 
	public String showRehearsals(Calendar specificDate){
		
		String retString = "";
		
		Calendar newCal = Calendar.getInstance();
		newCal.setTime(specificDate.getTime());
		
		retString = showRehearsals(specificDate, newCal);
		
		return retString;
		
	}
	
	
	/*
	 * Shows Rehearsals in a given time Period
	 * 
	 * @param fromDate, toDate 
	 *
	 * @return String which contains Rehearsals taking place in the time Period or null
	 */
	public String showRehearsals(Calendar fromDate, Calendar toDate){		
		String retString = "";

		fromDate.add(Calendar.DAY_OF_MONTH, -1); 
		toDate.add(Calendar.DAY_OF_MONTH, 1);
		
		for(Event r : this.eventList){
			
			if(r instanceof Rehearsal && (r.getDate().after(fromDate) && r.getDate().before(toDate))) {
				
				retString = retString + r.toString() + "\n";
				
			}
			
		}
		
		return retString;
		
	}
	
	/*
	 * Shows "Gigs" on a specific Date
	 *
	 * @param specificDate One specific Date
	 *
	 * @return String which contains Gigs taking place at that time or null
	 */
	
	public String showGigs(Calendar specificDate){
		
		String retString = "";
		
		retString = showGigs(specificDate, specificDate);
		
		return retString;
		
	}
	
	/*
	 * Shows "Gigs" in a specific Time period
	 *
	 * @param fromDate, toDate 
	 *
	 * @return String which contains Gigs taking place in the specified time period
	 */
	
	public String showGigs(Calendar fromDate, Calendar toDate){
		
		String retString = "";
		fromDate.add(Calendar.DAY_OF_MONTH, -1);
		toDate.add(Calendar.DAY_OF_MONTH, 1);
		
		for(Event r : this.eventList){
			
			if(r instanceof Gig && (r.getDate().after(fromDate) && r.getDate().before(toDate))) {
				
				retString = retString + r.toString() + "\n";
				
			}
			
		}
		
		return retString;
		
	}
	/*
	 * Shows "Events" in a specific Time period
	 *
	 * @param from, to 
	 *
	 * @return String which contains "Events" taking place in the specified time period
	 */
	
	
	public String showEvents(Calendar from, Calendar to){
	
		String retString = "Rehearsals: \n";
		retString = retString + this.showRehearsals(from, to);
		
		retString = retString + "Gigs: \n";
		retString = retString + this.showGigs(from, to);
		
		return retString;
		
	}
	
	/*
	 * Shows "Member" on a specific Date
	 *
	 * @param specificDate
	 *
	 * @return String which contains Members of the Band at a specific Date
	 */
	
	public String showMember(Calendar specificDate){
		
		String retString = "";
		
		for(Member m : this.memberList){
			
			if(m.getEntryDate().before(specificDate) && (m.getExitDate().after(specificDate) || m.getExitDate() == null)) {
				
				retString = retString + m.toString() + "\n";
				
			}
			
		}
		
		return retString;
		
	}
	
	/*
	 * Shows "Songs" in a specific Time period
	 *
	 * @param fromDate, toDate 
	 *
	 * @return String which contains "Songs" playable in a specific Time Period
	 */
	
	public String showSongs(Calendar fromDate, Calendar toDate){
		
		String retString = "";
		fromDate.add(Calendar.DAY_OF_MONTH, -1);
		toDate.add(Calendar.DAY_OF_MONTH, 1);
		
		for(Song r : this.songList){
			
			if(r.getEndDate() == null && (r.getStartDate().after(fromDate) && r.getStartDate().before(toDate))) {
				
				retString = retString + r.toString() + "\n";
				
			}
			else if(r.getEndDate() != null && (r.getStartDate().after(fromDate) && r.getEndDate().before(toDate))){
				retString = retString + r.toString() + "\n";
			}
			
		}
		
		return retString;
		
	}
	
	/*
	 * Computes the sum of Costs
	 *
	 * @param fromDate, toDate 
	 *
	 * @return integer which contains the sum of Costs
	 */
	
	public int sumOfCosts(Calendar fromDate, Calendar toDate){
		int sumCosts = 0;
				
		fromDate.add(Calendar.DAY_OF_MONTH, -1);
		toDate.add(Calendar.DAY_OF_MONTH, 1);
		
		for(Event r : this.eventList){
			if(r instanceof Rehearsal && (r.getDate().after(fromDate) && r.getDate().before(toDate))) {
				sumCosts += ((Rehearsal)r).getRent();
			}
			
		}
		
		return sumCosts;
	}
	
	/*
	 * Computes the sum of Earnings
	 *
	 * @param fromDate, toDate 
	 *
	 * @return integer which contains the sum of Earnings
	 */
	
	public int sumOfEarnings(Calendar fromDate, Calendar toDate){
		int sumEarnings = 0;
		
		fromDate.add(Calendar.DAY_OF_MONTH, -1);
		toDate.add(Calendar.DAY_OF_MONTH, 1);
		
		for(Event r : this.eventList){
			if(r instanceof Gig && (r.getDate().after(fromDate) && r.getDate().before(toDate))){
				sumEarnings += ((Gig)r).getFee();
			}
		}
		
		return sumEarnings;
	}
	
	/*
	 * Computes the sum of Earnings minus Costs
	 *
	 * @param fromDate, toDate 
	 *
	 * @return integer which contains the sum of Earnings minus Costs
	 */
	
	public int sumOfAll(Calendar fromDate, Calendar toDate){
		int sumAll = 0;
		
		sumAll = sumOfEarnings(fromDate, toDate);
		
		fromDate.add(Calendar.DAY_OF_MONTH, 1);
		toDate.add(Calendar.DAY_OF_MONTH, -1);
		
		sumAll -= sumOfCosts(fromDate, toDate);
		
		return sumAll;
	}

}
