package linkedlist.singlylinkedlist.inventorymanagement;

public class Main {
    public static void main(String[] args) {
        InventoryManagement im = new InventoryManagement();

        im.addAtEnd(101, "Keyboard", 10, 700);
        im.addAtEnd(102, "Mouse", 20, 300);
        im.addAtBeginning(103, "Monitor", 5, 12000);
        im.addAtPosition(2, 104, "Laptop", 3, 55000);

        im.displayAll();

        im.updateQuantity(102, 25);
        im.searchByName("Laptop");

        im.calculateTotalValue();

        System.out.println("\nSorted by Price (Ascending):");
        im.head = im.mergeSort(im.head, false, true);
        im.displayAll();

        System.out.println("\nSorted by Name (Descending):");
        im.head = im.mergeSort(im.head, true, false);
        im.displayAll();
    }
}
