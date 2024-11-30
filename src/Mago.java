import java.util.Random;

public class Mago extends Personaje{
    private Equipo equipo;

    public Mago(String n, int v, int a, int d) {
        super(n, v, a, d);
    }

    

    @Override
    public void usarEstrategia() {
        if (this.equipo == null) {
            System.out.println("Equipo no asignado correctamente.");
            
            return;
        }

        Random random = new Random();
        int indiceAleatorio = random.nextInt(equipo.getPersonajes().size());
        Personaje personajeAleatorio = equipo.getPersonajes().get(indiceAleatorio);

        int incrementoVida = (int)(this.vida * 0.25);
        personajeAleatorio.vida += incrementoVida;

        System.out.println(this.nombre + " usa su estrategia y aumenta la vida de " + personajeAleatorio.getNombre() + " en " + incrementoVida);
        System.out.println(personajeAleatorio.getNombre() + " ahora tiene " + personajeAleatorio.getVida() + " de vida.");
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

}
