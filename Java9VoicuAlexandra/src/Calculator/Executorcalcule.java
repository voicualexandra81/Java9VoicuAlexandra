/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import java.util.Scanner;

/**
 *
 * @author coco
 */
public class Executorcalcule {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculator unCalculator = new Calculator();
        
        System.out.println("Introduceti primul numar:");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        
         System.out.println("Introduceti al doilea numar:");
        Scanner sc1 = new Scanner(System.in);
        int j = sc1.nextInt();
        
        int iesireAdunare = unCalculator.aduna(i, j);
        System.out.println(iesireAdunare);
        
        int iesireScadere = unCalculator.scade(i, j);
        System.out.println(iesireScadere );
        
        int iesireInmultire = unCalculator.inmultire(i, j);
        System.out.println(iesireInmultire );
        
        int iesireImpartire = unCalculator.impartire(i, j);
        System.out.println(iesireImpartire );
    }
    
}