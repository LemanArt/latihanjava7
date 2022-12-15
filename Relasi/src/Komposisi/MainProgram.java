/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Komposisi;

/**
 *
 * @author Leman
 */
public class MainProgram {

    public static void main(String[] args) {
// Membuat object mobil
        Mobil odyssey = new Mobil("Honda F23A", 2300);
        /* memanggil atribut dan nilai */
        odyssey.merk = "Honda Odyssey";
        odyssey.start();
        odyssey.run();
        odyssey.stop();
    }
}
