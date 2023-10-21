package logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @brief Clase abstracta para un paquete (Component)
 * @author Jeferson Castano Ossa <jcastanoossa@unicauca.edu.co>
 * @author David Santiago Giron Munoz <davidgiron@unicauca.edu.co>
*/
public abstract class AbstractPaquete implements Serializable {
    
    /**
    * @brief Especifica detalles de lo que incluye el paquete
    * @return Cadena con los detalles del paquete
    */
    public abstract String obtenerPlan ();
    /**
    * @brief Permite obtener el precio del paquete
    * @return Precio del paquete
    */
    public abstract double getPrecio ();
    /**
    * @brief Permite obtener la duracion del paquete
    * @return Duracion del paquete
    */
    public abstract int getDuracion();
    /**
    * @brief Permite obtener el nombre del paquete
    * @return nombre del paquete
    */
    public abstract String getNombre();
    /**
    * @brief Permite obtener el identificador del paquete
    * @return identificador del paquete
    */
    public abstract String getIdentificador();
    
    /**
    * @brief Permite obtener los hijos del contenedor
    * @return lista de los hijos de un paquete (contenedor)
    */
    public List<AbstractPaquete> getHijos(){
        return  new ArrayList<>();
    }
    /**
    * @brief Permite adicionar un nuevo hijo al paquete
    */
    public void addChild(AbstractPaquete child){
        return;
    }
    /**
    * @brief Permite clonar el objeto de paquete
    */
    public abstract AbstractPaquete clonar();
}
