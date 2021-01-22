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
public class Personatge {
    private String nom;
    private Jugador soci;
    private Avatar NightElf;
    private int vida;
    
    public int getAtack(){
        int random = (int) (Math.random() * NightElf.getMax_punts_atac());
        return random;
    }
    
    public int getDefensa(){
        int random = (int) (Math.random() * NightElf.getMax_punts_defens());
        return random;
    }

    public Personatge(String nom, int vida, Avatar NightElf) {
        this.nom = nom;
        this.vida = vida;
        this.NightElf = NightElf;
    }

    public String toString() {
        return "Personatge:\n" + "\n\tNom: " + nom + "\n\tVida: " + vida + "\n";
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Jugador getSoci() {
        return soci;
    }

    public void setSoci(Jugador soci) {
        this.soci = soci;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Avatar getNightElf() {
        return NightElf;
    }

    public void setNightElf(Avatar NightElf) {
        this.NightElf = NightElf;
    }
    
    
}
