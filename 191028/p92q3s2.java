import jeliot.io.*;
import java.util.*;
 class Student {
   public static void main(){    
         int testMark;
         int testMark2;
          
         testMark= Input.nextInt();
     
    if (testMark <60) {
               testMark2 =testMark;
               testMark =testMark/10;
               testMark =(testMark2 + testMark);
                          
     }
   }
}