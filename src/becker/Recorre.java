/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;
import becker.robots.*;
import java.awt.Color;
/**
 *
 * @author BryanM
 */
public class Recorre {
    private Robot r ;
    
    
    public Recorre(City c){
        
        r = new Robot(c,6,7,Direction.NORTH);
   
        
        
    }
    public void recorrer(City c){
        
   
       
    while (r.canPickThing()==false){
   r.turnLeft();
    while (r.frontIsClear()==false){
     this.advanceRight();
    }
    r.move();
    }
    if(r.canPickThing()==true){
    r.pickThing();
    }
}
 private void advanceRight(){
    for (int i = 0; i < 3; i++) {
    this.r.turnLeft(); 
    
    }
    
 }

    
   
        
    }
    
    
    
        
    
    
