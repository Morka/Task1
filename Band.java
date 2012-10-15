import java.util.ArrayList;
import java.util.Calendar;

public class Band {
	
	private ArrayList<Member> memberList = new ArrayList<Member>();
	//private ArrayList<Gig> gigList = new ArrayList<Gig>();
	//private ArrayList<Rehearsal> rehearsalList = new ArrayList<Rehearsal>();
	private ArrayList<Event> eventList = new ArrayList<Event>();
	private ArrayList<Song> songList = new ArrayList<Song>();
	
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
		
		retString = showRehearsals(specificDate, specificDate);
		
		return retString;
		
	}
	
	public String showRehearsals(Calendar fromDate, Calendar toDate){
		
		String retString = "";
		fromDate.add(Calendar.DAY_OF_MONTH, -1);
		toDate.add(Calendar.DAY_OF_MONTH, 1);
		
		for(Event r : this.eventList){
			
			if(r instanceof Rehearsal && (r.getDate().after(fromDate) && r.getDate().before(toDate))) {
				
				retString = retString + r.toString();
				
			}
			
		}
		
		return retString;
		
	}
	/*
	public void showRehearsals(Calendar from, Calendar to){
		
		//String outputString = "";
		
		for(Rehearsal r : this.rehearsalList){
			
			//if() wenn nach from und vor to ist -> to string
			
		}
		
	}
	
	public void showGigs(Calendar from, Calendar to){
		
		//for each gleich wie bei rehearsals
		
	}
	
	public void showEvents(Calendar from, Calendar to){
	
		//rufe andere methoden auf
		
	}*/

}
