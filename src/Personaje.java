public abstract class Personaje{
    protected String nombre;
    protected int vida;
    protected int ataque;
    protected int defensa;

    public Personaje(String n,int v,int a,int d){
        this.nombre=n;
        this.vida=v;
        this.ataque=a;
        this.defensa=d;
    }

    public void realizarAtaque(Personaje contrario){
        this.usarEstrategia();
        contrario.recibirAtaque(this.ataque);
    }

    public void recibirAtaque(int dano){
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


    public int getVida() {
        return vida;
    }

    public abstract void usarEstrategia();

    public String getNombre() {
        return nombre;
    }

    
}