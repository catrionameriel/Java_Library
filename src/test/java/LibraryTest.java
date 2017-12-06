import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library newLibrary;
    private Book book;
    private Book anotherBook;

    @Before
    public void before(){
        newLibrary = new Library("Polwarth");
        book = new Book("The Psychopath Test", "Jon Ronson");
        anotherBook = new Book("Asterios Polyp", "David Mazzucchelli");
    }

    @Test
    public void hasName(){
        assertEquals("Polwarth", newLibrary.getName());
    }

    @Test
    public void hasNoBooks(){
        assertEquals(0, newLibrary.countStock());
    }

    @Test
    public void canAddBook(){
        newLibrary.addBook(book);
        assertEquals(1, newLibrary.countStock());
    }

    @Test
    public void canRemoveBook(){
        newLibrary.addBook(book);
        newLibrary.addBook(anotherBook);
        newLibrary.loanBook(book);
        assertEquals(1, newLibrary.countStock());
    }



}
