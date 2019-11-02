import jeliot.io.*;
import java.util.*;

public class Couple {
     int num1;
     int num2;
     
     public  Couple (int num1, int num2) {
               this.num1 = num1;
               this.num2 = num2;
     }
     
     int getNum1() {
              return this.num1;
     }
     
      int getNum2() {
              return this.num2;
     }
      
     void setNum1 (int num1){
              this.num1 = num1;
      }
      void setNum2 (int num2){
              this.num2 = num2;
      }
      
      String toString(){
             return "num1: "+ this.num1 + "num2:" + this.num2;
      }
   }   
public class student {
    public static Scanner reader= new Scanner (System.in);
    public static void main() {
       int num1;
       int num2;
       int num3;
       int num4;
       
        System.out.println("please enter 4 numbers");
        num1= reader.nextInt();
        num2= reader.nextInt();
        num3= reader.nextInt();
        num4= reader.nextInt();
        
        Couple c1 = new Couple (num1 , num2);
        Couple c2 = new Couple (num3 , num4);
         
        if(c1.getNum1() + c1.getNum2() > c2.getNum1() + c2.getNum2()){
                  System.out.println ("c1:" +c1);
                  System.out.println ("c2:" + c2);
        }
         else if (c2.getNum2() + c2.getNum2() > c1.getNum1() + c1.getNum2()){
                           System.out.println ("c2:" +c1);
                           System.out.println ("c1:" + c2);
                  }
           else  
                   System.out.println ("c1:" + c1 + "c2:" + c2);
                  
    }
}