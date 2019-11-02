import jeliot.io.*;
import java.util.*;

public class MyClass {
    public static Scanner reader = new Scanner (System.in);
    public static void main() {
    int id;
    int speedid;
    int speed;
    
    id = reader.nextInt();
    speedid = reader.nextInt();
    speed= reader.nextInt();
    
    if (speed>= speedid){
          System.out.println( "good job" );
     }
     else {
          System.out.println ((speedid-speed)   *30 + "," + id);
     }
 }
 }