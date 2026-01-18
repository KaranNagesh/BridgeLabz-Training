
package zipzipmart;

import java.time.LocalDate;

//Class Transaction to store details of transaction
public class Transaction {
	LocalDate date;
	double amount;

	// Parameterized constructor
	public Transaction(LocalDate date, double amount) {

		this.date = date;
		this.amount = amount;
	}

}
