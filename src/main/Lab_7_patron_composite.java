package main;

import java.util.ArrayList;
import logica.*;
import presentacion.Limitless;

/**
 * @brief Inicializacion de datos del programa y vista
 * @author Jeferson Castano Ossa <jcastanoossa@unicauca.edu.co>
 * @author David Santiago Giron Munoz <davidgiron@unicauca.edu.co>
*/
public class Lab_7_patron_composite {


    public static void main(String[] args) {

        ArrayList<AbstractPaquete> continentes = new ArrayList<>(); //Continentes disponibles para un paquete de la agencia de viajes
        
        ContDestino continenteAm = new Continente("Continente", "America");
        
        ContDestino paisUsa = new Pais("Pais", "USA");
        ContDestino paisMex = new Pais("Pais", "Mexico");
        
        continenteAm.addChild(paisMex);
        continenteAm.addChild(paisUsa);
        
        ContDestino ciudadLA = new Ciudad("Ciudad", "Los Angeles", "Avianca", "Per La", "Todas las comidas", "24/10/23", "1/11/23");
        
        paisUsa.addChild(ciudadLA);
        
        ContDestino ciudadCM = new Ciudad("Ciudad", "Ciudad de mexico", "LatamAirlines", "MX centro", "Desayuno", "1/11/23", "2/11/23");
        ContDestino ciudadMR = new Ciudad("Ciudad", "Monterrey", "Avianca", "Safi", "Almuerzo", "31/10/23", "25/12/23");
        
        paisMex.addChild(ciudadCM);
        paisMex.addChild(ciudadMR);
        
        CityTour tourLA1 = new CityTour("Tour Base", "Del Perro Pier", 4, 50);
        tourLA1.setDescripcion("Incluye visita y entrada libre a los juegos");
        tourLA1.setRecomendaciones("Ropa deportiva");
        
        CityTour tourLA2 = new CityTour("Tour Premium", "Sitios turisticos", 10, 1000);
        tourLA2.setDescripcion("Visita y entrada al Del Perro Pier, visita al paseo de la fama y 3 horas en playa");
        tourLA2.setRecomendaciones("Bloqueador solar e hidratacion");
        
        ciudadLA.addChild(tourLA1);
        ciudadLA.addChild(tourLA2);
        
        CityTour tourCM = new CityTour("Tour Base", "Palacio bellas artes", 4, 100);
        tourCM.setDescripcion("Recorrido por el palacio de las bellas artes");
        tourCM.setRecomendaciones("Mayores de 15 años");
        
        ciudadCM.addChild(tourCM);
        
        CityTour tourMR = new CityTour("Tour Base", "Museo de historia mexicana", 5, 100);
        tourMR.setDescripcion("Recorrido y alimentacion dentro del museo");
        tourMR.setRecomendaciones("Ninguna en especial");
        
        ciudadMR.addChild(tourMR);
        
        continentes.add(continenteAm);
                
        ContDestino continenteEU = new Continente("Continente", "Europa");
        
        ContDestino paisEsp = new Pais("Pais", "España");
        
        continenteEU.addChild(paisEsp);
        
        ContDestino ciudadMad = new Ciudad("Ciudad", "Madrid", "EasyFly", "SafeStay Madrid Central", "Desayuno y almuerzo", "24/12/23", "6/1/24");
        
        paisEsp.addChild(ciudadMad);
        
        CityTour tourMad = new CityTour("Tour guiado", "Santiago Bernabeu", 2, 60);
        tourMad.setDescripcion("Tour por el estadio Santiago Bernabeu");
        tourMad.setRecomendaciones("Ninguna en especial");        
        
        ciudadMad.addChild(tourMad);
        
        continentes.add(continenteEU);
        
  
        //Inicializar vista
        Limitless instance = new Limitless(continentes);
        instance.setVisible(true);
    }
    
}
