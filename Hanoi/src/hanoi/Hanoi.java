package hanoi;
    
import javax.swing.JOptionPane;

public class Hanoi {

    public static void main(String[] args) {
        int x, y;
        String sX, sY;

        sX = JOptionPane.showInputDialog(null, "Digite o número de peças:",
                "Número de peças", JOptionPane.QUESTION_MESSAGE);

        x = Integer.parseInt(sX);
        
        HanoiCalc h = new HanoiCalc(x);
        
        JOptionPane.showMessageDialog(null, "Quantidade de movimentos: " + h.calc());
    }
    
}
