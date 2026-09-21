package ie.atu.oop.week1;

public class Book {
    public String title;
    public String author;
    public int pageCount;
    public boolean available = true;


    public void displayDetails() {
        System.out.println("Book: " + title);
        System.out.println("Book Author :" + author);
        System.out.println("Book Pagecount: " + pageCount);
        System.out.println("Book available: " + available);
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed successfully");
        } else {
            System.out.println(title + " is already borrowed");
        }
    }
}