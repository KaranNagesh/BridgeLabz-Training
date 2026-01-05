package linkedlist.doublylinkedlist.moviemanagementsystem;

class MovieNode {
    String title;
    String director;
    int year;
    double rating;
    MovieNode prev;
    MovieNode next;

    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}
