import java.util.ArrayList;
import java.util.List;

public class LibraryManager extends LibraryEmployee implements IBookManager, IMemberManager{

    private final List<Librarian> librarians;

    public LibraryManager() {

        librarians = new ArrayList<>();
    }


    @Override
    public void addNewBook(String title, String author, Integer Quantity,String genre) {

        books.add(new Book(title, author, Quantity,genre));
    }
    @Override
    public void addBookQuantity( Integer bookId,Integer quantity) {
        Book book = findBook(bookId);
        if(book!=null) {
            book.Quantity += quantity;
            System.out.println("number of "+book.Title+" :" + book.Quantity);
        }

    }
    public void revokeMembership(Integer memberID) {



        LibraryMember memberToRemove= findMember(memberID);

        if (memberToRemove != null) {

            members.remove(memberToRemove);
            System.out.println("Membership for Member ID " + memberID + " has been canceled.");
        } else {
            System.out.println("Member not found.");
        }
    }





    public void ListofLibrarins() {
        System.out.println("Librarians:");
        for (Librarian librarian : librarians) {

            System.out.println("Librarian ID: " + librarian.ID);
            System.out.println("Librarian Name: " + librarian.Name);

        }
    }
    @Override
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

            System.out.println(book.Title + " by " + book.Author +"   Quantity:  " +book.Quantity);

        }
    }
    @Override
    public void addMember(String memberId,Integer MemberAge,List<Book>BorrowedBooks) {
        members.add(new LibraryMember(memberId,MemberAge, BorrowedBooks));
    }
    @Override
    public LibraryMember findMember(Integer memberId) {
        for (LibraryMember member : members) {
            if (member.MemberID.equals(memberId)) {
                return member;
            }
        }
        return null;
    }
    @Override
    public Book findBook(Integer bookId) {
        for (Book book : books) {
            if (book.BookID.equals(bookId) && book.Quantity >0) {
                System.out.println(book.Title +"\t" + book.Quantity);
                return book;
            }

        }
        System.out.println("Book is not available");
        return null;
    }




    public void addLibrarian(String Name,Integer Age) {
        librarians.add(new Librarian(Name,Age));
    }


}