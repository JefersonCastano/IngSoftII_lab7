package logica;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @brief Un City_Tour (Hoja)
 * @author Jeferson Castano Ossa <jcastanoossa@unicauca.edu.co>
 * @author David Santiago Giron Munoz <davidgiron@unicauca.edu.co>
*/
public class CityTour extends AbstractPaquete{
    
    private final String identificador;
    private final String nombre;
    private String descripcion;
    private String recomendaciones;
    private int duracion;
    private double precio;
    

    public CityTour(String identificador, String nombre, int duracion, int precio) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
    }
    
    @Override
    public String obtenerPlan() {
        return  identificador + ": " + nombre + "\n" + "*Descripcion: " +descripcion + "\n" + "*Recomendaciones: " + recomendaciones + "\n";
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public int getDuracion() {
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

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @param recomendaciones the recomendaciones to set
     */
    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
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
