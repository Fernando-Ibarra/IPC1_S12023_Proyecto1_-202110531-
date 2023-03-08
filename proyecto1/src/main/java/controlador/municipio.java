/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
/**
 *
 * @author fi944
 */
public class Municipio {
    
    private String cod;
    private String name;
    private Departamento depar;

    public Municipio(String cod, String name, Departamento depar) {
        this.cod = cod;
        this.name = name;
        this.depar = depar;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Departamento getDepar() {
        return depar;
    }

    public void setDepar(Departamento depar) {
        this.depar = depar;
    } 
}
