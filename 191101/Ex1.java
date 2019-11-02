import jeliot.io.*;

public class MyClass {
    public static void main() {
      int i; // מספר תלמידים
      int j; //מספר הכיסאות
      int k; //מספר השולחנות
      
      System.out.println ("מספר התלמידים הוא?");
      i = Input.readInt ();
      System.out.println ("מספר הכיסאות הוא?");
      j = Input.readInt();
      System.out.println ("מספר השולחנות הוא?");
      k = Input.readInt();
      
      if (i>j){
        System.out.println ("מספר התלמידים גדול ממספר הכיסאות");
     }
     else {
        System.out.println ("מספר התלמידים קטן או שווה ממספר הכיסאות");
     }
     if (i<j && i/2>=k) {
        System.out.println ("מספר התלמידים קטן ממספר הכיסאות וגדול או שווה למספר השולחנות כשבכל שולחן שני תלמידים");
       }
       else {
          System.out.println ("מספר התלמידים גדול או שווה ממספר הכיסאות וקטן ממספר השולחנות כשבכל שולחן שני תלמידים");
       }    
    } // main
} // MyClass