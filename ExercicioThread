package TrabalhandoComThreads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aless
 */
public class MinhaThread extends Thread{
    
    private String nome;
    private int inicio, fim;
    public MinhaThread(String nome, int inicio, int fim){
        this.nome = nome;
        this.inicio = inicio;
        this.fim = fim;
        start();
    }
    
    @Override
    public void run(){
        for(int i = inicio; i <= fim; i++){
            System.out.println(nome + " Iteracao " + i);
         
        }
            System.out.println(nome + " Terminou!");
                
    }
}
