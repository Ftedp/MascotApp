/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import mascotapp.entidades.Mascota;
import mascotapp.enumeraciones.Raza;
import mascotapp.servicios.ServicioMascota;



/**
 *
 * @author Facundo
 */
public class MascotApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HashSet<Mascota> mascotas = new HashSet();
     
        
        mascotas.add(new Mascota("a"," Facu","beagle"));
        mascotas.add(new Mascota("o"," Facu","turtle"));
        mascotas.add(new Mascota("c"," Facu","perro"));
        mascotas.add(new Mascota("u"," Facu","perro"));
        mascotas.add(new Mascota("d"," Facu","perro"));
        mascotas.add(new Mascota("n"," Facu","perro"));
        mascotas.add(new Mascota("Facundo"," Facu","perro"));
        
        for (Mascota mascota:mascotas) {
            System.out.println(mascota);
        }
         
        for (Raza aux: Raza.values()) {
            System.out.println(aux);
        }
        
    }   
}
