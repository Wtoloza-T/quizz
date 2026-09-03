// Necesitarás la clase Department, la crearemos después.
// Por ahora, puedes dejar el atributo Department y el parámetro del constructor.

public class categoria {
    // Atributos privados
    private String name;
    private String categoriaId;
    private Department department; // Relación de Agregación: Profesor pertenece a un Departamento

    // Constructor
    public categoria(String name, String categoriaId, Department department) {
        this.name = name;
        this.categoriaId = categoriaId;
        this.department = department; // Se recibe un objeto Department existente
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getcategoriaId() {
        return this.categoriaId;
    }

    public Department getDepartment() {
        return this.department;
    }

    // Método para mostrar información (Opcional)
    public void displayInfo() {
        System.out.println("Nombre de la categoria: " + this.name);
        System.out.println("ID de la categoria: " + this.categoriaId);
        if (this.department != null) {
            System.out.println("tienda: " + this.department.getName()); // Asumiendo que Department tiene getName()
        } else {
            System.out.println("tienda no agsinada");
        }
    }
}