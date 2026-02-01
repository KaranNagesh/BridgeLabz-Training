package lambdaexpressionandmethodreference.InvoiceObjectCreation;

public class Invoice {
	int transactionId;
	
	public Invoice(int transactionId){
		this.transactionId = transactionId;
	}
	
	

	public void printInvoice() {
		System.out.println("Invoice generated for transaction : " + transactionId);
	}
}

