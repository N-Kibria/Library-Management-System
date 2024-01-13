public interface IBookManager {
    void addNewBook(String title, String author, Integer bookId, Integer Quantity, String genre);
    void addBookQuantity(Integer bookId, Integer quantity);
    Book findAvailableBook(Integer bookId);

}