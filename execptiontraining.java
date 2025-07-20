
import java.util.Scanner;
class divide{
 void   div(int a , int b ){
         try {
             int c = a/b;
             System.out.println("The result is "+c);
         } catch (ArithmeticException e) {
           System.out.println(e+"Cannot divide by zero");
         }
         catch(Exception e){
            System.out.println(e);
         }
    }
}

public class execptiontraining {
 public static void main(String[] args) {
    Scanner  s = new Scanner(System.in);
   
    int a = s.nextInt();
    int b = s.nextInt();
    divide d = new divide();
 d.div(a, b);
 }
  

}
