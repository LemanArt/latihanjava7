/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dependensi;

/**
 *
 * @author Leman
 */
public class MainProgram {

    public static void main(String[] args) {
// Membuat object engine
        Engine mesin = new Engine();
        /* memanggil atribut dan nilai */
        mesin.merk = "Honda F23A";
        mesin.cc = 2300;
        Mobil odyssey = new Mobil();
        odyssey.merk = "Honda Odyssey";
        odyssey.start(mesin);
        odyssey.run();
        odyssey.stop(mesin);
    }

}
