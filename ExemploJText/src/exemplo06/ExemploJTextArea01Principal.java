package exemplo06;

import java.awt.EventQueue;
/**
 * @author Gabriel de Oliveira Ferreira
 */
public class ExemploJTextArea01Principal {
    
    public static void main(String[] args) {
    
        EventQueue.invokeLater(new Runnable(){
           @Override 
           public void run(){
               new ExemploJTextArea01();
           }
        });
    }
    
}
