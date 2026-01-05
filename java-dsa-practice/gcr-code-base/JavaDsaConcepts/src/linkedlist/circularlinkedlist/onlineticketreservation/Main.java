package linkedlist.circularlinkedlist.onlineticketreservation;

public class Main {
    public static void main(String[] args) {

        TicketReservationSystem trs =
            new TicketReservationSystem();

        trs.addTicket(101, "Amit", "Inception", "A1", "10:30 AM");
        trs.addTicket(102, "Rohit", "Avatar", "B5", "11:00 AM");
        trs.addTicket(103, "Neha", "Inception", "C3", "11:30 AM");

        trs.displayTickets();

        System.out.println("\nSearch by Movie:");
        trs.searchByMovie("Inception");

        System.out.println("\nSearch by Customer:");
        trs.searchByCustomer("Rohit");

        trs.countTickets();

        trs.removeTicket(102);
        trs.displayTickets();
        trs.countTickets();
    }
}
