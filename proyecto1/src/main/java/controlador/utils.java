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
public class utils {
    
    public static void regionSendsOrder(LinkedList<regionSends> listRegionSolds, LinkedList<compra> listSolds, LinkedList<region> listReg){
        
        for (int i = 0; i < listReg.size(); i++) {
            regionSends rS = new regionSends(listReg.get(i).getNombre(), 0);
            listRegionSolds.add(rS);
        }
        
        for (int i = 0; i < listSolds.size(); i++) {
            for (int j = 0; j < listRegionSolds.size(); j++) {
                if(listSolds.get(i).getDepartamentoD().getReg().getNombre().equals(listRegionSolds.get(j).getReg())){
                    int cantidad = listRegionSolds.get(j).getCantidad() + 1;
                    listRegionSolds.get(j).setCantidad(cantidad);
                } 
            }
        }
    
    }
    
    public static void userSendsOrder(LinkedList<userSends> listUserSolds, LinkedList<compra> listSolds, LinkedList<user> listUser){
    
        for (int i = 0; i < listUser.size(); i++) {
            userSends uS = new userSends(listUser.get(i).getNombre(), listUser.get(i).getApellido(), listUser.get(i).getDpi(), 0);
            listUserSolds.add(uS);
        }
        
        for (int i = 0; i < listSolds.size(); i++) {
            for (int j = 0; j < listUserSolds.size(); j++) {
                if(listSolds.get(i).getDpi().equals(listUserSolds.get(j).getDpi())){
                    int cantidad = listUserSolds.get(j).getCantidad() + 1;
                    listUserSolds.get(j).setCantidad(cantidad);
                }
            }
        }
        
    }
}
