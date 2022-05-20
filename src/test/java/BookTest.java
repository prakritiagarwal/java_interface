import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class BookTest {
    @Test
    public void weightTest()
    {
        Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
        assertEquals(2, book1.weight());
    }
    
}
