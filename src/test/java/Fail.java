import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Fail {

    @Test
    public void failTest(){
        assertEquals(2,new Gay().returnOne());
    }
}
