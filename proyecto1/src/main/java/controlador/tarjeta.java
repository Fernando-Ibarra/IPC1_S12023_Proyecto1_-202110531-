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
public class tarjeta {
    private String nombre;
    private String numeroT;
    private String fechaVen;
    private String dpi;

    public tarjeta(String nombre, String numeroT, String fechaVen, String dpi) {
        this.nombre = nombre;
        this.numeroT = numeroT;
        this.fechaVen = fechaVen;
        this.dpi = dpi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroT() {
        String str = numeroT;
        int pos = numeroT.length()-4;
	String prt1 = str.substring(0, pos);
        String prt2 = str.substring(pos + 1);
        
        int largo = prt1.length();
        
        
        char ch = '*';
        char[] chars = prt1.toCharArray();
 
        for(int i=0; i<largo; i++){
            chars[i] = ch;
        }
        
        prt1 = String.valueOf(chars);
        
        numeroT = prt1 + prt2;
 
        return numeroT;
    }

    public void setNumeroT(String numeroT) {
        this.numeroT = numeroT;
    }

    public String getFechaVen() {
        return fechaVen;
    }

    public void setFechaVen(String fechaVen) {
        this.fechaVen = fechaVen;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public static LinkedList<tarjeta> listCard = new LinkedList<>();
}
