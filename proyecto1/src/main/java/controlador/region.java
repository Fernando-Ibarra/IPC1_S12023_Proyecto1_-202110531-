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
public class Region {
    private String codigo;
    private String nombre;
    private double  priceE;
    private double  priceS;

    public Region(String codigo, String nombre, double priceE, double priceS) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.priceE = priceE;
        this.priceS = priceS;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPriceE() {
        return priceE;
    }

    public void setPriceE(double priceE) {
        this.priceE = priceE;
    }

    public double getPriceS() {
        return priceS;
    }

    public void setPriceS(double priceS) {
        this.priceS = priceS;
    }

    public static LinkedList<Region> getListReg() {
        return listReg;
    }

    public static void setListReg(LinkedList<Region> listReg) {
        Region.listReg = listReg;
    }


    public static LinkedList<Region> listReg = new LinkedList<>();
    
}
