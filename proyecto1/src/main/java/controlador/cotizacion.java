/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author fi944
 */
public class cotizacion {
    private departamento departamentoO;
    private municipio municipioO;
    private String  direccionO;
    private departamento departamentoD;
    private municipio municipioD;
    private String  direccionD;
    private int cantidadPaquetes;
    private double precioPaquetes;

    public cotizacion(departamento departamentoO, municipio municipioO, String direccionO, departamento departamentoD, municipio municipioD, String direccionD, int cantidadPaquetes, double precioPaquetes) {
        this.departamentoO = departamentoO;
        this.municipioO = municipioO;
        this.direccionO = direccionO;
        this.departamentoD = departamentoD;
        this.municipioD = municipioD;
        this.direccionD = direccionD;
        this.cantidadPaquetes = cantidadPaquetes;
        this.precioPaquetes = precioPaquetes;
    }

    public departamento getDepartamentoO() {
        return departamentoO;
    }

    public void setDepartamentoO(departamento departamentoO) {
        this.departamentoO = departamentoO;
    }

    public municipio getMunicipioO() {
        return municipioO;
    }

    public void setMunicipioO(municipio municipioO) {
        this.municipioO = municipioO;
    }

    public String getDireccionO() {
        return direccionO;
    }

    public void setDireccionO(String direccionO) {
        this.direccionO = direccionO;
    }

    public departamento getDepartamentoD() {
        return departamentoD;
    }

    public void setDepartamentoD(departamento departamentoD) {
        this.departamentoD = departamentoD;
    }

    public municipio getMunicipioD() {
        return municipioD;
    }

    public void setMunicipioD(municipio municipioD) {
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

    public double getPrecioPaquetes() {
        return precioPaquetes;
    }

    public void setPrecioPaquetes(double precioPaquetes) {
        this.precioPaquetes = precioPaquetes;
    }
    
    
    
}
