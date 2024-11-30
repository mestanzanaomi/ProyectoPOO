public class Main {
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Equipo Rojo");
        Equipo equipo2 = new Equipo("Equipo Azul");

        equipo1.agregarPersonaje(new Guerrero("Guerrero Rojo 1", 200, 15, 10));
        equipo1.agregarPersonaje(new Guerrero("Guerrero Rojo 2", 250, 15, 10));
        equipo1.agregarPersonaje(new Mago("Mago Rojo", 150, 12, 5));
        equipo1.agregarPersonaje(new Mistico("Mistico Rojo", 180, 10, 8, equipo1));

        equipo2.agregarPersonaje(new Guerrero("Guerrero Azul 1", 200, 16, 10));
        equipo2.agregarPersonaje(new Guerrero("Guerrero Azul 2", 350, 20, 10));
        equipo2.agregarPersonaje(new Mago("Mago Azul", 150, 13, 5));
        equipo2.agregarPersonaje(new Mistico("Mistico Azul", 180, 11, 8, equipo2));

        int ronda = 1;
      

        while (ronda <= 15 && !equipo1.estaDerrotado() && !equipo2.estaDerrotado()) {
            System.out.println("\n*** Ronda " + ronda + " ***");

            equipo1.atacarOtroEquipo(equipo2);


            if (equipo2.estaDerrotado()) {
                System.out.println("\n¡El Equipo Rojo gana la batalla!");
                break;
            }


            equipo2.atacarOtroEquipo(equipo1);


            if (equipo1.estaDerrotado()) {
                System.out.println("\n¡El Equipo Azul gana la batalla!");
                break;
            }

            ronda++;
        }


        if (ronda > 15 && !equipo1.estaDerrotado() && !equipo2.estaDerrotado()) {
            System.out.println("\n¡La batalla ha llegado al límite de 15 rondas!");

            int vidaTotalEquipo1 = 0;
            for (Personaje p : equipo1.getPersonajes()) {
                vidaTotalEquipo1 += p.getVida();
            }

            int vidaTotalEquipo2 = 0;
            for (Personaje p : equipo2.getPersonajes()) {
                vidaTotalEquipo2 += p.getVida();
            }

            System.out.println("\nVida total del " + equipo1.getNombre() + ": " + vidaTotalEquipo1);
            System.out.println("Vida total del " + equipo2.getNombre() + ": " + vidaTotalEquipo2);

            if (vidaTotalEquipo1 > vidaTotalEquipo2) {
                System.out.println("\nEl Equipo Rojo gana por mayor vida total!");
            } else if (vidaTotalEquipo2 > vidaTotalEquipo1) {
                System.out.println("\nEl Equipo Azul gana por mayor vida total!");
            } else {
                System.out.println("\nEs un EMPATE. Ambos equipos tienen la misma vida total.");
            }
        }
    }
}
