package FuntionalInterface.dataexportfeature;

public class ReportApp {

    public static void main(String[] args) {

        ReportExporter report = new SalesReport();

        report.exportToCSV();
        report.exportToPDF();
        report.exportToJSON(); // works without changes
    }
}
