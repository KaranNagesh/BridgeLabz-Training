package linkedlist.circularlinkedlist.onlineticketreservation;

class TicketReservationSystem {
    private TicketNode head = null;

    // Add ticket at end
    void addTicket(int id, String customer, String movie,
                   String seat, String time) {

        TicketNode newNode =
            new TicketNode(id, customer, movie, seat, time);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        TicketNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // Remove ticket by ID
    void removeTicket(int id) {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode temp = head;
        TicketNode prev = null;

        do {
            if (temp.ticketId == id) {

                // Only one ticket
                if (temp == head && temp.next == head) {
                    head = null;
                }
                // Removing head
                else if (temp == head) {
                    TicketNode last = head;
                    while (last.next != head)
                        last = last.next;

                    head = head.next;
                    last.next = head;
                }
                // Removing middle or last
                else {
                    prev.next = temp.next;
                }

                System.out.println("Ticket removed successfully.");
                return;
            }

            prev = temp;
            temp = temp.next;

        } while (temp != head);

        System.out.println("Ticket not found.");
    }

    // Display all tickets
    void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode temp = head;
        System.out.println("Booked Tickets:");
        do {
            displayTicket(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by customer name
    void searchByCustomer(String customer) {
        if (head == null) return;

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(customer)) {
                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No tickets found for customer.");
    }

    // Search by movie name
    void searchByMovie(String movie) {
        if (head == null) return;

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.movieName.equalsIgnoreCase(movie)) {
                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No tickets found for movie.");
    }

    // Count total tickets
    void countTickets() {
        if (head == null) {
            System.out.println("Total tickets booked = 0");
            return;
        }

        int count = 0;
        TicketNode temp = head;

        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Total tickets booked = " + count);
    }

    void displayTicket(TicketNode t) {
        System.out.println(
            "Ticket ID: " + t.ticketId +
            ", Customer: " + t.customerName +
            ", Movie: " + t.movieName +
            ", Seat: " + t.seatNumber +
            ", Time: " + t.bookingTime
        );
    }
}
