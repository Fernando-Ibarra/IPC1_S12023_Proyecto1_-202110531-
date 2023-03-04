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
public class UserSends {
    private String name;
    private String apellido;
    private String dpi;
    private int cantidad;

    public UserSends(String name, String apellido, String dpi, int cantidad) {
        this.name = name;
        this.apellido = apellido;
        this.dpi = dpi;
        this.cantidad = cantidad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public static LinkedList<UserSends> getListUserSolds() {
        return listUserSolds;
    }

    public static void setListUserSolds(LinkedList<UserSends> listUserSolds) {
        UserSends.listUserSolds = listUserSolds;
    }




    
    public static LinkedList<UserSends> listUserSolds = new LinkedList<>();
}
