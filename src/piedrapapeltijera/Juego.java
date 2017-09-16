/*
    Trabajo Pratico 2 - Construccion de Software.
    Juan Guillermo Diosa Muñoz  C.c 1.037.655.777
    Lunes y Viernes 8:00 - 10:00 PM
*/
package piedrapapeltijera;

import java.util.Random;                                                        //Importamos el metodo Random.
import java.util.Scanner;                                                       //Importamos el metodo Scanner.


public class Juego {                                                            //Clase Juego.
    
    int jugadaPersona;                                                          //Atributos de la clase Juego.
    int jugadaCompu;                                                            //Atributos de la clase Juego.
    
    int puntosC=0;                                                              //Acumulador de puntos para el computador.
    int puntosP=0;                                                              //Acumulador de puntos para la persona.
        
    
    public void generarJuegoComputador(){                                       //Metodo generarJuegoComputador.
        Random ram = new Random();                                              //Creacion del Random.
        jugadaCompu = ram.nextInt(3);                                           //Jugada del computador,# Random entre 0 a 2.
    }
    public void jugar(){                                                        //Metodo jugar.
        Scanner sc = new Scanner(System.in);                                    //Metodo Scanner para recibir texto por teclado.
        
        for (int i=1; i<=3; i++){                                               //Ciclo For para el # de ronda en que va el juego.
            

            System.out.println("\t RONDA "+i);                                  //Texto en consola, concatenado con el numerod de ronda. 
            System.out.println("Selecciona tu jugada escribiendo un numero -->"); //Texto en consola para dar instrucciones al jugador.
            System.out.println(" 0 Piedra \n 1: Papel \n 2: Tijera");           //Jugadas permitidas (0-1-2).
            jugadaPersona = sc.nextInt();                                       //Jugada de la persona 0,1 o 2.
            generarJuegoComputador();                                           //Invocacion del metodo generarJuegoComputador().
            if(jugadaPersona == jugadaCompu){                                   //If para saber si existe un empate.
                puntosP = puntosP+0;                                            //Acumulador de puntos de persona +0 por empate.
                puntosC = puntosC+0;                                            //Acumulador de puntos de Computador +0 por empate.
            }else if(jugadaPersona==0 && jugadaCompu ==1 || jugadaPersona==1 && jugadaCompu==2 || jugadaPersona==2 && jugadaCompu==0){   //Posibles jugadas en las que gana el computador.                        
                puntosC = puntosC+1;                                            //Acumulador de puntos de computador +1 si gana el computador.
            }else if(jugadaPersona==1 && jugadaCompu==0 || jugadaPersona==2 && jugadaCompu==1 || jugadaPersona==0 && jugadaCompu==2) {   //Posibles jugadas en las que gana la persona.
                puntosP = puntosP+1;                                            //Acumulador de puntos de persona +1 si gana la persona. 
                                            
            }
            System.out.println("");                                             //Espacion entre lineas.
            imprimirJugadaEnLetras();                                           //Utilizacion del metodo imprimirJugadaEnLetras para ir mostrando las elecciones de los jugadores.
            System.out.println("");                                             //Espacion entre lineas.
        }
     
    }
    
    public void imprimirJugadaEnLetras(){                                       //Metodo imprimirJugadaEnLetras.
        
        String jugadaEnLetrasP;                                                 //Variable tipo String para convertir las jugadas de Persona en letras.
        String jugadaEnLetrasC;                                                 //Variable tipo String para convertir las jugadas de Computador en letras.
        
        switch (jugadaPersona) {                                                //Switch en la variable jugadaPersona.
            case 0:                                                             //Si la jugada es igual a 0.
                jugadaEnLetrasP = "Piedra";                                     //Almacenamiento de la jugada en letras en la variable jugadaEnLetrasP.
                break;                                                          //Break - Romper del switch.
            case 1:                                                             //Si la jugada es igual a 1.
                jugadaEnLetrasP ="Papel";                                       //Almacenamiento de la jugada en letras en la variable jugadaEnLetrasP.
                break;                                                          //Break - Romper del switch.
            default:                                                            //Si la jugada es igual a 2.
                jugadaEnLetrasP = "Tijeras";                                    //Almacenamiento de la jugada en letras en la variable jugadaEnLetrasP.
                break;                                                          //Break - Romper del switch.
        }
        switch (jugadaCompu){                                                   //Switch en la variable jugadaCompu.
            case 0:                                                             //Si la jugada es igual a 0.
                jugadaEnLetrasC = "Piedra";                                     //Almacenamiento de la jugada en letras en la variable jugadaEnLetrasC.
                break;                                                          //Break - Romper del switch.
            case 1:                                                             //Si la jugada es igual a 1.
                jugadaEnLetrasC = "Papel";                                      //Almacenamiento de la jugada en letras en la variable jugadaEnLetrasC.
                break;                                                          //Break - Romper del switch.
            default:                                                            //Si la jugada es igual a 2.
                jugadaEnLetrasC = "Tijera";                                     //Almacenamiento de la jugada en letras en la variable jugadaEnLetrasC.
                break;                                                          //Break - Romper del switch.
        }    
        
        System.out.println("======= \n Jugada Persona: "+jugadaEnLetrasP +"\n Jugada Computador: "+jugadaEnLetrasC + "\n======="); //Texto en pantalla que muestra en consola las jugadas de la Persona y el Computador.
        
        if(jugadaPersona == jugadaCompu){                                       //Para saber si las jugadas de ambos son iguales.
            System.out.println("EMPATE");                                       //Texto en pantalla si se cumple el if que nos muestra el EMPATE entre ambas jugadas.
        }
    }
    
    public void buscarEImprimirGanadorFinal(){                                  //Metodo buscarEImprimirGanadorFinal.
        String ganador;                                                         //Variable tipo String para almacenar el Ganador Final.
        
        if(puntosC==puntosP){                                                   //if para comparar los acumuladores de puntos y ver si existe un empate.
            ganador="EMPATE";                                                   //Almacenamiento en la variable ganador si hubo un EMPATE.
        }else if(puntosC>puntosP){                                              //else if  para comparar los acumuladores de puntos y ver cual es mayor de los dos.
            ganador="Computador";                                               //Almacenamiento en la variable ganador si este es el computador.
        }else{
            ganador="Persona";                                                  //Almacenamiento en la variable ganador si este es el computador.
        }
        System.out.println("--------- GANADOR ---------");                      //Texto en pantalla.
        System.out.println("\t"+ganador);                                       //Mostrar en pantalla quien fue el ganador, concatenado con la variable ganador.
        if("Persona".equals(ganador)){                                          //if para segun el ganador imprimir la cantidad de puntos que obtubo de acuerdo a los acumuladores de puntos.
            System.out.println("Numero de aciertos: "+puntosP);                 //Mostrar puntos si el ganador es la persona, concatenado con el acumulador puntosP.
        }else{
            System.out.println("Numero de aciertos: "+puntosC);                 //Mostrar puntos si el ganador es el computador, concatenado con el acumulador puntosC.
        }
        System.out.println("*******************************************************"); //Texto en pantalla.
    }
}
