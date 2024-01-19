import java.util.*;
public class Main {
    public static void main(String[] args) {
        IBookManager bookManager = new LibraryManager();
        IMemberManager memberManager = new LibraryManager();
        LibraryManager manager= new LibraryManager();


        Librarian librarian = new Librarian(bookManager,memberManager );


        manager.addNewBook("1984", "George Orwell",  3, "Dystopian");
        manager.addNewBook("To Kill a Mockingbird", "Harper Lee", 2,  "Classic");
        manager.addNewBook("The Hobbit", "J.R.R. Tolkien", 6,  "Fantasy");
        manager.addNewBook("1984", "George Orwell", 7, "Dystopian");
        manager.addNewBook("Brave New World", "Aldous Huxley", 8,  "Dystopian");
        manager.addNewBook("To Kill a Mockingbird", "Harper Lee", 9, "Classic");
        manager.addNewBook("The Catcher in the Rye", "J.D. Salinger", 10,  "Classic");
        manager.addNewBook("The Lord of the Rings", "J.R.R. Tolkien", 11, "Fantasy");
        manager.addNewBook("The Alchemist", "Paulo Coelho", 12,  "Philosophical Fiction");


        manager.listAvailableBooks();


        manager.addBookQuantity(101, 56);





        manager.addLibrarian("John Abraham", 25 );
        manager.addLibrarian("Emma Watson", 30);
        manager.addLibrarian("Michael Smith", 40);
        manager.addLibrarian("Sarah Johnson", 35);
        manager.addLibrarian("David Wilson", 45);
        manager.addLibrarian("Linda Brown", 50);
        manager.addLibrarian("James Williams", 28);

        List<Book> ListForJohn = new ArrayList<>();
        manager.addMember("John Doe", 25,  ListForJohn);

        List<Book> ListForAlice = new ArrayList<>();
        librarian.addMember("Alice Johnson", 30,  ListForAlice);

        List<Book> ListForBob = new ArrayList<>();
        manager.addMember("Bob Smith", 45,  ListForBob);

        List<Book> ListForEmma = new ArrayList<>();
        librarian.addMember("Emma Brown", 22,  ListForEmma);

        List<Book> ListForDavid = new ArrayList<>();
        librarian.addMember("David Wilson", 35,  ListForDavid);






        librarian.lendBook(101, 101);




        librarian.ListOfBorrowedBooks(101);

        librarian.returnBook(101, 101);


        librarian.listAvailableBooks();

        librarian.ListOfBorrowedBooks(101);

        librarian.revokeMembership(101);


        manager.listofLibraryMembers();

        manager.ListofLibrarins();
    }


}
