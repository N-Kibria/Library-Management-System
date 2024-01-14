import java.util.List;

public interface IMemberManager {
    void addMember(String memberId, Integer MemberAge, List<Book> BorrowedBooks);
    LibraryMember findMember(Integer memberId);
    void revokeMembership(Integer memberID);
    void listofLibraryMembers();
}