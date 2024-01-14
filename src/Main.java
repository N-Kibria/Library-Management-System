import java.util.*;
public class Main {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();

        Librarian librarian = new Librarian(manager,manager );


        manager.addNewBook("1984", "George Orwell", 1, 3, "Dystopian");
        manager.addNewBook("To Kill a Mockingbird", "Harper Lee", 2, 2, "Classic");
        manager.addNewBook("The Hobbit", "J.R.R. Tolkien", 6, 4, "Fantasy");
        manager.addNewBook("1984", "George Orwell", 7, 3, "Dystopian");
        manager.addNewBook("Brave New World", "Aldous Huxley", 8, 2, "Dystopian");
        manager.addNewBook("To Kill a Mockingbird", "Harper Lee", 9, 2, "Classic");
        manager.addNewBook("The Catcher in the Rye", "J.D. Salinger", 10, 4, "Classic");
        manager.addNewBook("The Lord of the Rings", "J.R.R. Tolkien", 11, 3, "Fantasy");
        manager.addNewBook("The Alchemist", "Paulo Coelho", 12, 5, "Philosophical Fiction");


        manager.listAvailableBooks();


        manager.addBookQuantity(1, 56);
        librarian.listAvailableBooks();


        manager.addLibrarian("John Abraham", 25, 101);
        manager.addLibrarian("Emma Watson", 30, 102);
        manager.addLibrarian("Michael Smith", 40, 103);
        manager.addLibrarian("Sarah Johnson", 35, 104);
        manager.addLibrarian("David Wilson", 45, 105);
        manager.addLibrarian("Linda Brown", 50, 106);
        manager.addLibrarian("James Williams", 28, 107);

        List<Book> ListForJohn = new ArrayList<>();
        manager.addMember("John Doe", 25, 101, ListForJohn);

        List<Book> ListForAlice = new ArrayList<>();
        librarian.addMember("Alice Johnson", 30, 102, ListForAlice);

        List<Book> ListForBob = new ArrayList<>();
        manager.addMember("Bob Smith", 45, 103, ListForBob);

        List<Book> ListForEmma = new ArrayList<>();
        librarian.addMember("Emma Brown", 22, 104, ListForEmma);

        List<Book> ListForDavid = new ArrayList<>();
        librarian.addMember("David Wilson", 35, 105, ListForDavid);

        librarian.listAvailableBooks();




        librarian.lendBook(101, 1);



        librarian.listAvailableBooks();


        librarian.returnBook(101, 1);


        librarian.listAvailableBooks();

        librarian.revokeMembership(101);

        manager.listofLibraryMembers();

        manager.ListofLibrarins();
    }


}
