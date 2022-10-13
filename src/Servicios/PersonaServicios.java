/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author A288808
 */
public class PersonaServicios {

    Scanner leer = new Scanner(System.in);

    public int contadorbajo = 0;
    public int contadorideal = 0;
    public int contadorsobre = 0;
    public int contadormenor = 0;
    public int contadormayor = 0;

    public void crearPersona(Persona d) {

        System.out.println("Ingrese el nombre de la persona");
        d.setNombre(leer.next());
        System.out.println("Ingrese la edad de la persona");
        d.setEdad(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingrese el sexo de la persona");
        d.setSexo(leer.next());

        while (!d.getSexo().equalsIgnoreCase("h") && !d.getSexo().equalsIgnoreCase("m") && !d.getSexo().equalsIgnoreCase("o")) {

            System.out.println("Ingrese un sexo correcto H,M,O");
            d.setSexo(leer.next());

        }

        System.out.println("Ingrese el peso de la persona");
        d.setPeso(leer.nextFloat());
        System.out.println("Ingrese la altura de la persona");
        d.setAltura(leer.nextFloat());

    }

    public void calcularIMC(Persona i) {

        if ((i.getPeso() / (i.getAltura() * i.getAltura()) < 20)) {

            i.setIMC(-1);
            contadorbajo++;
            
        } else if ((i.getPeso() / (i.getAltura() * i.getAltura()) >= 20) && (i.getPeso() / (i.getAltura() * i.getAltura()) <= 25)) {

            i.setIMC(0);
            contadorideal++;
          
        } else if ((i.getPeso() / (i.getAltura() * i.getAltura()) > 25)) {

            i.setIMC(1);
            contadorsobre++;
          
        }

        //System.out.println(contadorbajo+" "+contadorideal+" "+contadorsobre);
    }

    public boolean esMayor(Persona e) {

        if (e.getEdad() < 21) {

            e.setEsMayor(false);
            contadormenor++;
         
        } else {

            e.setEsMayor(true);
            contadormayor++;

        }
        return false;

    }
    
    public void porcentaje(Persona p){
        
        System.out.println("Personas debajo del peso ideal son un " + (contadorbajo*100)/4 +" porciento ");
        System.out.println("Personas con peso ideal son un " + (contadorideal*100)/4 +" porciento ");
        System.out.println("Personas por arriba del peso ideal son un " + (contadorsobre*100)/4 +" porciento ");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Personas menores de edad " + (contadormenor*100)/4 + " porciento");
        System.out.println("Personas mayores de edad " + (contadormayor*100)/4 + " porciento");
        
        
        
        
    }

}
