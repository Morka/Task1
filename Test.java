import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Test {

	public static void main(String[] args){
<<<<<<< HEAD
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.mm.dd");
=======
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.mm.yyyy");
>>>>>>> added Test cases

		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		Calendar time3 = Calendar.getInstance();

		
		time1.set(2011, 05, 30);
		time2.set(2010, 06, 23);
		time3.set(2012, 06, 23);
<<<<<<< HEAD
		
=======

>>>>>>> Specific Rehearsal not working
		
		Band band = new Band();
		
		Gig gig = new Gig(15, "Wien", time1, 20);
		Rehearsal rehearsal = new Rehearsal(20, "Linz", time1, 300);
		Song song = new Song("Mitt Romney Style", 160);
		Member member = new Member("Mitt Romney", "039394919", "Geige");
		
		band.addEvent(gig);
		band.addEvent(rehearsal);
		band.addTrack(song);
		band.addMember(member);
		
		System.out.println("Objekts - toString()");
		System.out.println(gig);
		System.out.println(rehearsal);
		System.out.println(song);
		System.out.println(member);
		
		gig.setDate(time2);
		song.setDate(time2);
		
		System.out.println('\n'+ "time Changed");
		System.out.println(gig);
		System.out.println(dateFormat.format(song.getEndDate().getTime()));
		System.out.println(song);
<<<<<<< HEAD
		
		System.out.println('\n' + "Specific Rehearsals");
		System.out.println("At time 30,05,2011: " + band.showRehearsals(time2, time3));
		System.out.println("At time 30,05,2011: " + band.showRehearsals(time1));
=======
>>>>>>> added Test cases
		
		
		
		System.out.println('\n' + "Specific Rehearsals");
		System.out.println("At time 30,05,2011: " + band.showRehearsals(time2, time3));
		System.out.println("At time 30,05,2011: " + band.showRehearsals(time1));
		
	}
}
