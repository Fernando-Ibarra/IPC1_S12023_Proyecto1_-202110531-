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
public class RegionSends {
    
    private String reg;
    private int cantidad;

    public RegionSends(String reg, int cantidad) {
        this.reg = reg;
        this.cantidad = cantidad;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public static LinkedList<RegionSends> getListRegionSolds() {
        return listRegionSolds;
    }

    public static void setListRegionSolds(LinkedList<RegionSends> listRegionSolds) {
        RegionSends.listRegionSolds = listRegionSolds;
    }

    public static LinkedList<RegionSends> listRegionSolds = new LinkedList<>();
    
}
