public interface IBookManager {
    void addNewBook(String title, String author,  Integer Quantity, String genre);
    void addBookQuantity(Integer bookId, Integer quantity);
    Book findBook(Integer bookId);

}