package Modelo;

public class Prestamo {
    
    // Atributos
    private int IdUsuario;
    private String IdBicicleta;
    private String ModeloBicicleta;
    
    // Contructor
    public Prestamo(int IdUsuario, String IdBicicleta, String ModeloBicicleta) {
        this.IdUsuario = IdUsuario;
        this.IdBicicleta = IdBicicleta;
        this.ModeloBicicleta = ModeloBicicleta;
    }
    
    public Prestamo() {
    }

    // set y get 

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getIdBicicleta() {
        return IdBicicleta;
    }

    public void setIdBicicleta(String IdBicicleta) {
        this.IdBicicleta = IdBicicleta;
    }

    public String getModeloBicicleta() {
        return ModeloBicicleta;
    }

    public void setModeloBicicleta(String ModeloBicicleta) {
        this.ModeloBicicleta = ModeloBicicleta;
    }

    public static int ConsultarDescuento(Prestamo[] historialPrestamo, Prestamo nuevoPrestamo){
        // Implementar la logica del negocio
        int descuento = 0, cont = 0;
        // Ciclo for para recorrer el vector con el historial de los prestamos
        for (int i = 0; i < historialPrestamo.length; i++) {
            System.out.println(historialPrestamo[i].IdUsuario);
            if (nuevoPrestamo.IdUsuario == historialPrestamo[i].IdUsuario){
                cont += 1;
            }
        }  
        // Calcular el descuento 
        if (cont < 3){
            descuento = 0;
        }else if (cont >= 3 && cont<=5){
            descuento = 4;
        }else{ // Descuento extra por tipo de bicicleta 
            if (nuevoPrestamo.ModeloBicicleta.equals("Standard")){
                descuento = 8;    
            } else if (nuevoPrestamo.ModeloBicicleta.equals("Premium")){
                descuento = 9;               
            }
        }
        return descuento;
    }
}
