package linkedlist.circularlinkedlist.roundrobin;

class RoundRobinScheduler {
    ProcessNode head = null;
    int timeQuantum;
    int totalProcesses = 0;
    int currentTime = 0;

    RoundRobinScheduler(int tq) {
        this.timeQuantum = tq;
    }

    // Add process at end
    void addProcess(int pid, int burst, int priority) {
        ProcessNode newNode = new ProcessNode(pid, burst, priority);
        totalProcesses++;

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        ProcessNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = newNode;
        newNode.next = head;
    }

    // Execute Round Robin Scheduling
    void execute() {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        ProcessNode current = head;
        ProcessNode prev = null;

        System.out.println("\n--- Round Robin Execution ---");

        while (head != null) {
            displayProcesses();

            if (current.remainingTime > timeQuantum) {
                currentTime += timeQuantum;
                current.remainingTime -= timeQuantum;
            } else {
                currentTime += current.remainingTime;
                current.turnaroundTime = currentTime;
                current.waitingTime = current.turnaroundTime - current.burstTime;

                System.out.println("Process P" + current.pid + " completed.");

                // Remove completed process
                if (current == head && current.next == head) {
                    head = null;
                    break;
                } else if (current == head) {
                    ProcessNode last = head;
                    while (last.next != head)
                        last = last.next;

                    head = head.next;
                    last.next = head;
                    current = head;
                } else {
                    prev.next = current.next;
                    current = current.next;
                }
                continue;
            }

            prev = current;
            current = current.next;
        }

        calculateAverageTimes();
    }

    // Display processes
    void displayProcesses() {
        if (head == null) return;

        ProcessNode temp = head;
        System.out.print("Queue: ");
        do {
            System.out.print("[P" + temp.pid + " RT=" + temp.remainingTime + "] ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Calculate average waiting & turnaround time
    void calculateAverageTimes() {
        System.out.println("\n--- Scheduling Completed ---");

        double totalWT = 0, totalTAT = 0;

        ProcessNode temp = head;
        if (temp == null) {
            System.out.println("All processes executed.");
            return;
        }

        do {
            totalWT += temp.waitingTime;
            totalTAT += temp.turnaroundTime;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Average Waiting Time = " + (totalWT / totalProcesses));
        System.out.println("Average Turnaround Time = " + (totalTAT / totalProcesses));
    }
}
