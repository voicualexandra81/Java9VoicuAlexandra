/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

/**
 *
 * @author coco
 */
public class Calculator {
   int rezultat = 0;
    
     /**
     * @param args the command line arguments
     */
   
    
    public int aduna (int a, int b){
       rezultat= a+b;
       return rezultat;
    }
    
    public int scade (int a, int b){
       rezultat= a-b;
       return rezultat;
    }
    
    public int inmultire (int a, int b){
       rezultat= a*b;
       return rezultat;
    }
    
    public int impartire (int a, int b){
       rezultat= a/b;
       return rezultat;
    }
}


   