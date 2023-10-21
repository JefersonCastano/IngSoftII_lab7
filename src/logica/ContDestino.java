
package logica;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @brief Un contenedor de destinos (Composite)
 * @author Jeferson Castano Ossa <jcastanoossa@unicauca.edu.co>
 * @author David Santiago Giron Munoz <davidgiron@unicauca.edu.co>
*/
public class ContDestino extends AbstractPaquete{
    
    private ArrayList<AbstractPaquete> destinos = new ArrayList<>(); //Hijos
    private String identificador;
    private String nombre;
    
    
    public ContDestino(String identificador, String nombre){
        this.identificador = identificador;
        this.nombre = nombre;
    }
    
    @Override
    public void addChild(AbstractPaquete child){
        destinos.add(child);
    }
    
    @Override
    public String obtenerPlan() {
        String planCompleto = "";
        planCompleto += "---------------------------------\n";
        planCompleto += identificador + ": " + nombre + "\n";
        for(AbstractPaquete hijo: destinos){
            planCompleto += hijo.obtenerPlan(); //Iteracion de cada hijo
        }
        return planCompleto;
    }

    @Override
    public double getPrecio() {
        double precio = 0;
        for(AbstractPaquete hijo: destinos){
            precio += hijo.getPrecio();   //Suma del precio de cada hijo
        }
        return precio;
    }

    @Override
    public int getDuracion() {
        int duracion = 0;
        for(AbstractPaquete hijo: destinos){
            duracion += hijo.getDuracion(); //Suma de la duracion de cada paquete hijo
        }
        return duracion;
    }

    @Override
    public String getNombre() {
       return nombre;
    }
    
    @Override
    public String getIdentificador() {
        return identificador;
    }
    
    @Override
    public List<AbstractPaquete> getHijos(){
        return destinos;
    }
    
    @Override
    public AbstractPaquete clonar(){
        
        AbstractPaquete  objetoDeserializado;

        try (FileOutputStream archivoSalida = new FileOutputStream("objeto_serializado.ser");
            ObjectOutputStream out = new ObjectOutputStream(archivoSalida)) {
            out.writeObject(this);  // Serializa el objeto y lo guarda en el archivo
        } catch (Exception e) {
            e.printStackTrace();
        }    

        try (FileInputStream archivoEntrada = new FileInputStream("objeto_serializado.ser");
            ObjectInputStream in = new ObjectInputStream(archivoEntrada)) {
            objetoDeserializado = (AbstractPaquete) in.readObject();  // Deserializa el objeto
            return objetoDeserializado;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    
    }  
}
