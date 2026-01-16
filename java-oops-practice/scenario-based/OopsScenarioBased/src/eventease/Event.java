
package eventease;

import java.util.UUID;

//Base Event class
abstract class Event implements ISchedulable {

 protected String eventName;
 protected String location;
 protected String date;
 protected int attendees;

 // eventId should not be modified once assigned
 private final String eventId;

 // Pricing details must remain encapsulated
 private double venueCost;
 private double serviceCost;
 private double discount;

 protected User organizer;

 // Constructor without extra services
 public Event(String eventName, String location, String date,
              int attendees, double venueCost, User organizer) {

     this.eventName = eventName;
     this.location = location;
     this.date = date;
     this.attendees = attendees;
     this.venueCost = venueCost;
     this.serviceCost = 0;
     this.discount = 0;
     this.organizer = organizer;

     // Generate unique event ID
     this.eventId = UUID.randomUUID().toString();
 }

 // Constructor with catering/decoration services
 public Event(String eventName, String location, String date,
              int attendees, double venueCost,
              double serviceCost, double discount,
              User organizer) {

     this.eventName = eventName;
     this.location = location;
     this.date = date;
     this.attendees = attendees;
     this.venueCost = venueCost;
     this.serviceCost = serviceCost;
     this.discount = discount;
     this.organizer = organizer;

     this.eventId = UUID.randomUUID().toString();
 }

 // Final cost calculation using operators
 public double calculateTotalCost() {
     return venueCost + serviceCost - discount;
 }

 // Getter for event ID (no setter)
 public String getEventId() {
     return eventId;
 }

 // Display common event details
 public void showEventDetails() {
     System.out.println("Event ID: " + eventId);
     System.out.println("Event Name: " + eventName);
     System.out.println("Location: " + location);
     System.out.println("Date: " + date);
     System.out.println("Attendees: " + attendees);
     System.out.println("Organizer: " + organizer.getName());
     System.out.println("Total Cost: ₹" + calculateTotalCost());
 }
}
