/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author fi944
 */
public class Cotizacion {
    private Departamento departamentoO;
    private Municipio municipioO;
    private String  direccionO;
    private Departamento departamentoD;
    private Municipio municipioD;
    private String  direccionD;
    private int cantidadPaquetes;
    private String sizepackage;

    public Cotizacion(Departamento departamentoO, Municipio municipioO, String direccionO, Departamento departamentoD, Municipio municipioD, String direccionD, int cantidadPaquetes, String sizepackage) {
        this.departamentoO = departamentoO;
        this.municipioO = municipioO;
        this.direccionO = direccionO;
        this.departamentoD = departamentoD;
        this.municipioD = municipioD;
        this.direccionD = direccionD;
        this.cantidadPaquetes = cantidadPaquetes;
        this.sizepackage = sizepackage;
    }

    public Departamento getDepartamentoO() {
        return departamentoO;
    }

    public void setDepartamentoO(Departamento departamentoO) {
        this.departamentoO = departamentoO;
    }

    public Municipio getMunicipioO() {
        return municipioO;
    }

    public void setMunicipioO(Municipio municipioO) {
        this.municipioO = municipioO;
    }

    public String getDireccionO() {
        return direccionO;
    }

    public void setDireccionO(String direccionO) {
        this.direccionO = direccionO;
    }

    public Departamento getDepartamentoD() {
        return departamentoD;
    }

    public void setDepartamentoD(Departamento departamentoD) {
        this.departamentoD = departamentoD;
    }

    public Municipio getMunicipioD() {
        return municipioD;
    }

    public void setMunicipioD(Municipio municipioD) {
        this.municipioD = municipioD;
    }

    public String getDireccionD() {
        return direccionD;
    }

    public void setDireccionD(String direccionD) {
        this.direccionD = direccionD;
    }

    public int getCantidadPaquetes() {
        return cantidadPaquetes;
    }

    public void setCantidadPaquetes(int cantidadPaquetes) {
        this.cantidadPaquetes = cantidadPaquetes;
    }

    public String getSizepackage() {
        return sizepackage;
    }

    public void setSizepackage(String sizepackage) {
        this.sizepackage = sizepackage;
    }


}
