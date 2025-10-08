import java.util.Scanner;
class demo {
    public static void main(String args[])
    {
     Scanner scan = new Scanner (System.in);
     System.out.println("enter you salary");
     int salary = scan.nextInt();
     System.out.println("enter your age");
     int age = scan.nextInt();
     if (salary<=20000 && age<=25) {
      System.out.println("loan avalable");
      System.out.println("enter you requested amount");
      int loan = scan.nextInt();
      if (loan<=50000)
      {
         System.out.println("avalable");
      }
      else{
         System.out.println("not avalable");
      }
     }
     else{
      System.out.println("no loan");
     }

   
    }
}