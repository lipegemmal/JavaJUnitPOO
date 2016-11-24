package calculadorajunit;

/**
 *
 * @author Renata
 */
public class Operacoes {

    private double valor1 = 0;
    private double valor2 = 0;
    private double resultado = 0;

    public Operacoes(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    public double somar() {
        resultado = valor1 + valor2;
        return resultado;
    }

    public double subtrair() {
        resultado = valor1 - valor2;
        return resultado;
    }

    public double multiplicar() {
        resultado = valor1 * valor2;
        return resultado;
    }

    public double dividir() {
        resultado = valor1 / valor2;
        return resultado;
    }

    public double raiz() {
        resultado = Math.sqrt(valor1);
        return resultado;
    }
    
    public double porcentagem() {
        return (valor1/valor2) * 100;
    }
    
    public double fatorial() {
        
        int i = (int)valor1;
        int result = (int)valor1;
        
        while(i > 1) {
            result = result *(i-1);
            i--;
        }
        
        return (double)result;
    }
    
    private double fibo(int n) {
        if(n < 2) return n;
        else return fibo(n-1) + fibo(n-2);
    }
    
    public double fibonacci() {
        return fibo((int)valor1);
    }
}
