import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book newBook;

    @Before
    public void before(){
        newBook = new Book("The Psychopath Test", "Jon Ronson");
    }

    @Test
    public void hasTitle(){
        assertEquals("The Psychopath Test", newBook.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Jon Ronson", newBook.getAuthor());
    }

}
