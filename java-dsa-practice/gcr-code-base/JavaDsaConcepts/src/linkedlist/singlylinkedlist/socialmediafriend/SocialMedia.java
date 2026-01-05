package linkedlist.singlylinkedlist.socialmediafriend;

class SocialMedia {
    UserNode head = null;

    // Add user
    void addUser(int id, String name, int age) {
        UserNode newUser = new UserNode(id, name, age);
        newUser.next = head;
        head = newUser;
    }

    // Find user by ID
    UserNode findUserById(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // Search user by name
    void searchByName(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                displayUser(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found.");
    }

    // Add friend connection (bidirectional)
    void addFriendConnection(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        u1.friends = addFriend(u1.friends, id2);
        u2.friends = addFriend(u2.friends, id1);

        System.out.println("Friend connection added.");
    }

    FriendNode addFriend(FriendNode head, int friendId) {
        FriendNode newNode = new FriendNode(friendId);
        newNode.next = head;
        return newNode;
    }

    // Remove friend connection
    void removeFriendConnection(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found.");
            return;
        }

        u1.friends = removeFriend(u1.friends, id2);
        u2.friends = removeFriend(u2.friends, id1);

        System.out.println("Friend connection removed.");
    }

    FriendNode removeFriend(FriendNode head, int friendId) {
        if (head == null) return null;

        if (head.friendId == friendId)
            return head.next;

        FriendNode temp = head;
        while (temp.next != null && temp.next.friendId != friendId) {
            temp = temp.next;
        }

        if (temp.next != null)
            temp.next = temp.next.next;

        return head;
    }

    // Display all friends of a user
    void displayFriends(int userId) {
        UserNode user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.print("Friends of " + user.name + ": ");
        FriendNode temp = user.friends;

        if (temp == null) {
            System.out.println("No friends.");
            return;
        }

        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Find mutual friends
    void findMutualFriends(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.print("Mutual Friends: ");
        boolean found = false;

        FriendNode f1 = u1.friends;
        while (f1 != null) {
            FriendNode f2 = u2.friends;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.print(f1.friendId + " ");
                    found = true;
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }

        if (!found)
            System.out.print("None");

        System.out.println();
    }

    // Count friends
    void countFriends(int userId) {
        UserNode user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        int count = 0;
        FriendNode temp = user.friends;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println(user.name + " has " + count + " friends.");
    }

    void displayUser(UserNode u) {
        System.out.println("ID: " + u.userId + ", Name: " + u.name + ", Age: " + u.age);
    }
}
