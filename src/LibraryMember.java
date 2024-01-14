import java.util.List;

public class LibraryMember {

    public String MemberName ;
    public Integer MemberAge ;
    public Integer MemberID ;
    public List<Book> BorrowedBooks ;
    public Integer borrowedNumber;


    public LibraryMember(String memberName,Integer memberAge, List<Book> borrowedBooks) {
        this.MemberID = IdGenerator.generateId(LibraryMember.class);
        this.MemberAge=memberAge;
        this.MemberName=memberName;
        this.BorrowedBooks=borrowedBooks;
        borrowedNumber=0;

    }



}
