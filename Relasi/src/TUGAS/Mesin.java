/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS;

/**
 *
 * @author Leman
 */
public class Mesin implements IMesin {
    public String Mesin;
    public String OSVersion;

    @Override
    public void nyala() {
        System.out.println("Nyalakan Mesin...");
    }

    @Override
    public void mati() {
        System.out.println("Matikan Mesin...");
    }
}
