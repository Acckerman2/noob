public class store
 {
 int sum ( int num, int num2)
 {
   int number = num+num2;
   int all = number;
   return all;

 }
 public static void main (String args[])
 {
    store obj = new store();
    int reminder = obj.sum(20,30);
    System.out.print(reminder);

 }
}