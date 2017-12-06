import java.util.ArrayList;

public class Patron {

    private String name;
    private ArrayList<Book> loanedBooks;
    private int loanMax;

    public Patron(String inputName, int inputLoanNumber){
        name = inputName;
        loanedBooks = new ArrayList<>();
        loanMax = inputLoanNumber;
    }

    public String getName() {
        return this.name;
    }

    public int countBooks() {
        return this.loanedBooks.size();
    }

    public int getLoanMax(){
        return this.loanMax;
    }

    public void borrowBook(Library library, Book book) {
        if(this.countBooks() < this.getLoanMax()) {
            this.loanedBooks.add(library.loanBook(book));
        }
    }
}
