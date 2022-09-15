package TrabalhandoComThreads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aless
 */
public class MinhaThreadRunnable implements Runnable{
    
    private int inicio, fim;
    String nome;
    Thread t = new Thread(this);
    public MinhaThreadRunnable(String nome, int inicio, int fim){
            this.nome = nome;
            this.inicio = inicio;
            this.fim = fim;
            Thread t = new Thread(this);
            t.start();
        }
    public void run(){
        for(int i = inicio; i >= fim; i--){
            System.out.println(nome + " Iteracao " + i);
            
        } 
        System.out.println(nome + " Terminou!");
     
    }    
    
}
