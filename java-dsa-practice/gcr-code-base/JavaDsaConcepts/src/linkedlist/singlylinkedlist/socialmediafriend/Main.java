package linkedlist.singlylinkedlist.socialmediafriend;

public class Main {
    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();

        sm.addUser(1, "Amit", 22);
        sm.addUser(2, "Rohit", 23);
        sm.addUser(3, "Neha", 21);
        sm.addUser(4, "Pooja", 22);

        sm.addFriendConnection(1, 2);
        sm.addFriendConnection(1, 3);
        sm.addFriendConnection(2, 3);
        sm.addFriendConnection(2, 4);

        sm.displayFriends(1);
        sm.displayFriends(2);

        sm.findMutualFriends(1, 2);

        sm.countFriends(2);

        sm.removeFriendConnection(1, 2);
        sm.displayFriends(1);

        sm.searchByName("Neha");
    }
}
