/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dependensi;

/**
 *
 * @author Leman
 */
public class Mobil {

    public String merk;

    public void start(Engine e) {
        e.start();
    }

    public void stop(Engine e) {
        e.stop();
    }

    public void run() {
        System.out.println("Mobil running... ");
    }

}
