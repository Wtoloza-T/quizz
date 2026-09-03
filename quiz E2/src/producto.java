public class producto {
    // Atributos privados
    private String name;
    private String valor;

    // Constructor
    public producto(String name, String valor) {
        this.name = name;
        this.valor = valor;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getvalor() {
        return this.valor;
    }

    // Método para mostrar información (Opcional)
    public void displayInfo() {
        System.out.println("Nombre del producto: " + this.name);
        System.out.println("valor del producto: " + this.valor);
    }
}
