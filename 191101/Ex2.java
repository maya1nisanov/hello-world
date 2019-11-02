import jeliot.io.*;
import Java.util.*;

public class Rocket {
    public static void main() {
    
    double speed;
    speed = Input.readDouble();
    
    if (speed > 1499.5 && speed< 1500.5 ){
       System.out.println ("good speed");
         
        if (speed < 1499.5){
         System.out.println ("need more oxygen for higher speed. corrent speed is " + speed + ", need more " + (1500 - speed));
        }
            else {
            System.out.println ("need less oxygen for lower speed. corrent speed is " + speed + ", need less " + ( speed - 1500) + ",make less flout of oxygen in " + ((speed - 1500) * 2) + "liter");
           }
         }
    }
}
