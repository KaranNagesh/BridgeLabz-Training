package FuntionalInterface.dataexportfeature;

interface ReportExporter {

    void exportToCSV();

    void exportToPDF();

    // newly added
    default void exportToJSON() {
        System.out.println("Exporting report to JSON format");
    }
}
