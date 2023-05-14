/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.servicios;

import java.util.ArrayList;
import java.util.Scanner;
import mascotapp.entidades.Mascota;

/**
 *
 * @author Facundo
 */
public class ServicioMascota {
    
    private Scanner read;
    private ArrayList<Mascota> mascotas;

    public ServicioMascota() {
        this.read = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();  
    }
    
     
    
    public Mascota crearMascota(){
        
        System.out.println("Introduzca el nombre");
        String nombre = read.next();
        
        System.out.println("Introduzca el apodo");
        String apodo = read.next();
        
        System.out.println("Introduzca el tipo");
        String tipo = read.next();
        
        Mascota m = new Mascota(nombre, apodo, tipo);
        
        mascotas.add(m);
        
        return m;
    }
    
    public void agregarMascota(Mascota m){
        mascotas.add(m);
    }
    
    public void mostrarMascota(){
        int i = 0;
        System.out.println("Las mascotas actuales de la lista son");
        for (Mascota aux: mascotas){
            i+=1;
            System.out.println(aux.toString() +" "+ i);
        }
        System.out.println("Cantidad = " + mascotas.size());
        
    }
    /**
     * 
     * @param cantidad equivale a la cantidad de mascotas a crear y añadir a la lista.
     */
    public void fabricaChiquitos(int cantidad){
        System.out.println("Fabricando chiquitos");
        for (int i = 0; i < cantidad; i++) {
            mascotas.add( new Mascota("Facundo","Facu","Labrador"));           
        }
    }
    
    public void fabricaMascotas(int cantidad){
        System.out.println("Fabricar");
            
        for (int i = 0; i < cantidad; i++) {
            Mascota mascotaCreada = crearMascota();
        }
    }
    // TODO Try and Catch
    
//    public void actualizarMascotas(int index){
//        
//        Mascota m = mascotas.get(index);
//        m.setApodo("Facundito");
//    }
    
    public void actualizarMascota(int index){
        if (index <= mascotas.size()-1) {
            System.out.println("Actualizando");
            Mascota m = crearMascota();
            mascotas.set(index, m);   
        }else{
            System.out.println("El indice es erroneo, fallo al acttualizar");
        }            
    }
    
    public void eliminarMascotas(int index){
        if (index <= mascotas.size()-1) {
            mascotas.remove(index);
        }else{
            System.out.println("El indice es erroneo, fallo al eliminar");
        }
    }
    
}

