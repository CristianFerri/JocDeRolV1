/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jocderol;
import java.util.*;

/**
 *
 * @author Cristian
 */
public class JocDeRol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String desc_NightElf = "Los elfos nocturnos, elfos de la noche o kal'dorei ((Hijos de las Estrellas) en su lengua nativa, el darnassiano), tienen una historia larga y fascinante. Nativos del continente de Kalimdor, los elfos de la noche dieron fin a un largo período de reclusión al final de la Tercera Guerra y se convirtieron en miembros de la Alianza.";
        
        Avatar NightElf = new Avatar("Elfo de la Noche", desc_NightElf , 'E', 5, 60);
        Personatge Druida = new Personatge("ElPepe", 100, NightElf);
        Jugador soci = new Jugador("Cristian", "cris26301@gmail.com", "1234", Druida);
        
        
        System.out.println("Loading JocDeRol...\n");
        System.out.println(NightElf.toString());
        System.out.println(Druida.toString());
        System.out.println(soci.toString());
        System.out.println("\nExiting JocDeRol...");
        System.out.println("Done.\n");
    }
    
}
