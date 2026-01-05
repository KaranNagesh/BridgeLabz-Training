package hospitalpatientmanagementsystem;

public class Bill implements Payable{
	
	int medicineCharges;
	int consultancyCharges;
	double tax = 0.10;
	double discount = 0.05;
	
	public Bill(int medicineCharges, int consultancyCharges) {
		this.medicineCharges = medicineCharges;
		this.consultancyCharges = consultancyCharges;
	}
	

	@Override
	public double calculatePayment() {
		double totalBill = consultancyCharges + medicineCharges;
		double totalBillAfterTax = totalBill + (totalBill * tax);
		double totalBillAfterDiscount = totalBillAfterTax - (totalBillAfterTax * discount);
		return totalBillAfterDiscount;
	}

}
