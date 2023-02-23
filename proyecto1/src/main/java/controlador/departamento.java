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
public class departamento {
    
    private String cod;
    private String name;
    private region reg;

    public departamento(String cod, String name, region reg) {
        this.cod = cod;
        this.name = name;
        this.reg = reg;
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

    public region getReg() {
        return reg;
    }

    public void setReg(region reg) {
        this.reg = reg;
    }
    
    public static LinkedList<departamento> listDepartamento = new LinkedList<>();
}
