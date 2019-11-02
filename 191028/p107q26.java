import jeliot.io.*;
import Java.util.*;
public class MyClass {
    public static void main() {
        // Your algorithm goes here.
int a;
int b;
int c;

a = 8;
b = 5;
c = 1;

if ( a<b && a<c){
    System.out.println ("a is the smallest");
}
else {
    if (b<c && b<a ) {
       System.out.println ( "b is the smallest");
    }
        else {
           System.out.println ("c is the smallest");
         }
        }
    }
}