package lambdaexpressionandmethodreference.InvoiceObjectCreation;

import java.util.*;

public class InvoiceGenerator {
	public static void main(String args[]) {
		List<Integer> transIds = Arrays.asList(1011,1012,1013,1014,1015);
		List<Invoice> invoices = transIds.stream().map(Invoice::new).toList();
		
		invoices.forEach(Invoice::printInvoice);
		
	}
	
}
