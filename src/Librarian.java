import java.util.*;
class Librarian extends LibraryEmployee implements IMemberManager {
    private IBookManager bookManager;
    private IMemberManager memberManager;


    public Librarian(IBookManager bookManager,IMemberManager memberManager) {

        this.bookManager = bookManager;
        this.memberManager = memberManager;
    }


    public Librarian(String Name,Integer age,Integer Id) {
        this.Name=Name;
        this.Age=age;
        this.ID=Id;

    }


    public void lendBook(Integer memberID, Integer bookID) {
        LibraryMember member = findMember(memberID);
        if (member == null) {
            System.out.println("Member not found.");
            return;
        }

        Book book = bookManager.findAvailableBook(bookID);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        } else if(book.Quantity > 0) {
            member.BorrowedBooks.add(book);
            book.Quantity--;
        } else {
            System.out.println("Book is already lent.");
        }

        System.out.println(memberID + " has borrowed " + bookID + ".");
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
        System.out.println(memberId + " has returned " + bookId + ".");
    }
    public void listAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {

            System.out.println(book.Title + " by " + book.Author);

        }
    }


    @Override
    public void addMember(String memberId, Integer MemberAge, Integer MemberID, List<Book> BorrowedBooks) {
        memberManager.addMember(memberId, MemberAge, MemberID, BorrowedBooks);
    }

    @Override
    public LibraryMember findMember(Integer memberId)
    {
        return memberManager.findMember(memberId);
    }

    @Override
    public void deleteMember(Integer memberId) {
        LibraryMember m= findMember(memberId);
        members.remove(m);

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
        LibraryMember memberToRemove = null;


        for (LibraryMember member : members) {
            if (member.MemberID.equals(memberID)) {
                memberToRemove = member;

                break;
            }
        }

        if (memberToRemove != null) {

            members.remove(memberToRemove);
            System.out.println("Membership for Member ID " + memberID + " has been canceled.");
        } else {
            System.out.println("Member not found.");
        }
    }
}
