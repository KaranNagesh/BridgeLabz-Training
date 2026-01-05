package linkedlist.circularlinkedlist.taskscheduler;

class TaskScheduler {
    TaskNode head = null;
    TaskNode current = null;

    // Add at beginning
    void addAtBeginning(int id, String name, int priority, String date) {
        TaskNode newNode = new TaskNode(id, name, priority, date);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            TaskNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
    }

    // Add at end
    void addAtEnd(int id, String name, int priority, String date) {
        TaskNode newNode = new TaskNode(id, name, priority, date);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            TaskNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Add at specific position
    void addAtPosition(int pos, int id, String name, int priority, String date) {
        if (pos <= 1 || head == null) {
            addAtBeginning(id, name, priority, date);
            return;
        }

        TaskNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        TaskNode newNode = new TaskNode(id, name, priority, date);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove task by ID
    void removeById(int id) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        TaskNode temp = head, prev = null;

        do {
            if (temp.taskId == id) {
                if (temp == head) {
                    TaskNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    if (head.next == head) {
                        head = null;
                    } else {
                        head = head.next;
                        last.next = head;
                    }
                } else {
                    prev.next = temp.next;
                }
                System.out.println("Task removed successfully.");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Task not found.");
    }

    // View current task and move to next
    void viewNextTask() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        if (current == null) {
            current = head;
        }

        displayTask(current);
        current = current.next;
    }

    // Display all tasks
    void displayAll() {
        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }

        TaskNode temp = head;
        System.out.println("All Tasks:");
        do {
            displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by priority
    void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                displayTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No task found with given priority.");
    }

    void displayTask(TaskNode t) {
        System.out.println(
            "ID: " + t.taskId +
            ", Name: " + t.taskName +
            ", Priority: " + t.priority +
            ", Due Date: " + t.dueDate
        );
    }
}
