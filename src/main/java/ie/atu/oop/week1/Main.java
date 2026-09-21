package ie.atu.oop.week1;


public class Main {
    public static void main(String[] args) {



        Book firstBook = new Book();

        firstBook.title = "Dune";
        firstBook.author = "Frank";
        firstBook.pageCount = 412;

        firstBook.displayDetails();


        Book secondBook = new Book();
        secondBook.title = "Star Trek";
        secondBook.author = "Dave";
        secondBook.pageCount = 300;
        secondBook.available = true;

            secondBook.displayDetails();

    }
}