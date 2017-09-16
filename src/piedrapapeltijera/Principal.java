/*
    Trabajo Pratico 2 - Construccion de Software.
    Juan Guillermo Diosa Muñoz  C.c 1.037.655.777
    Lunes y Viernes 8:00 - 10:00 PM
*/
package piedrapapeltijera;

public class Principal {                                                        //Clase Principal.

    public static void main(String[] args) {                                    //Metodo main
        
        
        Persona p = new Persona();                                              //Objeto p de la clase Persona().
        
        p.solicitarDatosPersona();                                              //Utilizacion del metodo solicitarDatosPersona alojado en el objeto p de la clase Persona().
        p.mostrarDatosPersona();                                                //Utilizacion del metodo mostrarDatosPersona alojado en la variable p de la clase Persona().
        
        
        Juego j = new Juego();                                                  //Objeto j de la clase Juego().
       
        j.jugar();                                                              //Utilizacion del metodo jugar alojado en la clase Juego().
        j.generarJuegoComputador();                                             //Utilizacion del metodo generarJuegoComputador alojado en la clase Juego().
        System.out.println("");                                                 //Espacio entre lineas.
        j.buscarEImprimirGanadorFinal();                                        //Utilizacion del metodo buscarEImprimirGanadorFinal alojado en la clase Juego().
    }
    
}
