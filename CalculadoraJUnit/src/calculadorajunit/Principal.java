package calculadorajunit;

import javax.swing.JOptionPane;

/**
 *
 * @author Renata
 */
public class Principal {

    public static void main(String args[]) {

        int x, y;
        String sX, sY;

        sX = JOptionPane.showInputDialog(null, "Digite o primeiro número:",
                "Primeiro número", JOptionPane.QUESTION_MESSAGE);

        x = Integer.parseInt(sX);

        sY = JOptionPane.showInputDialog(null, "Digite o segundo número:",
                "Segundo número", JOptionPane.QUESTION_MESSAGE);

        y = Integer.parseInt(sY);

        // instanciação de um objeto da classe calculadora
        Operacoes calc = new Operacoes(x, y);

        JOptionPane.showMessageDialog(null, "somar: " + calc.somar());
        JOptionPane.showMessageDialog(null, "subtrair: " + calc.subtrair());
        JOptionPane.showMessageDialog(null, "multiplicar: " + calc.multiplicar());
        JOptionPane.showMessageDialog(null, "dividir: " + calc.dividir());
        JOptionPane.showMessageDialog(null, "raiz: " + calc.raiz());
        JOptionPane.showMessageDialog(null, "porcentagem: " + calc.porcentagem());
        JOptionPane.showMessageDialog(null, "fatorial: " + calc.fatorial());
        JOptionPane.showMessageDialog(null, "fibonacci: " + calc.fibonacci());
        
        System.exit(0);
    }

}
