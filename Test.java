import java.util.Calendar;

public class Test {

	public static void main(String[] args){
		Calendar time1 = Calendar.getInstance();
		
		time1.set(2011, 05, 30);
		
		Band band = new Band();
		
		Gig gig = new Gig(15, "Wien", time1, 20);
		Rehearsal rehearsal = new Rehearsal(20, "Linz", time1, 300);
		Song song = new Song("Mitt Rommney Style", 160);
		
		System.out.println("Objekts - toString()");
		System.out.println(gig);
		System.out.println(rehearsal);
		System.out.println(song);
		System
	}
}
