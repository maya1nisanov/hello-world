import jeliot.io.*;

public class MyClass {
    public static void main() {
      int i; // ���� �������
      int j; //���� �������
      int k; //���� ��������
      
      System.out.println ("���� �������� ���?");
      i = Input.readInt ();
      System.out.println ("���� ������� ���?");
      j = Input.readInt();
      System.out.println ("���� �������� ���?");
      k = Input.readInt();
      
      if (i>j){
        System.out.println ("���� �������� ���� ����� �������");
     }
     else {
        System.out.println ("���� �������� ��� �� ���� ����� �������");
     }
     if (i<j && i/2>=k) {
        System.out.println ("���� �������� ��� ����� ������� ����� �� ���� ����� �������� ����� ����� ��� �������");
       }
       else {
          System.out.println ("���� �������� ���� �� ���� ����� ������� ���� ����� �������� ����� ����� ��� �������");
       }    
    } // main
} // MyClass