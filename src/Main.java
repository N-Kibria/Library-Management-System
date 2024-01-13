import java.util.*;
public class Main {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();
        Librarian librarian = new Librarian(manager);


        manager.addNewBook("1984", "George Orwell", 1, 3, "Dystopian");
        manager.addNewBook("To Kill a Mockingbird", "Harper Lee", 2, 2, "Classic");


        manager.listAvailableBooks();


        manager.addBookQuantity(1, 56);
        manager.listAvailableBooks();


        manager.addLibrarian("John Abraham", 25, 101);


        List<Book> emptyList = new ArrayList<>();
        librarian.addMember("John Doe", 25, 101, emptyList);


        librarian.lendBook(101, 1);


        librarian.listAvailableBooks();


        librarian.returnBook(101, 1);


        librarian.listAvailableBooks();

        librarian.revokeMembership(101);

        manager.listofLibraryMembers();

        manager.ListofLibrarins();
    }


}
