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
public class compra extends cotizacion {
    
    private String cod; 
    private double total;
    private String typePay;
    private String facturacion;
    private String dpi;
    private String typeSend;
    private String destinatario;

    public compra(String cod, double total, String typePay, String facturacion, String dpi, String typeSend, String destinatario, departamento departamentoO, municipio municipioO, String direccionO, departamento departamentoD, municipio municipioD, String direccionD, int cantidadPaquetes, String sizepackage) {
        super(departamentoO, municipioO, direccionO, departamentoD, municipioD, direccionD, cantidadPaquetes, sizepackage);
        this.cod = cod;
        this.total = total;
        this.typePay = typePay;
        this.facturacion = facturacion;
        this.dpi = dpi;
        this.typeSend = typeSend;
        this.destinatario = destinatario;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
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

    public String getFacturacion() {
        return facturacion;
    }

    public void setFacturacion(String facturacion) {
        this.facturacion = facturacion;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getTypeSend() {
        return typeSend;
    }

    public void setTypeSend(String typeSend) {
        this.typeSend = typeSend;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public static LinkedList<compra> getListSolds() {
        return listSolds;
    }

    public static void setListSolds(LinkedList<compra> listSolds) {
        compra.listSolds = listSolds;
    }

    public static LinkedList<compra> listSolds = new LinkedList<>();
    
}
