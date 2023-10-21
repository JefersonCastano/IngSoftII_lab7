package logica;

/**
 * @brief Clase ciudad del tipo ContDestino (Composite)
 * @author Jeferson Castano Ossa <jcastanoossa@unicauca.edu.co>
 * @author David Santiago Giron Munoz <davidgiron@unicauca.edu.co>
*/
public class Ciudad extends ContDestino{
    
    private String vueloLlegada;
    private String hotel;
    private String planAlimentacion;
    private String dateCheckIn;
    private String dateCheckOut;

    public Ciudad(String identificador, String nombre, String vueloLlegada, String hotel, String planAlimentacion, String dateCheckIn, String dateCheckOut) {
        super(identificador, nombre);
        this.vueloLlegada = vueloLlegada;
        this.hotel = hotel;
        this.planAlimentacion = planAlimentacion;
        this.dateCheckIn = dateCheckIn;
        this.dateCheckOut = dateCheckOut;
    }
    
    @Override
    public String obtenerPlan() {
        String planCompleto = "";
        planCompleto += "---------------------------------\n";
        planCompleto += getIdentificador() + ": " + getNombre() + "\n";
        planCompleto += 
                "Vuelo llegada: " + vueloLlegada + 
                "\nHotel: " + hotel + 
                "\nPlan de alimentacion: " + planAlimentacion+
                "\nFecha checkIn: " + dateCheckIn+
                "\nFecha checkOut: " + dateCheckOut + "\n";
        for(AbstractPaquete hijo: getHijos()){
            planCompleto += "---------------------------------\n";
            planCompleto += "*" + hijo.obtenerPlan();
        }
        return planCompleto;
    }  
}
