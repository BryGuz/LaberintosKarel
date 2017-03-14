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
 * @author lotalorafox
 */
public class r5 {
    private Robot r ;
    
    
    public r5(City c){
        
        r = new Robot(c,6,7,Direction.NORTH);
   //   Thing bola= new Thing (c, 7, 5);
    //  Thing casa = new Thing(c,7,4);
     //   casa.setColor(Color.lightGray);
        
        
    }
    public void recorrer(City c){
        
    /*  r.setTransparency(1);
        r.move();
        r.pickThing();
        System.out.println(r.countThingsInBackpack()); */
       
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
    
    
    
        
    
    
