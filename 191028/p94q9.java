import jeliot.io.*;
import java.util.*;

public class MyClass {
    public static Scanner reader = new Scanner (System.in);
    public static void main() {
    int a;
    int b;
    int temp;
    
    a = reader.nextInt();
    b = reader.nextInt();
  
    if (a>b){
          temp = a;
          a = b;
          b= temp;
     }
        System.out.println ("a = "+a+"  b="+b);
     
 }
 }