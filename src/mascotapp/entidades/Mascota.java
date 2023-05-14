/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.entidades;

import java.util.Objects;
import mascotapp.enumeraciones.Raza;
import mascotapp.enumeraciones.SexoAnimal;

import mascotapp.interfaces.AccionMascota;


/**
 *
 * @author Facundo
 */
public final class Mascota implements AccionMascota{
    private String nombre;
    private String apodo;
    //conejo,gato,perro,carpincho,loro
    private String tipo;
    private String color;
    private Integer edad;
    private boolean cola;
    private Raza raza;
    private SexoAnimal sexo;
    
    private int energia;
    
    public Mascota(){ 
            this.energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.energia= 1000;
       
    }

    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, Raza raza, SexoAnimal sexo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.sexo = sexo;
        this.energia = 1000;
    }
    
    public void setNombre(String nombre){
        if (nombre.length()>0){
            this.nombre = nombre;
        }
       
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public void setSexo(SexoAnimal sexo) {
        this.sexo = sexo;
    }
        
    public String getNombre(){
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public Integer getEdad() {
        return edad;
    }

    public boolean getCola() {
        return cola;
    }

    public Raza getRaza() {
        return raza;
    }

    public SexoAnimal getSexo() {
        return sexo;
    }
    
    /**
     *Funcion destinada a pasear
     * 
     * @param energiaRestar
     * @return energia
     */ 
    public int pasear(int energiaRestar){
        
        energia-=energiaRestar;
        return energia;
    }
    /**
     * Funcion destinada a pasear por vueltas
     * @param energiaRestar
     * @param vueltas
     * @return energia 
     */
    public int pasear(int energiaRestar, int vueltas){
        for (int i = 0; i < vueltas; i++) {
            energia-=energiaRestar;
        }
        
        return energia;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.apodo);
        hash = 59 * hash + Objects.hashCode(this.tipo);
        hash = 59 * hash + Objects.hashCode(this.color);
        hash = 59 * hash + Objects.hashCode(this.edad);
        hash = 59 * hash + (this.cola ? 1 : 0);
        hash = 59 * hash + Objects.hashCode(this.raza);
        hash = 59 * hash + this.energia;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mascota other = (Mascota) obj;
        if (this.cola != other.cola) {
            return false;
        }
        if (this.energia != other.energia) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apodo, other.apodo)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (!Objects.equals(this.raza, other.raza)) {
            return false;
        }
        if (!Objects.equals(this.edad, other.edad)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }

    @Override
    public void Pasear(int cantVeces) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int molestarDueno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comerAlimento(int cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
    
}
