
import java.util.Scanner;
import  java.util.InputMismatchException;

public class expectionhandling {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
      
        // how the Expection works when the user input is String but we need integer at the
        //  time  The Expection is help to handle the runtime error 
        try{
            int a = s.nextInt(); // this is correct 
            int b = 10/0;
        }
       // this the one of the method to handle the runtime error , When u use 
                                                    //    Exception class it handle the all runtime error 
        
catch(InputMismatchException e1 ){
            System.out.println("Exception handled "+e1);
        }
    } 
    // suppose we need only handle the InputmismatachExecption error use u put only that expection
}
/*What is meant by expection  
 * Exception handling in Java is a mechanism that handles
runtime errors, ensuring that the normal flow of a program
is maintained. It allows developers to manage errors
gracefully without terminating the application
unexpectedly.
  */
