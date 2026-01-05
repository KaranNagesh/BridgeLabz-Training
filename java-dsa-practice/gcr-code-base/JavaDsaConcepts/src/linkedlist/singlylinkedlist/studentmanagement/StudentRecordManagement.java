package linkedlist.singlylinkedlist.studentmanagement;


public class StudentRecordManagement {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();

        list.addAtBeginning(101, "Karan", 21, 'A');
        list.addAtEnd(102, "Rahul", 22, 'B');
        list.addAtPosition(2, 103, "Aman", 20, 'A');

        list.display();

        list.searchByRollNo(102);
        list.updateGrade(102, 'A');

        list.deleteByRollNo(101);
        list.display();
    }
}
