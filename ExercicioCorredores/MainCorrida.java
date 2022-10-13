package TrabalhandoComThreadsExercicio2SO.newpackage;

/**
 *
 * @author aless
 */
public class TesteCorrida {
    public static void main(String[] args) {
        MinhaThreadCorrida c1 = new MinhaThreadCorrida("1", 10, 2);
        MinhaThreadCorrida c2 = new MinhaThreadCorrida("2", 10, 2);
        MinhaThreadCorrida c3 = new MinhaThreadCorrida("3", 10, 2);
        MinhaThreadCorrida c4 = new MinhaThreadCorrida("4", 10, 2);        
    }    
}
