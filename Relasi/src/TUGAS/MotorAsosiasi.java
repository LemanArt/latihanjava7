/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS;

/**
 *
 * @author Leman
 */
public class MotorAsosiasi {
     private String merk;
    private int cc;
    private String warna;
    private String bahanbakar;
    private final Mesin operationSystem;

    public MotorAsosiasi(Mesin oS) {
        operationSystem = oS;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setCC(int cc) {
        this.cc = cc;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setBahanbakar(String bahanbakar) {
        this.bahanbakar = bahanbakar;
    }


    public void turnOnDevice() {
        operationSystem.nyala();
    }

    public void turnOffDevice() {
        operationSystem.mati();
    }


    public void cetak() {
        System.out.println("Specification of " + this.merk + ":");
        System.out.println("1. Merk: " + this.merk);
        System.out.println("2. CC Mesin: " + this.cc);
        System.out.println("3. Warna: " + this.warna);
        System.out.println("4. Bahan Bakar: " + this.bahanbakar);
    }
}
