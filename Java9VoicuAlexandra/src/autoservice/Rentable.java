/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoservice;
/*
* Rentable interface
*/
/**
 *
 * @author coco
 */
public interface Rentable {
/**
@const REC_RENT_PRICE is recommended price to rent
*/
public static final boolean RENTABLE = true;
/**
* Method returns the value of item that implements the rentable
interface.
* Class that implements the interface should implement this method.
@return method returns price for daily rent
*/
public int getDailyRentPrice();
}  
