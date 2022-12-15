/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agregasi;

/**
 *
 * @author Leman
 */
public class Engine implements IEngine {

    public String merk;
    public int cc;


    public void start() {
        System.out.println("Engine starting... ");
    }


    public void stop() {
        System.out.println("Engine stopped... ");
    }

}
