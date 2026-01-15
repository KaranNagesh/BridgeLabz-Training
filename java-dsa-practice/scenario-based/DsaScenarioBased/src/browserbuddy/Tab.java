package browserbuddy;

import java.util.Stack;

public class Tab {

    private Page head;
    private Page tail;
    private Page current;

    // Stack to store closed tabs
    private static Stack<Tab> closedTabs = new Stack<>();

    /* ================= ADD PAGE ================= */
    public void addPage(String content) {

        Page newPage = new Page(content);

        // Clear forward history
        if (current != null && current.next != null) {
            Page temp = current.next;
            while (temp != null) {
                Page next = temp.next;
                temp.prev = null;
                temp.next = null;
                temp = next;
            }
            current.next = null;
            tail = current;
        }

        if (head == null) {
            head = tail = current = newPage;
            return;
        }

        tail.next = newPage;
        newPage.prev = tail;
        tail = newPage;
        current = newPage;
    }

    /* ================= BACK ================= */
    public void back() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("Nothing to go back");
        }
    }

    /* ================= FORWARD ================= */
    public void forward() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("Nothing to go forward");
        }
    }

    /* ================= DISPLAY ================= */
    public void displayCurrentPage() {
        if (current == null) {
            System.out.println("Tab is empty");
        } else {
            System.out.println("Current Page: " + current.currentPage);
        }
    }

    /* ================= CLOSE TAB ================= */
    public void closeTab() {
        closedTabs.push(this);
        System.out.println("Tab closed");
    }

    /* ================= REOPEN TAB ================= */
    public static Tab reopenTab() {
        if (closedTabs.isEmpty()) {
            System.out.println("No closed tabs to reopen");
            return null;
        }
        System.out.println("Tab reopened");
        return closedTabs.pop();
    }
}