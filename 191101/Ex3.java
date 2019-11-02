import jeliot.io.*;
import Java.util.*;

public class Train {
    public static void main() {
      int stations;
      stations = Input.readInt ;
      
      if (stations > 4 ){
        System.out.println ( 4*5 + (stations - 4) * 7 );
          
          if (stations < 4){
            System.out.println ( stations * 5 );
         }
      else {
         System.out.println (20);
       }
    }

    }
}