public class Computador {
    private String model;
    private CPU cpu;
    private RAM ram;
    private Disco disco;

    public Computador(String model, CPU CPU, RAM RAM, Disco Disco) {
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
        this.disco = disco;
    }

    public void displayConfig() {
        System.out.println("=== CONFIGURACIÓN DEL COMPUTADOR: " + this.model + " ===");
        this.cpu.displayinfo();
        this.ram.displayinfo();
        this.disco.displayinfo();
    }
}
