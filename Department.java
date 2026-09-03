// Necesitarás la clase categoria

public class Department {
    // Atributos privados
    private String name;
    private categoria[] categorias; // Relación de Agregación: Departamento tiene Profesores (Array pasado externamente)
    private int categoriaCount = 0; // Contador de profesores

    // Constructor
    public Department(String name, int maxcategorias) {
        this.name = name;
        // Agregación: El departamento crea su array para contener referencias a profesores existentes
        this.categorias = new categoria[maxcategorias];
        System.out.println("Departamento '" + this.name + "' creado con capacidad para " + maxcategorias + " categorias.");
    }

   

    // Método para añadir un profesor
    public void addcategoria(categoria categoria) {
        if (this.categoriaCount < this.categorias.length) {
            this.categorias[this.categoriaCount] = categoria; // Añade al array
            this.categoriaCount++; // Incrementa el contador
            // Opcional: Si implementaste bidireccionalidad, llama a categoria.setDepartment(this); aquí
            System.out.println("categoria '" + categoria.getName() + "' agregado a la tienda '" + this.name + "'.");
        } else {
            System.out.println("ERROR: la tienda '" + this.name + "' está lleno. No se puede agregar a '" + categoria.getName() + "'.");
        }
    }

    // Método para mostrar profesores
    public void displaycategorias() {
        System.out.println("categoria en el departamento '" + this.name + "':");
        if (this.categoriaCount == 0) {
            System.out.println("  No hay categorias asignadas.");
        } else {
            // Iterar sobre el array hasta el número de profesores agregados
            for (int i = 0; i < this.categoriaCount; i++) {
                 if (this.categorias[i] != null) {
                    System.out.println("  - " + this.categorias[i].getName() + " (ID: " + this.categorias[i].getcategoriaId() + ")");
                }
            }
        }
    }

    String getName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
