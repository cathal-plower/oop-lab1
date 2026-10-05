package ie.atu.oop.week1;


public class Main
{
    public static void main(String[] args)
    {
        Book first = new Book("Dune", "Frank Herbert", 412);

        Book second = new Book("Clean Code", "Robert C. Martin", 464);

        Book third = new Book("Hobbit", "J. R. R. Tolkien", 465);

        LibraryService service = new LibraryService();

        service.addBook(first);
        service.addBook(second);
        service.addBook(third);

        System.out.println("Total books in Library Service is " + service.getBookCount());

        for(Book book : service.getAllBooks())
        {
            System.out.println(book.getTitle());
        }

        Book found = service.findBookByTitle("Dune");
        if (found != null) {
            System.out.println("Found: " + found.getTitle());
        }

        Book missing = service.findBookByTitle("The Hobbit");
        if (missing == null) {
            System.out.println("The Hobbit was not found");
        }



        System.out.println("Remove Clean Code: " + service.removeBook("Clean Code"));
        System.out.println("Remove again: " + service.removeBook("Clean Code"));
        System.out.println("Books left: " + service.getBookCount());

    }
}
