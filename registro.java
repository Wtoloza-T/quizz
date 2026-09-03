public class registro {
    public static void main(String[] args) {
        
        producto producto1 = new producto("papas", "2500");
        producto producto2 = new producto("jugo de caja", "3000");
        producto producto3 = new producto("gaseosa", "3500");
        producto producto4 = new producto("atun", "15000");

       
        Department computingDept = new Department("tienda de mario", 5);
        Department physicsDept = new Department("tienda de juan", 3);

     
        categoria cat1 = new categoria("comida", "P2001", computingDept);
        categoria cat2 = new categoria("bebidas", "P2002", computingDept);
        categoria cat3 = new categoria("enlatados", "P2003", physicsDept);

        
        computingDept.addcategoria(cat1);
        computingDept.addcategoria(cat2);
        physicsDept.addcategoria(cat3);

      
        computingDept.displaycategorias();
        System.out.println();
        physicsDept.displaycategorias();
        System.out.println();

       
        Course introToProgramming = new Course("mario", "CS101", 20, cat1); // Capacidad 3
        Course classicalMechanics = new Course("juan", "PHY201", 50, cat3); // Capacidad 2


        introToProgramming.enrollproducto(producto1);
        introToProgramming.enrollproducto(producto2);
        introToProgramming.enrollproducto(producto3);
        introToProgramming.enrollproducto(producto4); 

        classicalMechanics.enrollproducto(producto1);
        classicalMechanics.enrollproducto(producto4); 
        classicalMechanics.enrollproducto(producto2); 


       
        System.out.println();
        introToProgramming.displayEnrolledproducto();
        System.out.println();
        classicalMechanics.displayEnrolledproducto();
        System.out.println();

      
    }
}