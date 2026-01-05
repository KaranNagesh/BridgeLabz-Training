package linkedlist.doublylinkedlist.undoredotexteditor;

class TextEditor {
    private TextNode head = null;
    private TextNode tail = null;
    private TextNode current = null;

    private int size = 0;
    private final int MAX_SIZE = 10;

    // Add new text state
    void addState(String content) {
        TextNode newNode = new TextNode(content);

        // Remove redo history
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
        }

        if (head == null) {
            head = tail = current = newNode;
            size = 1;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        current = newNode;
        size++;

        // Maintain max history size
        if (size > MAX_SIZE) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo operation
    void undo() {
        if (current == null || current.prev == null) {
            System.out.println("Nothing to undo.");
            return;
        }
        current = current.prev;
        System.out.println("Undo performed.");
    }

    // Redo operation
    void redo() {
        if (current == null || current.next == null) {
            System.out.println("Nothing to redo.");
            return;
        }
        current = current.next;
        System.out.println("Redo performed.");
    }

    // Display current text
    void displayCurrentState() {
        if (current == null) {
            System.out.println("Editor is empty.");
        } else {
            System.out.println("Current Text: " + current.content);
        }
    }

    // Display all states (for understanding)
    void displayHistory() {
        TextNode temp = head;
        System.out.println("Text History:");
        while (temp != null) {
            if (temp == current)
                System.out.println("➡ " + temp.content);
            else
                System.out.println("   " + temp.content);
            temp = temp.next;
        }
    }
}
