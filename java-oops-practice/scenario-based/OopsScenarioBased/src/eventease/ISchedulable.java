
package eventease;

//Interface defining event scheduling actions
interface ISchedulable {

 void schedule();      // Schedule an event
 void reschedule(String newDate);
 void cancel();        // Cancel an event
}
