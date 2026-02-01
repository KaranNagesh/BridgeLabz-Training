package FuntionalInterface.dataexportfeature;

class SalesReport implements ReportExporter {

    public void exportToCSV() {
        System.out.println("Sales report CSV");
    }

    public void exportToPDF() {
        System.out.println("Sales report PDF");
    }
}
