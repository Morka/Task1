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
		
		/*
			Erstellt zuerst einen neuen Gig, Rehearsal, song, member
			
			und fuegt diese dann in die jeweilige Liste der Klasse Band ein
		
		*/
		
		Gig gig = new Gig(15, "Wien", time3, 20);
		Rehearsal rehearsal = new Rehearsal(20, "Linz", time3, 300);
		Song song = new Song("Mitt Romney Style", 160);
		Member member = new Member("Mitt Romney", "039394919", "Geige");
		
		band.addEvent(gig);
		band.addEvent(rehearsal);
		band.addTrack(song);
		band.addMember(member);
		
		/*
		Zeigt, ob das erstellen (und die toString - Methoden) funktioniert hat
		
		Erwarteter Output: "gig: Locatio: Wien, Duration: 15, Date: 23.01.2011, Fee:20
							rehearsal: Location: Linz, Duration: 20, Date: 23.01.2011, Rent: 300
							song: Name: Mitt Romney Style, length: 160
							member: Name: Mitt Romney, Instrument: Geige"
		*/
		
		System.out.println("\n\n++++Objekts - toString()++++");
		System.out.println("gig: " + gig);
		System.out.println("rehearsal: " + rehearsal);
		System.out.println("song: " + song);
		System.out.println("member: " + member);
		
		/*
		 Stetz fuer gig ein neues Datum time2
		*/
		gig.setDate(time2);
		song.setDate(time2);
		
		/*
		Ueberprueft die neuen Daten
			
		Erwarteter Output: "Gig: Location: Wien, Duration: 15, Date: 23.01.2011,
							Fee: 20"	
		*/
		
		System.out.println('\n'+ "++++time Changed+++++");
		System.out.println("Gig: " + gig);
		
		/*
		Zeigt alle Rehearsals die zu einem gegebenen Zeitpunkt und zu einer
		Zeitspanne stattfinden
		
		Erwarteter Output: "Solution1: Location: Linz, Duration: 20, 
							Date: 23.01.2011, Rent: 300
							Solution2: Location: Linz, Duration: 20, 
							Date: 23.01.2011, Rent: 300"
		*/
		
		System.out.println('\n' + "++++Specific Rehearsals++++");
		System.out.println("Solution1: " + band.showRehearsals(time1, time5));
		System.out.println("Solution2: " + band.showRehearsals(time2));
		
		Gig gig2 = new Gig(20,"Linz", time2, 30);
		Gig gig3 = new Gig(23, "Bregenz", time4, 3000);
		band.addEvent(gig2);
		band.addEvent(gig3);
		
		/*
		Zeigt alle Gigs von 2009 bis 2012
			
		Erwartet Output: "Location: Wien, Duration: 15, Date: 22.01.2011, Fee: 20
						  Location: Linz, Duration: 20, Date: 22.01.2011, Fee: 30
						  Location: Bregenz, Duration: 23, Date: 28.06.2012, Fee: 3000"	
		*/
		
		System.out.println("++++Specific Gigs++++");	
		System.out.println("Gigs from 2009 to 2012:");
		System.out.println(band.showGigs(time1,time5));
		
		/*
			Zeigt alle Events von 2011 bis 2012
			
		ERwarteter Output: "Rehearsals: Location: Linz, Duration: 20,
						    Date: 23.01.2011, Rent: 300
						    Gigs: Location: Bregenz, Duration: 23,
						    Date: 28.06.2012, Fee: 3000
		*/
		System.out.println("++++Specific Events++++");
		System.out.println("Events from 2011 to 2012");
		System.out.println(band.showEvents(time2, time5));
		
		Song song2 = new Song("Melody Dean", 200);
		band.addTrack(song2);
		
		/*
			Zeigt alle Songs nach dem hinzufuegen eines neuen
			
		Erwarteter Output: "name: Mitt Romney Style, length: 160
							name: Melody Dean, length: 200"
		*/
		
		System.out.println("++++Specific Songs++++");
		System.out.println("Songs from 2009 to 2012");
		System.out.println(band.showSongs(time1,time5));
		
		/*
			Zeigt die gesammten Kosten
			
	    Erwarteter Output: "300"
		*/
		
		System.out.println("++++SumOfCosts++++");
		System.out.println("Costs from 2009 to 2012");
		System.out.println(band.sumOfCosts(time1,time5));
		
		/*
			Zeigt alle Einnahmen
		
		Erwarteter output: "3050"
		*/
		
		System.out.println("++++SumOfEarnings++++");
		System.out.println("Costs from 2009 to 2012");
		System.out.println(band.sumOfEarnings(time1,time5));
		
		/*
			Zeigt alle Einnahmen und Ausgaben zusammengerechnet
		
		Erwarteter Output: "2750"
		*/
		
		System.out.println("++++SumOfAll++++");
		System.out.println("Costs from 2009 to 2012");
		System.out.println(band.sumOfAll(time1,time5));		
	}
}
