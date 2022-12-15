/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS;

/**
 *
 * @author Leman
 */
public class mainKomposisi {

    public static void main(String[] args) {
        MotorKomposisi Mio = new MotorKomposisi("Yamaha", "Mio", 125, "Biru Putih", "Bensin");
        Mio.turnOnDevice();
        Mio.cetak();
        Mio.turnOffDevice();
    }
}
     
