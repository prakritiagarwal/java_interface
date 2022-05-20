import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CustomTacoBoxTest {

    @Test
    public void tacoRemainingTest() {
        CustomTacoBox box = new CustomTacoBox(5);
        assertEquals(5, box.tacosRemaining());
    }
    
}
