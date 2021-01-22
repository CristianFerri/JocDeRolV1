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
public class Avatar {
    private String nom;
    private String descripcio;
    private char representacio;
    private int max_punts_atac;
    private int max_punts_defens;

    public Avatar(String nom, String descripcio, char representacio, int max_punts_atac, int max_punts_defens) {
        this.nom = nom;
        this.descripcio = descripcio;
        this.representacio = representacio;
        this.max_punts_atac = max_punts_atac;
        this.max_punts_defens = max_punts_defens;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public char getRepresentacio() {
        return representacio;
    }

    public void setRepresentacio(char representacio) {
        this.representacio = representacio;
    }

    public int getMax_punts_atac() {
        return max_punts_atac;
    }

    public void setMax_punts_atac(int max_punts_atac) {
        this.max_punts_atac = max_punts_atac;
    }

    public int getMax_punts_defens() {
        return max_punts_defens;
    }

    public void setMax_punts_defens(int max_punts_defens) {
        this.max_punts_defens = max_punts_defens;
    }

    public String toString() {
        return "Avatar:\n" + "\n\tRaça: " + nom + "\n\tDescripcio: " + descripcio + "\n\tRepresentacio: " + representacio + "\n\tMàxim punts de atac: " + max_punts_atac + "\n\tMàxim punts de defensa: " + max_punts_defens + "\n";
    }
    
}
