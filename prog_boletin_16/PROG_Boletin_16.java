/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_boletin_16;

/**
 *
 * @author fsancheztemprano
 */
public class PROG_Boletin_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        persona.cantar();
        
        Galo galo = new Galo();
        galo.cantar();
        
        Canario canario = new Canario();
        canario.cantar();
        
    }
    
}
