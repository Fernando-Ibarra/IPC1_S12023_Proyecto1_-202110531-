/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;

import Vistas.Login;
import controlador.region;
import controlador.user;
import static controlador.user.listUser;

/**
 *
 * @author fi944
 */
public class Proyecto1 {
    public static void main(String[] args) {
        user myUser = new user("Enrique Fernando", "Gaitán Ibarra", "3011233730101", "Hombre", "27/08/2002", "Guatemala", "feribarra", "49900123", "ipc1_202110531@ipc1delivery.com", "202110531", "admin");
        region reg1 = new region("M", "Metropolitana", 35.00, 25.00);
        region reg2 = new region("NT", "Norte", 68.50, 45.55);
        region reg3 = new region("NO", "Nororiente", 58.68, 35.48);
        region reg4 = new region("SO", "Suroriente", 38.68, 32.48);
        region reg5 = new region("SOC", "Suroccidente",  34.00, 29.00);
        region reg6 = new region("NOC", "Noroccidente", 44.50,  40.00);
        region.listReg.add(reg1);
        region.listReg.add(reg2);
        region.listReg.add(reg3);
        region.listReg.add(reg4);
        region.listReg.add(reg5);
        region.listReg.add(reg6);
        listUser.add(myUser);
        Login log = new Login();
        log.setVisible(true);
    }
}
