/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS;

/**
 *
 * @author Leman
 */
public class mainDependensi {
    public static void main(String[] args) {
    // Membuat object oporation system
        Mesin oS = new Mesin();
        // Membuat object Motor
        MotorAgregasi Ninja = new MotorAgregasi(oS);
        Ninja.setMerk("Kawasaki Ninja");
        Ninja.setCC(200);
        Ninja.setWarna("Hitam Merah");
        Ninja.setBahanbakar("Pertamax");
        Ninja.turnOnDevice();
        Ninja.cetak();
        Ninja.turnOffDevice();
    }
}
