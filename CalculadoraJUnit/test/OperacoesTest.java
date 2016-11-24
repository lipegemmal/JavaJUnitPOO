
import calculadorajunit.Operacoes;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Renata
 */
public class OperacoesTest {

    @Test   
    public void testSomar() {
        System.out.println("somar");
        Operacoes instance = new Operacoes(5,5);
        double expResult = 10.0;
        double result = instance.somar();
        assertEquals("Valor da soma não é o esperado", expResult, result, 0);
    }
// 
//    /**
//     * Test of subtrair method, of class Operacoes.
//     */
    @Test
    public void testSubtrair() {
        System.out.println("subtrair");
        int n1 = 5;
        int n2 = 3;
        Operacoes instance = new Operacoes(5,3);
        double expResult = 2;
        double result = instance.subtrair();
        assertEquals(expResult, result, 0);
        assertNotEquals(3, result, 0);
    }
// 
//    /**
//     * Test of multiplicar method, of class Operacoes.
//     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        Operacoes instance = new Operacoes(2,3);
        double expResult = 6;
        double result = instance.multiplicar();
        assertEquals(expResult, result, 0);
        assertNotEquals(4, result, 0);
    }
// 
//    /**
//     * Test of dividir method, of class Operacoes.
//     */
    @Test
    public void testDividir() {
        System.out.println("dividir");

        Operacoes instance = new Operacoes(5,2);
        double expResult = 2.5;
        double result = instance.dividir();
        assertEquals(expResult, result, 0);
        assertNotEquals(3, result, 0);
    }
    
    @Test
    public void testRaiz() {
        System.out.println("raiz");

        Operacoes instance = new Operacoes(4,0);
        double expResult = 2.0;
        double result = instance.raiz();
        assertEquals(expResult, result, 0);
        assertNotEquals(3, result, 0);
    }
    
    @Test
    public void testPorcentagem() {
        System.out.println("porcentagem");

        Operacoes instance = new Operacoes(1,2);
        double expResult = 50.0;
        double result = instance.porcentagem();
        assertEquals(expResult, result, 0);
        assertNotEquals(3, result, 0);
    }
    
    @Test
    public void testFatorial() {
        System.out.println("fatorial");

        Operacoes instance = new Operacoes(10,2);
        double expResult = 3628800.0;
        double result = instance.fatorial();
        assertEquals(expResult, result, 0);
        assertNotEquals(3, result, 0);
    }
    
    @Test
    public void testFibonacci() {
        System.out.println("fibonacci");

        Operacoes instance = new Operacoes(10,2);
        double expResult = 55.0;
        double result = instance.fibonacci();
        assertEquals(expResult, result, 0);
        assertNotEquals(3, result, 0);
    }
}