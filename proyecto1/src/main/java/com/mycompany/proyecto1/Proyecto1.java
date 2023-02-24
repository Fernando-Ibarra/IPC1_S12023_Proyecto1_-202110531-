/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;

import Vistas.Login;
import controlador.user;
import static controlador.user.listUser;

/**
 *
 * @author fi944
 */
public class Proyecto1 {
    public static void main(String[] args) {
        user myUser = new user("Enrique Fernando", "Gaitán Ibarra", "3011233730101", "Hombre", "27/08/2002", "Guatemala", "feribarra", "49900123", "ipc1_202110531@ipc1delivery.com", "202110531", "admin");
        listUser.add(myUser);
        Login log = new Login();
        log.setVisible(true);
    }
}
