import java.util.*;
class Librarian extends LibraryEmployee implements IMemberManager {
    private IBookManager bookManager;
    private IMemberManager memberManager;



    public Librarian(IBookManager bookManager,IMemberManager memberManager) {

        this.bookManager = bookManager;
        this.memberManager = memberManager;
    }


    public Librarian(String Name,Integer age) {
        this.Name=Name;
        this.Age=age;
        this.ID = IdGenerator.generateId(Librarian.class);

    }


    public void lendBook(Integer memberID, Integer bookID) {

        LibraryMember member = findMember(memberID);
        if (member == null) {
            System.out.println("Member not found.");
            return;
        }

        Book book = bookManager.findBook(bookID);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        } else if(book.Quantity > 0 && member.borrowedNumber<11) {
            member.BorrowedBooks.add(book);
            member.borrowedNumber++;
            book.Quantity--;
        } else {
            System.out.println("Book is already lent.");
        }

        System.out.println(member.MemberName + " has borrowed " + book.Title + ".");
    }

    public void returnBook(Integer memberId, Integer bookId) {
        LibraryMember member = memberManager.findMember(memberId);
        if (member == null) {
            System.out.println("Member not found.");
            return;
        }


        Book book = findBorrowedBook(member, bookId);
        if (book == null) {
            System.out.println(memberId + " did not borrow " + bookId + ".");
            return;
        }

        member.BorrowedBooks.remove(book);
        book.Quantity++;
        member.borrowedNumber--;
        System.out.println(memberId + " has returned " + bookId + ".");
    }

    public void listAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {

            System.out.println(book.Title + " by " + book.Author +"  Quantity: " +book.Quantity);

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

    @Override
    public void addMember(String memberId, Integer MemberAge,  List<Book> BorrowedBooks) {
        memberManager.addMember(memberId, MemberAge,  BorrowedBooks);
    }

    @Override
    public LibraryMember findMember(Integer memberId)
    {
        return memberManager.findMember(memberId);
    }





    private Book findBorrowedBook(LibraryMember member, Integer bookId) {
        for (Book book : member.BorrowedBooks) {
            if (book.BookID.equals(bookId)) {
                return book;
            }
        }
        return null;
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
    public void ListOfBorrowedBooks(Integer ID )
    {
        LibraryMember member= findMember(ID);
        System.out.println("Books borrowed by " + member.MemberID );
        for (Book book: member.BorrowedBooks) {

            System.out.println("title " + book.Title );
        }
        System.out.println("total :" + member.borrowedNumber );
    }

}
