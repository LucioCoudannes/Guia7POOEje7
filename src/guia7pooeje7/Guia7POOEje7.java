/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7pooeje7;

import Entidades.Persona;
import Servicios.PersonaServicios;
import java.util.Scanner;

/**
 *
 * @author A288808
 */
public class Guia7POOEje7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PersonaServicios ps = new PersonaServicios();

        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();

        ps.crearPersona(p1);
        ps.calcularIMC(p1);
        ps.esMayor(p1);
        ps.crearPersona(p2);
        ps.calcularIMC(p2);
        ps.esMayor(p2);
        ps.crearPersona(p3);
        ps.calcularIMC(p3);
        ps.esMayor(p3);
        ps.crearPersona(p4);
        ps.calcularIMC(p4);
        ps.esMayor(p4);
        
        ps.porcentaje(p1);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        

    }

}
