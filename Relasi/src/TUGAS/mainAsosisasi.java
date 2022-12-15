/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS;

/**
 *
 * @author Leman
 */
public class mainAsosisasi {
    public static void main(String[] args) {
        // Membuat object oporation system
        Mesin oS = new Mesin();
        // Membuat object Motor
        MotorAsosiasi beat = new MotorAsosiasi(oS);
        beat.setMerk("Honda Beat");
        beat.setCC(125);
        beat.setWarna("Biru Putih");
        beat.setBahanbakar("Bensin");
        beat.turnOnDevice();
        beat.cetak();
        beat.turnOffDevice();
    }
}
