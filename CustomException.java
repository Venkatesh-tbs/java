import java.util.Scanner;

class NotvalidAge extends Exception {
    public NotvalidAge(String s) {
        super(s);
    }
}

public class CustomException {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = s.nextInt();
            if (age < 18) {
                throw new NotvalidAge("The age should be 18 or above.");
            }
        
        } catch (NotvalidAge e) {
            System.out.println("Exception: " + e);
    
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}


