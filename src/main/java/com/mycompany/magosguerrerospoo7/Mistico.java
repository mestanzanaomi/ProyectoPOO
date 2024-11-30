
package com.mycompany.magosguerrerospoo7;
import java.util.Scanner;

public class Mistico extends Personaje {
    private Equipo equipo;

    public Mistico(String n, int v, int a, int d, Equipo equipo) {
        super(n, v, a, d);
        this.equipo = equipo;
    }
    

    @Override
    public void usarEstrategia() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        
        int dado=(int) (Math.random()*6)+1;
        System.out.println(this.getNombre() + " Elegir un numero entre 1 y 6: ");
        int numUser = sc.nextInt();
        
        if (numUser == dado) {
            int incremento = 0;
            for (Personaje aliado : equipo.getPersonajes()) {
                incremento += aliado.ataque;
            }
            System.out.println("-------------------------------------------------------");
            System.out.println("-------------------ELECCIONES DEL DADO-----------------");
            System.out.println("-------------------------------------------------------");
            System.out.println("El numero elegido por el usuario es: "+numUser);
            System.out.println("El numero del dado es: "+dado);
            System.out.println("Aciertas, el ataque de " + this.getNombre() + " aumenta en " + incremento);
            System.out.println("------------------------------------------------");
            this.ataque += incremento;
        } else {
            System.out.println("-------------------------------------------------------");
            System.out.println("-------------------ELECCIONES DEL DADO-----------------");
            System.out.println("-------------------------------------------------------");
            System.out.println("El numero elegido por el usuario es: "+numUser);
            System.out.println("El numero del dado es: "+dado);
            System.out.println("Fallaste, el ataque de " + this.getNombre() + " permanece igual.");
            System.out.println("-------------------------------------------------------");
        }
        
        
    }
    

}

