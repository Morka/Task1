import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Test {

	public static void main(String[] args){
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		Calendar time3 = Calendar.getInstance();
		Calendar time4 = Calendar.getInstance();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

		
		time1.set(2011, 5, 28);
		time2.set(2010, 6, 23);
		time3.set(2012, 6, 23);
		time4.set(2011, 5, 28);

		Band band = new Band();
		
		Gig gig = new Gig(15, "Wien", time1, 20);
		Rehearsal rehearsal = new Rehearsal(20, "Linz", time1, 300);
		Song song = new Song("Mitt Romney Style", 160);
		Member member = new Member("Mitt Romney", "039394919", "Geige");
		
		band.addEvent(gig);
		band.addEvent(rehearsal);
		band.addTrack(song);
		band.addMember(member);
		
		System.out.println("\nNEW");
		System.out.println("Objekts - toString()");
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
		System.out.println("Solution1: " + band.showRehearsals(time2, time3));
		System.out.println("Solution2: " + band.showRehearsals(time4));
		
	}
}
