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
        this.personajes.add(p);
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }
    
    public void atacarOtroEquipo(Equipo e){
        System.out.println("El equipo "+ this.nombre+ " está atacado al equipo "+e);
        for(int i=0;i<this.personajes.size();i++){
            Personaje atacante=this.personajes.get(i);

            if(atacante.getVida()>0){

                if(i<e.getPersonajes().size()){
                    Personaje defensor=e.getPersonajes().get(i);

                    if(defensor.getVida()>0){
                        atacante.realizarAtaque(defensor);
                    }
                }
            }
        }
    }
    
    public boolean estaDerrotado(){
        for(Personaje p:this.personajes){
            if(p.getVida()>0){
                return false;
            }
        }
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return nombre; 
    }
    
}
