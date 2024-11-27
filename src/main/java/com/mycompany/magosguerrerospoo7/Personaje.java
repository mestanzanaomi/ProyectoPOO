/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.magosguerrerospoo7;

/**
 *
 * @author Anthony
 */
public abstract class Personaje {
    private String nombre;
    protected int vida;
    protected int ataque;
    protected int defensa;

    public Personaje(String nombre, int vida, int ataque, int defensa) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }
    
    public void recibirAtaque(int dano){
        int danoReal=dano-defensa;
        if (danoReal<=0){
            danoReal=0;
        }else {
            System.out.println(nombre+"recibe "+danoReal+" de daño. Vida restante:"+(vida-danoReal));
        }
        vida-=danoReal;
    }
    public void realizarAtaque(Personaje contrario){
        usarEstrategia();
        contrario.recibirAtaque(this.ataque);  // pasar el valor de ataque 
        
    }
    public int getVida() {
        return vida;
    }
    public abstract void usarEstrategia();
}
