public class Book {
    public String Title ;
    public String Author ;
    public Integer BookID;
    public Integer Quantity;
    public String Genre;

    public Book(String Author ,String title,Integer Quantity,String genre)
    {
        this.Author= Author;
        this.Title=title;
        this.BookID = IdGenerator.generateId(Book.class);
        this.Quantity = Quantity;
        this.Genre=genre;


    }
}
