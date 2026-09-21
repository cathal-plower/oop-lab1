package ie.atu.oop.week1;

public class Book
{
    public String title;
    public String author;
    public int pageCount;
    public boolean available = true;

}

public void displaydetails
{
    System.out.println("First book:" + title);
    System.out.println("First book Author :" author);
    System.out.println("First book Pagecount: "+pagecount);
    System.out.println("Is book available"+ available);
}