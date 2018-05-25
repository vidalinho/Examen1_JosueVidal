/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.*;

/**
 *
 * @author josue
 */
public class Usuarios {

    private String nombre;
    private int edad;
    private String correo;
    private String usuario;
    private String contra;
    ArrayList clases = new ArrayList();

    public Usuarios() {
    }

    public Usuarios(String nombre, int edad, String correo, String usuario, String contra) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.usuario = usuario;
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public ArrayList getClases() {
        return clases;
    }

    public void setClases(ArrayList clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + ", edad=" + edad + ", correo=" + correo + ", usuario=" + usuario + ", contra=" + contra + ", clases=" + clases + '}';
    }

}
