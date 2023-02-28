/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author fi944
 */
public class compra extends cotizacion {
    
    private double total;
    private String typePay;
    private factura facturacion;

    public compra(double total, String typePay, factura facturacion, departamento departamentoO, municipio municipioO, String direccionO, departamento departamentoD, municipio municipioD, String direccionD, int cantidadPaquetes, double precioPaquetes) {
        super(departamentoO, municipioO, direccionO, departamentoD, municipioD, direccionD, cantidadPaquetes, precioPaquetes);
        this.total = total;
        this.typePay = typePay;
        this.facturacion = facturacion;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getTypePay() {
        return typePay;
    }

    public void setTypePay(String typePay) {
        this.typePay = typePay;
    }

    public factura getFacturacion() {
        return facturacion;
    }

    public void setFacturacion(factura facturacion) {
        this.facturacion = facturacion;
    }
    
    
    
}
