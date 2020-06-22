import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Pass {

    @Test
    public void pass(){
        assertEquals(1,new Gay().returnOne());
    }
}
