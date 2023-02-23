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
public class kiosco {
    
    private String codigo;
    private String Nombre;
    private region reg;

    public kiosco(String codigo, String Nombre, region reg) {
        this.codigo = codigo;
        this.Nombre = Nombre;
        this.reg = reg;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public region getReg() {
        return reg;
    }

    public void setReg(region reg) {
        this.reg = reg;
    }
    
    public static LinkedList<kiosco> listKiosco = new LinkedList<>();
}
