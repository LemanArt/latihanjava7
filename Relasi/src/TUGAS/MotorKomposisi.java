/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS;

/**
 *
 * @author Leman
 */
public class MotorKomposisi {

    private String merk;
    private int cc;
    private String warna;
    private String bahanbakar;
    private final Mesin operationSystem;

    public MotorKomposisi(String oS, String merk, int cc, String warna, String bensin) {
        operationSystem = new Mesin();
        operationSystem.Mesin = oS;
        this.merk = merk;
        this.cc = cc;
        this.warna = warna;
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
