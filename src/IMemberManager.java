import java.util.List;

public interface IMemberManager {
    void addMember(String memberId, Integer MemberAge, Integer MemberID, List<Book> BorrowedBooks);
    LibraryMember findMember(Integer memberId);
    void deleteMember(Integer memberId);
}