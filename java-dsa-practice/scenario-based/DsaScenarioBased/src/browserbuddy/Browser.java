package browserbuddy;

public class Browser {

    public static void main(String[] args) {

        // Open first tab
        Tab tab1 = new Tab();

        tab1.addPage("Google");
        tab1.addPage("OOPs concepts in Java");
        tab1.addPage("JavaTPoint");
        tab1.addPage("Inheritance");
        tab1.addPage("Multiple Inheritance");

        tab1.displayCurrentPage(); // Multiple Inheritance

        System.out.println("Moving Backward");
        tab1.back();
        tab1.displayCurrentPage(); // Inheritance

        System.out.println("Moving Backward");
        tab1.back();
        tab1.displayCurrentPage(); // JavaTPoint

        System.out.println("Moving Forward");
        tab1.forward();
        tab1.displayCurrentPage(); // Inheritance

        // Close tab
        tab1.closeTab();

        // IMPORTANT: stop using tab1 now ❌
        tab1 = null;

        // Reopen last closed tab
        Tab reopenedTab = Tab.reopenTab();

        if (reopenedTab != null) {
            reopenedTab.displayCurrentPage(); // Inheritance

            System.out.println("Moving Backward after reopen");
            reopenedTab.back();
            reopenedTab.displayCurrentPage(); // JavaTPoint

            System.out.println("Moving Forward after reopen");
            reopenedTab.forward();
            reopenedTab.displayCurrentPage(); // Inheritance
        }
    }
}