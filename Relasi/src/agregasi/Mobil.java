/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agregasi;

/**
 *
 * @author Leman
 */
public class Mobil {

    public String merk;
    public Engine mesin;

    public Mobil(Engine e) {
        mesin = e;
    }

    public void start() {
        mesin.start();
    }

    public void stop() {
        mesin.stop();
    }

    public void run() {
        System.out.println("Mobil running... ");
    }

}
