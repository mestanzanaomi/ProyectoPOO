/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.magosguerrerospoo7;

/**
 *
 * @author Anthony
 */
public class Guerrero extends Personaje{
    
    public Guerrero(String nombre, int vida, int ataque, int defensa) {
        super(nombre, vida, ataque, defensa);
    }
    @Override
    public void usarEstrategia(){
        ataque=ataque*2;
    }
}
