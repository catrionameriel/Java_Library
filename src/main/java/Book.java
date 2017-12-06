public class Book {

    private String title;
    private String author;

    public Book(String inputTitle, String inputAuthor){
        title = inputTitle;
        author = inputAuthor;
    }


    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }
}
