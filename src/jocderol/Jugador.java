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
public class Jugador {
    private String nom;
    private String email;
    private String pass;
    private Personatge rol;

    public Jugador(String nom, String email, String pass, Personatge rol) {
        this.nom = nom;
        this.email = email;
        this.pass = pass;
        this.rol = rol;
    }

    public String toString() {
        return "Jugador: \n" + "\n\tNom: " + nom + "\n\tE-mail: " + email + "\n\tpass: " + pass + "\n";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Personatge getRol() {
        return rol;
    }

    public void setRol(Personatge rol) {
        this.rol = rol;
    }

    
    }
