/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_githubii;

/**
 *
 * @author maanu_358j11i
 */
public class PRACTICA_GITHUBII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PERSONAS anonimo = new PERSONAS();
        
        System.out.println(anonimo.getEdad());
        
        PERSONAS manu = new PERSONAS("Manuel", "Salvatierra", 21, "Armilla");
        
        System.out.println(manu.getNombre());

    }
    
}
