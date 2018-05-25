/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

/**
 *
 * @author josue
 */
public class Clase {

    private String clase;
    private String metodos;
    private String atributos;

    public Clase(String clase) {
        this.clase = clase;
    }

    public Clase(String clase, String metodos, String atributos) {
        this.clase = clase;
        this.metodos = metodos;
        this.atributos = atributos;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getMetodos() {
        return metodos;
    }

    public void setMetodos(String metodos) {
        this.metodos = metodos;
    }

    public String getAtributos() {
        return atributos;
    }

    public void setAtributos(String atributos) {
        this.atributos = atributos;
    }

}
