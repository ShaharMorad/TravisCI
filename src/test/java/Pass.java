import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Pass {

    @Test
    public void passTest(){
        assertEquals(1,new Gay().returnOne());
    }
}
