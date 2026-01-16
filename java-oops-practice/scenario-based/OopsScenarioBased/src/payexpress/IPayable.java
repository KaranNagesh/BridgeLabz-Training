
package payexpress;

//Interface defining payment-related actions
interface IPayable {

	// Method to pay the bill
	void pay();

	// Method to send payment reminder
	void sendReminder();
}
