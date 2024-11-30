/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.magosguerrerospoo7;
import java.util.Random;
/**
 *
 * @author Anthony
 */
public class Mago extends Personaje {
    private Equipo equipo;

    public Mago(String n, int v, int a, int d, Equipo equipo) {
        super(n, v, a, d);
        this.equipo = equipo;
    }

    @Override
    public void usarEstrategia() {
        if (this.equipo == null) {
            System.out.println(this.getNombre() + " no tiene equipo asignado. No puede usar su estrategia.");
            System.out.println("ññññññññññññññññññññññññññññññññññññññññ");
            return;
        }

        if (equipo.getPersonajes().size() > 1) {
            Random random = new Random();

            // Se selecciona un personaje del equipo
            Personaje aliado = null;
            while (aliado == null || aliado == this) {
                aliado = equipo.getPersonajes().get(random.nextInt(equipo.getPersonajes().size()));
            }

            // Se le aumenta la vida al personaje
            int aumentoVida = (int) (0.25 * this.getVida());
            aliado.setVida(aliado.getVida() + aumentoVida);

           
            System.out.println(this.getNombre() + " ha aumentado la vida de " + aliado.getNombre() + " en " + aumentoVida + " puntos.");
            System.out.println(aliado.getNombre() + " ahora tiene " + aliado.getVida() + " puntos de vida.");
        } else {
            System.out.println(this.getNombre() + " no puede usar la estrategia, ya que no hay otros personajes en su equipo.");
        }
    }
}

