/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.magosguerrerospoo7;

import java.util.ArrayList;

/**
 *
 * @author Anthony
 */
public class Equipo {
    private String nombre;
    private ArrayList<Personaje> personajes;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarPersonaje(Personaje p){
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }
    
    public void atacarOtroEquipo(Equipo e){
    }
    
    public boolean estaDerrotado(){
        return false;
    }
    
}
