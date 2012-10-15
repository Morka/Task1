import java.util.ArrayList;
import java.util.Calendar;

public class Band {
	
	private ArrayList<Member> memberList = new ArrayList<Member>();
	private ArrayList<Gig> gigList = new ArrayList<Gig>();
	private ArrayList<Rehearsal> rehearsalList = new ArrayList<Rehearsal>();
	private ArrayList<Song> songList = new ArrayList<Song>();
	
	public Band(){
	
	}
	
	/*public void Band(){
		
		
		
	}*/
	
	public void addMember(Member newMember){
		
		this.memberList.add(newMember);
		
	}

	public void addGig(Gig newGig){
		
		this.gigList.add(newGig);
		
	}
	
	public void addRehearsal(Rehearsal newRehearsal){
		
		this.rehearsalList.add(newRehearsal);
		
	}
	
	public void addTrack(Song newSong){
		
		this.songList.add(newSong);
		
	}
	
	public void showRehearsals(Calendar specificDate){
		
		for(Rehearsal r : this.rehearsalList){
			
			//if(r.getDate().)
			
		}
		
	}
	
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
		
	}

}
