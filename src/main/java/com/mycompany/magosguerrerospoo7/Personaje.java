/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.magosguerrerospoo7;

/**
 *
 * @author Anthony
 */
public abstract class Personaje{
    protected String nombre;
    protected int vida;
    protected int ataque;
    protected int defensa;
    

    public Personaje(String n,int v,int a,int d){ //Constructor
        this.nombre=n;
        this.vida=v;
        this.ataque=a;
        this.defensa=d;
    }

    public void realizarAtaque(Personaje contrario){ //Metodo para realizar ataque al oponente 
        this.usarEstrategia();
        contrario.recibirAtaque(this.ataque);
    }

    public void recibirAtaque(int dano){//Metodo para recibir ataque
        int danoReal=dano-this.defensa;

        if(danoReal<0){
            danoReal=0;
        }

        this.vida-=danoReal;
        if(this.vida<0){
            this.vida=0;
        }
        System.out.println(this.nombre+" recibe "+ danoReal+" de daño. Vida Restante "+this.vida);
    }



    public abstract void usarEstrategia();


    public String getNombre() {
        return nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    
}
