import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PatronTest {

    private Patron patron;
    private Book book;
    private Book anotherBook;
    private Book aThirdBook;
    private Library library;

    @Before
    public void before(){
        patron = new Patron("Pete", 2);
        book = new Book("Jack Reacher: Die Trying", "Lee Child");
        anotherBook = new Book("Asterios Polyp", "David Mazzucchelli");
        aThirdBook = new Book("The Psychopath Test", "Jon Ronson");
        library = new Library("Anniesland");
        library.addBook(book);
        library.addBook(aThirdBook);
        library.addBook(anotherBook);
    }

    @Test
    public void hasName(){
        assertEquals("Pete", patron.getName());
    }

    @Test
    public void hasNoLoanedBooks(){
        assertEquals(0, patron.countBooks());
    }

    @Test
    public void hasLoanMax(){
        assertEquals(2, patron.getLoanMax());
    }


    @Test
    public void canBorrowBook(){
        patron.borrowBook(library, book);
        assertEquals(1, patron.countBooks());

    }

    @Test
    public void canBorrowLotsOfBooks(){
        patron.borrowBook(library, book);
        patron.borrowBook(library, anotherBook);
        patron.borrowBook(library, aThirdBook);
        assertEquals(2, patron.countBooks());

    }

    @Test
    public void cannotBorrowTooManyBooks(){
        for (int i = 0; i < library.getBooks().size(); i++) {
            patron.borrowBook(library, library.getBooks().get(i));
        }
        assertEquals(2, patron.countBooks());
    }


}
