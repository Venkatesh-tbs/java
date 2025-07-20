
import java.util.Scanner;

public class throwkeyword {
    public static void main(String[] args) {
        /* 
        try{
            int a = 10/2;
            throw new ArithmeticException("Enter valid input ");Why throw keyword should use if the throw keyword will throw the error for user wanted error 
         }
         catch(Exception e){
            System.out.println(e);
         }
    }
*/
//example for throw keyword
Scanner s = new Scanner(System.in);
try {

    int age = s.nextInt();
    if(age < 1){
   throw new ArithmeticException("Enter age greater than 1");
    }
} catch (Exception e) {
    System.out.println(e);
}
System.out.println("Successfully");
}
}
