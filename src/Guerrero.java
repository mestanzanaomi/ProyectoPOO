public class Guerrero extends Personaje{
    public Guerrero(String n,int v,int a,int d){
        super(n,v,a,d);
    }
    
    public void usarEstrategia(){
        this.ataque*=2;
    }
    
}
