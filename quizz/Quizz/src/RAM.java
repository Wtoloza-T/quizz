public class RAM {
    public int capacidad;
   
    public  RAM(int capacidad){
        this.capacidad = capacidad;
    }
public int getcapacidad() {
        return this.capacidad;
    }
    public void displayinfo(){
        System.out.println("Capacidada de la ram" + this.capacidad );
    }
}
