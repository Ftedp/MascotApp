/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.entidades;

import java.util.Date;
import mascotapp.enumeraciones.SexoHumano;

/**
 *
 * @author Facundo
 */
public final class Usuario {
    public String nombre;
    public String apellido;
    public int dni;
    public Date nacimiento;
    public String pais;
    public SexoHumano sexo ;
    public Usuario() {
    }

    public Usuario(String nombre, String apellido, int dni, Date nacimiento, String pais, SexoHumano sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.pais = pais;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public String getPais() {
        return pais;
    }

    public SexoHumano getSexo() {
        return sexo;
    }
    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setSexo(SexoHumano sexo) {
        this.sexo = sexo;
    }


    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", nacimiento=" + nacimiento + ", pais=" + pais + '}';
    }
    
    
}
