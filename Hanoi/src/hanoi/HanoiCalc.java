package hanoi;

public class HanoiCalc {
    int peças;
    
    public HanoiCalc(int p) {
        this.peças = p;
    }
    
    public double calc() {
        return Math.pow(2, this.peças) -1;
    }
}
