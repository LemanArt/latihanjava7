/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS;

/**
 *
 * @author Leman
 */
public class mainAgregasi {
    public static void main(String[] args) {
        // Membuat object oporation system
        Mesin oS = new Mesin();
        // Membuat object Motor
        MotorAgregasi vario = new MotorAgregasi(oS);
        vario.setMerk("Honda Vari0");
        vario.setCC(150);
        vario.setWarna("Hitam Putih");
        vario.setBahanbakar("Bensin");
        vario.turnOnDevice();
        vario.cetak();
        vario.turnOffDevice();
    }
}
