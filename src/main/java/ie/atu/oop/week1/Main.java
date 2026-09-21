package ie.atu.oop.week1;

import java.awt.print.Book;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello OOP!");

        Book firstBook = new Book();

        firstBook.title = "Dune";
        firstBook.author = "Frank";
        firstBook.pageCount = 412;

        System.out.println("First book:" + firstBook.title);
        System.out.println("First book Author :" +firstBook.author);
        System.out.println("First book Pagecount: "+firstBook.pagecount);
        System.out.println("Is book available"+ firstBook.available);

        Book secondBook = new Book();
        secondBook.title = "Star Trek";
        secondBook.author = "Dave";
        secondBook.pageCount = 300;
        secondBook.available = true;



    }
}