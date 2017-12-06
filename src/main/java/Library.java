import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> stock;

    public Library(String inputName) {
        name = inputName;
        stock = new ArrayList<>();
    }


    public int countStock() {
        return this.stock.size();
    }

    public String getName() {
        return this.name;
    }

    public void addBook(Book book) {
        this.stock.add(book);
    }

    public Book loanBook(Book book) {
        int index = this.stock.indexOf(book);
        return this.stock.remove(index);
    }
}
