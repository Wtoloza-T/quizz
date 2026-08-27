public class CPU {
    public double spedd;
   
    public CPU(double spedd){
        this.spedd = spedd;
    }
public double getspedd() {
        return this.spedd;
    }
    public void displayinfo(){
        System.out.println("Velocidad de el cpu:" + this.spedd );
    }
}
