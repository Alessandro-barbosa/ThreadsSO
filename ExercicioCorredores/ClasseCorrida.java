package TrabalhandoComThreadsExercicio2SO.newpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aless
 */
public class MinhaThreadCorrida extends Thread {
    private String nome;
    private int tam;
    private int tempo_descanso;    
    public MinhaThreadCorrida (String nome, int tam, int tempo_descanso){
        this.nome = nome;
        this.tam = tam;
        this.tempo_descanso = tempo_descanso;   
        start();
    }
    
        public void run(){
            int cont = 0;
            for (int i = tam; i > 0; i--) {
                if (i == (tam / 2)){
                    System.out.println("Corredor " + nome + " Está Descansando");                    
                    try {
                        MinhaThreadCorrida.sleep(tempo_descanso * 1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MinhaThreadCorrida.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                System.out.println("Faltam " + i +" metros para o corredor " + nome);
            }
            System.out.println("Corredor " + nome +" --- Chegou!");   
             System.exit(0);            
    }
}
