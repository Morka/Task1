import java.util.Calendar;
import java.text.SimpleDateFormat;

/*
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public class Test {

	public static void main(String[] args){
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		Calendar time3 = Calendar.getInstance();
		Calendar time4 = Calendar.getInstance();
		Calendar time5 = Calendar.getInstance();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

		
		time1.set(2009, 5, 28);
		time2.set(2011, 0, 23);
		time3.set(2011, 0, 23);
		time4.set(2012, 5, 28);
		time5.set(2012, 11, 23);

		Band band = new Band();
		
		Gig gig = new Gig(15, "Wien", time3, 20);
		Rehearsal rehearsal = new Rehearsal(20, "Linz", time3, 300);
		Song song = new Song("Mitt Romney Style", 160);
		Member member = new Member("Mitt Romney", "039394919", "Geige");
		
		band.addEvent(gig);
		band.addEvent(rehearsal);
		band.addTrack(song);
		band.addMember(member);
		
		System.out.println("\n\n++++Objekts - toString()++++");
		System.out.println("gig: " + gig);
		System.out.println("rehearsal: " + rehearsal);
		System.out.println("song: " + song);
		System.out.println("member: " + member);
		
		gig.setDate(time2);
		song.setDate(time2);
		
		System.out.println('\n'+ "++++time Changed+++++");
		System.out.println("Gig: " + gig);
		System.out.println("Song: " + song);
		
		System.out.println('\n' + "++++Specific Rehearsals++++");
		System.out.println("Solution1: " + band.showRehearsals(time1, time5));
		System.out.println("Solution2: " + band.showRehearsals(time2));
		
		Gig gig2 = new Gig(20,"Linz", time2, 30);
		Gig gig3 = new Gig(23, "Bregenz", time4, 3000);
		band.addEvent(gig2);
		band.addEvent(gig3);
		
		System.out.println("++++Specific Gigs++++");	
		System.out.println("Gigs from 2009 to 2012:");
		System.out.println(band.showGigs(time1,time5));
		
		System.out.println("++++Specific Events++++");
		System.out.println("Events from 2011 to 2012");
		System.out.println(band.showEvents(time2, time5));
		
		Song song2 = new Song("Melody Dean", 200);
		band.addTrack(song2);
		
		System.out.println("++++Specific Songs++++");
		System.out.println("Songs from 2009 to 2012");
		System.out.println(band.showSongs(time1,time5));
		
	}
}
