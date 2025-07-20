
import java.net.PortUnreachableException;
import java.util.Scanner;
class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
 super(s);
    }
}
class AgeValidator{
    void checkAge(int a){
        try{
        if (a < 1 || a >150) {
            throw new InvalidAgeException("Enter  Valid Age ");
        } else {
            System.out.println(" Completed");
        }
     }
     catch(Exception e){
        System.out.println(e);
     }
    }
    }


public class ageexception {
public static void main(String[] args) {
    

    Scanner s =  new Scanner(System.in);
    AgeValidator ag = new AgeValidator();
  int age = s.nextInt();
   ag.checkAge(age);


}
}
