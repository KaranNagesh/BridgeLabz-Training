package FuntionalInterface.dateformatutility;

import java.time.LocalDate;

public class InvoiceGenerator {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println(
            DateUtils.formatDate(today, "dd-MM-yyyy")
        );

        System.out.println(
            DateUtils.formatDate(today, "yyyy/MM/dd")
        );
    }
}
