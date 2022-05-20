import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TripleTacoBoxTest {
    @Test
    public void tacoRemainingTest() {
        TripleTacoBox ttb = new TripleTacoBox();
        assertEquals(3, ttb.tacosRemaining());
    }
    
}
