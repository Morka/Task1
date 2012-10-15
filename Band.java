import java.util.ArrayList;
import java.util.Calendar;
import java.text.SimpleDateFormat;


public class Band {
	
	private ArrayList<Member> memberList = new ArrayList<Member>();
	//private ArrayList<Gig> gigList = new ArrayList<Gig>();
	//private ArrayList<Rehearsal> rehearsalList = new ArrayList<Rehearsal>();
	private ArrayList<Event> eventList = new ArrayList<Event>();
	private ArrayList<Song> songList = new ArrayList<Song>();
	
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

	
	public Band(){
	
	}
	
	public void addMember(Member newMember){
		
		this.memberList.add(newMember);
		
	}

	/*public void addGig(Gig newGig){
		
		this.gigList.add(newGig);
		
	}*
	
	public void addRehearsal(Rehearsal newRehearsal){
		
		this.rehearsalList.add(newRehearsal);
		
	}*/
	
	public void addEvent(Event newEvent){
		
		this.eventList.add(newEvent);
		
	}
	
	public void addTrack(Song newSong){
		
		this.songList.add(newSong);
		
	}
	
	public String showRehearsals(Calendar specificDate){
		
		String retString = "";
		
		Calendar newCal = Calendar.getInstance();
		newCal.setTime(specificDate.getTime());
		
		retString = showRehearsals(specificDate, newCal);
		
		return retString;
		
	}
	
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
	
	public String showGigs(Calendar specificDate){
		
		String retString = "";
		
		retString = showGigs(specificDate, specificDate);
		
		return retString;
		
	}
	
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
	
	
	public String showEvents(Calendar from, Calendar to){
	
		String retString = "Rehearsals: \n";
		retString = retString + this.showRehearsals(from, to);
		
		retString = retString + "Gigs: \n";
		retString = retString + this.showGigs(from, to);
		
		return retString;
		
	}
	
	public String showMember(Calendar specificDate){
		
		String retString = "";
		
		for(Member m : this.memberList){
			
			if(m.getEntryDate().before(specificDate) && (m.getExitDate().after(specificDate) || m.getExitDate() == null)) {
				
				retString = retString + m.toString() + "\n";
				
			}
			
		}
		
		return retString;
		
	}

}
