// Necesitarás las clases categoria y categoria

public class Course {
    // Atributos privados
    private String name;
    private String courseCode;
    private int maxCapacity;
    private categoria categoria; // Relación de Asociación: Curso tiene un Profesor
    private producto[] enrolledproducto; // Relación (simulando Composición para Array): Curso tiene Estudiantes
    private int categoriaCount = 0; // Contador de estudiantes matriculados
    private int productoCount;

    // Constructor
    public Course(String name, String courseCode, int maxCapacity, categoria categoria) {
        this.name = name;
        this.courseCode = courseCode;
        this.maxCapacity = maxCapacity;
        this.categoria = categoria;
        // Composición (simulada con Array): El curso crea su array de estudiantes
        this.enrolledproducto = new producto[maxCapacity];
        System.out.println("tienda '" + this.name + "' creado con capacidad para " + maxCapacity + " productos.");
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getCourseCode() {
        return this.courseCode;
    }

    public int getMaxCapacity() {
        return this.maxCapacity;
    }

    public categoria getcategoria() {
        return this.categoria;
    }

    public producto[] getEnrolledproducto() {
        // Buena práctica: devolver una copia del array o un elemento específico
        // Por simplicidad en este ejercicio, devolveremos la referencia directa,
        // pero ten en cuenta que esto rompe el encapsulamiento del array interno.
        return this.enrolledproducto;
    }

    public int getproductoCount() {
        return this.getproductoCount();
    }


    // Método para matricular un estudiante
    public void enrolproducto(producto producto) {
        if (this.getproductoCount() < this.maxCapacity) {
            this.enrolledproducto[this.getproductoCount()] = producto; // Añade al array
            this.productoCount++; // Incrementa el contador
            System.out.println("producto '" + producto.getName() + "' agsinado en '" + this.name + "'.");
        } else {
            System.out.println("ERROR: la tienda  '" + this.name + "' está lleno. No se puede agsinar a '" + producto.getName() + "'.");
        }
    }

    // Método para mostrar estudiantes matriculados
    public void displayEnrolledproducto() {
        System.out.println("productos agsinados en '" + this.name + "':");
        if (this.categoriaCount == 0) {
            System.out.println("  No hay productos agsinados.");
        } else {
            // Iterar sobre el array hasta el número de estudiantes matriculados
            for (int i = 0; i < this.categoriaCount; i++) {
                // Asegurarse de que el elemento no sea null (aunque con categoriaCount no debería serlo aquí)
                if (this.enrolledproducto[i] != null) {
                     System.out.println("  - " + this.enrolledproducto[i].getName() + " (ID: " + this.enrolledproducto[i].getvalor() + ")");
                }
            }
        }
    }

    public void enrollproducto(producto producto1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enrollproducto'");
    }
}