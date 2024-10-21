/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.poo;

import co.edu.unicolombo.poo.GUI.VentanaMaster;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        VentanaMaster screen = new VentanaMaster();
        screen.setTitle("Veteriorinas");
        screen.setLocationRelativeTo(null);
        screen.setExtendedState(VentanaMaster.MAXIMIZED_BOTH);
        screen.setVisible(true);
    }
}
