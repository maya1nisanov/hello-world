import jeliot.io.*;
import java.util.*;

public class MyClass {
    public static Scanner reader = new Scanner (System.in);
    public static void main() {
    int num1;
    int num2;
    num1 = reader.nextInt();
    num2 = reader.nextInt();
    if  (num1 >num2) {
          System.out.println( num1 + "," +  num2);
   }
    else {
          System.out.println(num2 + "," +  num1); 
    }
    if (num1 < num2){
        System.out.println( num1 + "," +  num2);
    }
     else {
          System.out.println(num2 + "," +  num1); 
     }
     if (num1> num2) {
           System.out.println(num1 -  num2); 
     }
     else {
         System.out.println(num2 -  num1); 
    }
 }
 }