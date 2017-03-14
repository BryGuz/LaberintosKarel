/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;
import becker.robots.*;
/**
 *
 * @author @BryanM
 */
public class MainLab {
    public static void main(String[] args){
        City map = new City(11,11);
       Escenario l = new Escenario(map);
        //EscenarioKarel x = new EscenarioKarel(map);
      // x.EscenarioKarel(map);
      Recorre fran = new Recorre(map);
       fran.recorrer(map);
    }
}
