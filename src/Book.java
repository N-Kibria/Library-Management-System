public class Book {
    public String Title ;
    public String Author ;
    public Integer BookID;
    public Integer Quantity;
    public String Genre;
    public Book() {}
    public Book(String Author ,String title,Integer BookID,Integer Quantity,String genre)
    {
        this.Author= Author;
        this.Title=title;
        this.BookID=BookID;
        this.Quantity = Quantity;
        this.Genre=genre;


    }
}
