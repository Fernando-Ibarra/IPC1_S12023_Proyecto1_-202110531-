/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;

import Vistas.Login;
import controlador.Region;
import controlador.User;
import controlador.Utils;
import static controlador.Utils.listUser;

/**
 *
 * @author fi944
 */
public class Proyecto1 {

    public static void main(String[] args) {
        User myUser = new User("Enrique Fernando", "Gaitán Ibarra", "3011233730101", "Hombre", "27/08/2002", "Guatemala", "feribarra", "49900123", "", "ipc1_202110531@ipc1delivery.com", "202110531", "admin");
        Region reg1 = new Region("M", "Metropolitana", 35.00, 25.00);
        Region reg2 = new Region("NT", "Norte", 68.50, 45.55);
        Region reg3 = new Region("NO", "Nororiente", 58.68, 35.48);
        Region reg4 = new Region("SO", "Suroriente", 38.68, 32.48);
        Region reg5 = new Region("SOC", "Suroccidente", 34.00, 29.00);
        Region reg6 = new Region("NOC", "Noroccidente", 44.50, 40.00);
        Utils.listReg.add(reg1);
        Utils.listReg.add(reg2);
        Utils.listReg.add(reg3);
        Utils.listReg.add(reg4);
        Utils.listReg.add(reg5);
        Utils.listReg.add(reg6);
        listUser.add(myUser);
        Login log = new Login();
        log.setVisible(true);
    }
}
