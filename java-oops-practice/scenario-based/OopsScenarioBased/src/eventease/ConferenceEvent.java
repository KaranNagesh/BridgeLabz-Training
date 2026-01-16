
package eventease;

//Conference event class
class ConferenceEvent extends Event {

 public ConferenceEvent(String eventName, String location, String date,
                        int attendees, double venueCost,
                        double serviceCost, double discount,
                        User organizer) {

     super(eventName, location, date, attendees,
           venueCost, serviceCost, discount, organizer);
 }

 // Polymorphic schedule method
 @Override
 public void schedule() {
     System.out.println("📢 Conference scheduled with sessions, speakers, and networking.");
 }

 @Override
 public void reschedule(String newDate) {
     this.date = newDate;
     System.out.println("Conference rescheduled to " + newDate);
 }

 @Override
 public void cancel() {
     System.out.println("Conference Event has been cancelled.");
 }
}
