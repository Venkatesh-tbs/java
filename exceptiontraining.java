
import java.util.Scanner;

public class exceptiontraining {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st num :");
        int a = s.nextInt();
        System.out.println("Enter 2nd num:");
        int b  = s.nextInt();
        int c = a/b;
        try {
      
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Try a valid number"+e);
            if (c !=0) {
                System.out.println("The final result is "+c);
            }
        }
    }


   
}
