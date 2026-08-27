public class Componentes {
    public static void main(String[] args){
    //Creacion de cpu
    CPU CPU1= new CPU(5.4);
    CPU CPU2= new CPU(2.4);
    CPU CPU3= new CPU(1.6);
//Creacion Ram
    RAM RAM1= new RAM(8);
    RAM RAM2= new RAM(16);
    RAM RAM3= new RAM(32);
// Creacion Disco
    Disco Disco1= new Disco("SSD", 256);
    Disco Disco2= new Disco("SSD", 512);
    Disco Disco3= new Disco("SSD", 1000);
    Disco Disco4= new Disco("HDD", 256);
    Disco Disco5= new Disco("HDD", 512);
    Disco Disco6= new Disco("HDD", 1000);
    
    // Computadores 
    Computador pcgamer= new Computador("Gamer", CPU1, RAM3, Disco3);
    
    pcgamer.displayConfig();
    }
}

