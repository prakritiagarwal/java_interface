import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CDTest {
    @Test
    public void getWeightTest()
    {
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        assertEquals(0.1, cd2.weight());
    }

    @Test
    public void getNameTest() {
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        assertEquals("Nuclear Nightclub", cd2.getName());
    }
    
}
