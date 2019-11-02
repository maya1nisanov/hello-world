import jeliot.io.*;
import java.util.*;
 public class Student {
   public static Scanner reader = new Scanner (System.in);
   public static void main(String[] args){    
         int zavit1;
         int zavit2;
         int zavit3;
         
         zavit1=reader.nextInt();
         zavit2=reader.nextInt();
          zavit3=reader.nextInt();
     
                if (zavit1 + zavit2 + zavit3 == 180) {
                   System.out.println ("can be a triangle");
                   }
                          else {
                            System.out.println("can't be a triangle");
                          
                }
   }
}
