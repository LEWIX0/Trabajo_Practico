/*
    Trabajo Pratico 2 - Construccion de Software.
    Juan Guillermo Diosa Muñoz  C.c 1.037.655.777
    Lunes y Viernes 8:00 - 10:00 PM
*/
package piedrapapeltijera;

import java.util.Scanner;                                                       //Importamos el metodo Scanner.

public class Persona {                                                          //Clase Persona.
    
    String alias;                                                               //Atributos de la clase Persona.
    String correo;                                                              //Atributos de la clase Persona.
    
    
    public void solicitarDatosPersona(){                                        //Metodo solicitarDatosPersona.
        
        Scanner sc = new Scanner(System.in);                                    //Metodo Scanner para recibir texto por teclado.
        System.out.println("******************************************************* \n \t\t PIEDRA PAPEL O TIJERA \n\n");    //Texto en pantalla, con titulodel juego.
        
        System.out.println("Porfavor ingrese su alias:");                       //Teto insrucctivo para el usuario.
        alias = sc.nextLine();                                                  //Almacenamiento de los datos ingresados por el usuario en la variable alias.
        System.out.println("Porfavor ingrese su correo electronico:");          //Teto insrucctivo para el usuario.
        correo = sc.nextLine();                                                 //Almacenamiento de los datos ingresados por el usuario en la variable correo.
        
    }
    
    public void mostrarDatosPersona(){                                          //Metodo mostrarDatosPersona.
        System.out.println("\n\nCOMIENZA EL JUEGO!\n\n JUGADOR\n ");            //Texto en pantalla idicando el inicio del juego.
        System.out.println(alias + " - "+correo);                               //Imprimir las variables alias y correo concatenadas en una sola linea separadas ambas por un -.
        System.out.println("\n\n");                                             //Espacion entre lineas.
    }
}
