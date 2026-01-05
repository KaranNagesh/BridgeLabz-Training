package linkedlist.singlylinkedlist.inventorymanagement;
class InventoryManagement {
    ItemNode head = null;

    // Add at beginning
    void addAtBeginning(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    void addAtEnd(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);

        if (head == null) {
            head = newNode;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    // Add at specific position
    void addAtPosition(int pos, int id, String name, int qty, double price) {
        if (pos <= 1 || head == null) {
            addAtBeginning(id, name, qty, price);
            return;
        }

        ItemNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        ItemNode newNode = new ItemNode(id, name, qty, price);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove by Item ID
    void removeById(int id) {
        if (head == null) return;

        if (head.itemId == id) {
            head = head.next;
            System.out.println("Item removed.");
            return;
        }

        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != id) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
            System.out.println("Item removed.");
        } else {
            System.out.println("Item not found.");
        }
    }

    // Update quantity
    void updateQuantity(int id, int newQty) {
        ItemNode temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                System.out.println("Quantity updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    // Search by ID
    void searchById(int id) {
        ItemNode temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    // Search by Name
    void searchByName(String name) {
        ItemNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("Item not found.");
    }

    // Calculate total inventory value
    void calculateTotalValue() {
        ItemNode temp = head;
        double total = 0;

        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value = ₹" + total);
    }

    // Display all items
    void displayAll() {
        ItemNode temp = head;
        System.out.println("Inventory Items:");
        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }

    void displayItem(ItemNode i) {
        System.out.println(
            "ID: " + i.itemId +
            ", Name: " + i.itemName +
            ", Qty: " + i.quantity +
            ", Price: ₹" + i.price
        );
    }

    /* ---------------- MERGE SORT ---------------- */

    ItemNode mergeSort(ItemNode head, boolean sortByName, boolean ascending) {
        if (head == null || head.next == null)
            return head;

        ItemNode mid = getMiddle(head);
        ItemNode nextOfMid = mid.next;
        mid.next = null;

        ItemNode left = mergeSort(head, sortByName, ascending);
        ItemNode right = mergeSort(nextOfMid, sortByName, ascending);

        return sortedMerge(left, right, sortByName, ascending);
    }

    ItemNode sortedMerge(ItemNode a, ItemNode b, boolean sortByName, boolean asc) {
        if (a == null) return b;
        if (b == null) return a;

        boolean condition;
        if (sortByName) {
            condition = asc
                ? a.itemName.compareToIgnoreCase(b.itemName) <= 0
                : a.itemName.compareToIgnoreCase(b.itemName) > 0;
        } else {
            condition = asc
                ? a.price <= b.price
                : a.price > b.price;
        }

        if (condition) {
            a.next = sortedMerge(a.next, b, sortByName, asc);
            return a;
        } else {
            b.next = sortedMerge(a, b.next, sortByName, asc);
            return b;
        }
    }

    ItemNode getMiddle(ItemNode head) {
        if (head == null) return head;

        ItemNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
