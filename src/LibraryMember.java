import java.util.List;

public class LibraryMember {

    public String MemberName ;
    public Integer MemberAge ;
    public Integer MemberID ;
    public List<Book> BorrowedBooks ;

    public LibraryMember(String memberName,Integer memberAge, Integer memberID, List<Book> borrowedBooks) {
        this.MemberID=memberID;
        this.MemberAge=memberAge;
        this.MemberName=memberName;
        this.BorrowedBooks=borrowedBooks;

    }


}
