package linkedlist.circularlinkedlist.taskscheduler;

public class Main {
    public static void main(String[] args) {
        TaskScheduler ts = new TaskScheduler();

        ts.addAtEnd(1, "Design Module", 1, "10-Apr");
        ts.addAtEnd(2, "Coding", 2, "15-Apr");
        ts.addAtBeginning(3, "Requirement Analysis", 1, "05-Apr");

        ts.displayAll();

        System.out.println("\nViewing tasks cyclically:");
        ts.viewNextTask();
        ts.viewNextTask();
        ts.viewNextTask();

        System.out.println("\nSearch by Priority 1:");
        ts.searchByPriority(1);

        ts.removeById(2);
        ts.displayAll();
    }
}
