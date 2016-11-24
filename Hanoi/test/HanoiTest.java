import hanoi.HanoiCalc;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class HanoiTest {
    
    @Test
    public void testHanoi() {
        System.out.println("HanoiCalc");
        HanoiCalc instance = new HanoiCalc(7);
        double expResult = 127.0;
        double result = instance.calc();
        assertEquals("Quantidade de movimentos errado", expResult, result, 0);
    }
    
    
}
