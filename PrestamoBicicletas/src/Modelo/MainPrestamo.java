
package Modelo;


public class MainPrestamo {
    
    
    public static void main(String[] args) {
        
        Prestamo p1 = new Prestamo(2163, "B33", "Premium"); 
        Prestamo p2 = new Prestamo(6347, "B34", "Standard"); 
        Prestamo p3 = new Prestamo(8564, "D45", "Standard"); 
        Prestamo p4 = new Prestamo(1244, "B22", "Premium");         
        Prestamo p5 = new Prestamo(2163, "B33", "Premium"); 
        Prestamo p6 = new Prestamo(2163, "B45", "Standard"); 
        Prestamo p7 = new Prestamo(1244, "B11", "Standard"); 
        Prestamo p8 = new Prestamo(2163, "B07", "Premium"); 
        Prestamo p9 = new Prestamo(1244, "D12", "Standard"); 
        Prestamo p10 = new Prestamo(2163, "D45", "Standard"); 
        Prestamo p11 = new Prestamo(2163, "C12", "Premium"); 
        
        Prestamo historialPrestamo[] = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11};
        
        Prestamo nuevoPrestamos = new Prestamo(2163, "B33", "Premium");
        
        System.out.println("Descuento: "+Prestamo.ConsultarDescuento(historialPrestamo, nuevoPrestamos));
        
    }
    
}
