public class Disco {
    public String Tipo;
    public int capacidad1;
    
    public  Disco(String Tipo, int capacidad1){
        this.Tipo = Tipo;
        this.capacidad1= capacidad1;
    }
public String getTipo() {
        return this.Tipo;
    }
    public int getcapacidada1() {
        return this.capacidad1;
    }
    public void displayinfo(){
        System.out.println("Tipo de el disco:" + this.Tipo );
        System.out.println("Capacaidada de el disco" + this.capacidad1 );
    }
}
