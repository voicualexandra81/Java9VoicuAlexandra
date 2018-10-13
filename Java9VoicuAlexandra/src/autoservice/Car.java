/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoservice;

/**
 *
 * @author coco
 */
public class Car implements Saleable, Rentable{
/**
@enum enumeration of accepted car colors
*/
public enum Color {WHITE,RED,YELLOW,GREEN,GRAY,BLACK};
/**
Internal hidden fields / attributes
*/
private String name;
private Color color;
private short speed;
private int salePrice;
private int rentPrice;

/**
Constructors
*/
public Car(){
name = "Default car name";
speed = 90;
}
public Car(String carName, short carSpeed, Color carColor){
name = carName;
speed = carSpeed;
color = carColor;
}
/*get-ers and set-ers*/
public String getName(){
return(name);
}
public Color getColor(){
return(color);
}
public short getSpeed(){
return(speed);
}
public void setName(String newName){
name = newName;
}
public void setColor(Color newColor){
color = newColor;
}
public void setSpeed(short newSpeed){
speed = newSpeed;
}

public void setSalePrice(int salePrice) {
this.salePrice = salePrice;
}

public void setDailyRentPrice(int rentPrice) {
this.rentPrice = rentPrice;
}
/**
The method increase actual speed of Car until final speed specified.
* @param newSpeed is new speed
*/
public void increaseSpeed(short newSpeed){
if(newSpeed > speed){
speed = newSpeed;
}
else if (newSpeed < speed){
decreaseSpeed(newSpeed);
}
}
/**
The method decrease actual speed of Car until final speed specified.
* @param newSpeed is new speed
*/
public void decreaseSpeed(short newSpeed){
if(newSpeed < speed){
speed = newSpeed;
}
else if (newSpeed < speed){
increaseSpeed(newSpeed);
}
}
/**
Abstract method defined in Saleable interface implemented by class car
* is implemented here.
* @override Saleable.getSalePrice() method
*/
@Override
public int getSalePrice(){
return(salePrice);
}
/**
Abstract method defined in Rentable interface implemented by class car
* is implemented here.
* @override Rentable.getDailyRentPrice() method
*/
@Override
public int getDailyRentPrice(){
return(rentPrice);
}
}