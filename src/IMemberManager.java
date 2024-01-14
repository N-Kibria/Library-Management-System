import java.util.List;

public interface IMemberManager {
    void addMember(String memberId, Integer MemberAge, Integer MemberID, List<Book> BorrowedBooks);
    LibraryMember findMember(Integer memberId);
    void revokeMembership(Integer memberID);
    void listofLibraryMembers();
}