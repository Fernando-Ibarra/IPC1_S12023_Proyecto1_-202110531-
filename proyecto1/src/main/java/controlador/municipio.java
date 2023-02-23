/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.LinkedList;

/**
 *
 * @author fi944
 */
public class municipio {
    
    private String cod;
    private String name;
    private departamento depar;

    public municipio(String cod, String name, departamento depar) {
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

    public departamento getDepar() {
        return depar;
    }

    public void setDepar(departamento depar) {
        this.depar = depar;
    }
    
    public static LinkedList<municipio> listMucipio = new LinkedList<>();
}
