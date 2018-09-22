/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoservice;

import autoservice.Car.Color;

/**
 *
 * @author coco
 */
public class Autoservice {
      static  Car m1,m2,m3;
    /**
     * @param args the command line arguments
     */
      
        private static void displayAutoservice(){
       System.out.println("Autoservice");
       
       System.out.println("First car");
       System.out.println("Car name:"+ m1.getName());
       System.out.println("Car colour:"+ m1.getColor());
       System.out.println("Car speed:"+ m1.getSpeed());
       System.out.println("Car rentPrice:"+ m1.getDailyRentPrice());
       System.out.println("Car salePrice:"+ m1.getSalePrice());
      
       System.out.println("Second car");
       System.out.println("Car name:"+ m2.getName());
       System.out.println("Car colour:"+ m2.getColor());
       System.out.println("Car speed:"+ m2.getSpeed());
       System.out.println("Car rentPrice:"+ m2.getDailyRentPrice());
       System.out.println("Car salePrice:"+ m2.getSalePrice());
       
       System.out.println("Third car");
       System.out.println("Car name:"+ m3.getName());
       System.out.println("Car colour:"+ m3.getColor());
       System.out.println("Car speed:"+ m3.getSpeed());
       System.out.println("Car rentPrice:"+ m3.getDailyRentPrice());
       System.out.println("Car salePrice:"+ m3.getSalePrice());   
 }
  /*5a*/
       public static void main(String[] args) {
    //Create first car
       m1 = new Car ("Mercedes", (short)130, Color.YELLOW);
       m1.setDailyRentPrice(100);
       m1.setSalePrice(15000);
       
    // Create second car
        m2 = new Car ("Renault", (short)110, Color.BLACK);
        m2.setDailyRentPrice(90);
        m2.setSalePrice(12000);
        
    // Create third car
        m3 = new Car ("Dacia", (short)90, Color.GRAY);
        m3.setDailyRentPrice(50);
        m3.setSalePrice(5000);
        
        
         
   /*5b*/
        
         displayAutoservice();
    
   /*5d*/
   
        m1.increaseSpeed((short)(m1.getSpeed()+10));
        
        displayAutoservice();

   /*5e*/
   
        m2.decreaseSpeed((short)(m2.getSpeed()-10));
        
        displayAutoservice();

   /*5f*/
   
        m3.setDailyRentPrice(m3.getDailyRentPrice()+15);
        m3.setSalePrice (m3.getSalePrice()-1200);
        
        displayAutoservice();
        
}
}