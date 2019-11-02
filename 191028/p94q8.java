import jeliot.io.*;
import java.util.*;

public class MyClass {
    public static Scanner reader = new Scanner (System.in);
    public static void main() {
    int work;
    int missing;
    int pay;
    
    work = reader.nextInt();
    missing = reader.nextInt();
    pay= reader.nextInt();
    
    if (missing < 3.5){
          System.out.println( (work * pay) + (work *pay)/10  );
     }
     else {
          System.out.println (work * pay);
     }
 }
 }