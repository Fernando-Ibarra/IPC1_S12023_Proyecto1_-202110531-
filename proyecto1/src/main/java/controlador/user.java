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
public class user extends autenticador {
    
    private String nombre;
    private String apellido;
    private String dpi;
    private String genero;
    private String fechaN;
    private String nacionalidad;
    private String alias;
    private String telefono;
    private String path;

    public user(String nombre, String apellido, String dpi, String genero, String fechaN, String nacionalidad, String alias, String telefono, String path, String correo, String password, String rol) {
        super(correo, password, rol);
        this.nombre = nombre;
        this.apellido = apellido;
        this.dpi = dpi;
        this.genero = genero;
        this.fechaN = fechaN;
        this.nacionalidad = nacionalidad;
        this.alias = alias;
        this.telefono = telefono;
        this.path = path;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFechaN() {
        return fechaN;
    }

    public void setFechaN(String fechaN) {
        this.fechaN = fechaN;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public static LinkedList<user> getListUser() {
        return listUser;
    }

    public static void setListUser(LinkedList<user> listUser) {
        user.listUser = listUser;
    }


    
    public static LinkedList<user> listUser = new LinkedList<>();
}
