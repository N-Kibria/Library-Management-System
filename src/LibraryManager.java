import java.util.ArrayList;
import java.util.List;

public class LibraryManager extends LibraryEmployee implements IBookManager{

    private final List<Librarian> librarians;

    public LibraryManager() {

        librarians = new ArrayList<>();
    }
    @Override
    public void addNewBook(String title, String author, Integer bookId,Integer Quantity,String genre) {
        books.add(new Book(title, author,bookId, Quantity,genre));
    }
    @Override
    public void addBookQuantity( Integer bookId,Integer quantity) {
        Book book = findAvailableBook(bookId);
        if(book!=null) {
            book.Quantity += quantity;
            System.out.println("number of "+book.Title+" :" + book.Quantity);
        }

    }



    public void ListofLibrarins() {
        System.out.println("Librarians:");
        for (Librarian librarian : librarians) {

            System.out.println("Librarian ID: " + librarian.ID);
            System.out.println("Librarian Name: " + librarian.Name);

        }
    }
    public void listofLibraryMembers() {
        System.out.println(" Library Members:");
        for (LibraryMember member : members) {
            System.out.println("Member ID: " + member.MemberID);
            System.out.println("Member Name: " + member.MemberName);
        }
    }
    public void listAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {

            System.out.println(book.Title + " by " + book.Author);

        }
    }

    @Override
    public Book findAvailableBook(Integer bookId) {
        for (Book book : books) {
            if (book.BookID.equals(bookId) && book.Quantity >0) {
                return book;
            }
        }
        return null;
    }



    public void addLibrarian(String Name,Integer Age,Integer ID) {
        librarians.add(new Librarian(Name,Age,ID));
    }




}
