
package eventease;

//Main class to test EventEase application
public class EventEaseApp {

 public static void main(String[] args) {

     // Create organizer
     User organizer = new User("Karan Nagesh", "Karan@eventease.com");

     // Create birthday event
     Event birthday = new BirthdayEvent(
             "Arya's Birthday",
             "Banquet Hall",
             "15-Aug-2026",
             80,
             50000,
             15000,   // catering + decoration
             5000,    // discount
             organizer
     );

     // Create conference event
     Event conference = new ConferenceEvent(
             "AI Tech Conference",
             "Convention Center",
             "10-Sep-2026",
             300,
             200000,
             60000,
             20000,
             organizer
     );

     // Schedule events (polymorphism)
     birthday.schedule();
     birthday.showEventDetails();

     System.out.println();

     conference.schedule();
     conference.showEventDetails();

     System.out.println();

     // Reschedule conference
     conference.reschedule("12-Sep-2026");
 }
}
