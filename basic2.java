
import java.util.Scanner;

class basic2 {
    public static void main(String args[]){
       Scanner scan = new Scanner(System.in);
         String name =scan.nextLine();
         int age = scan.nextInt();
         scan.nextLine();
         String address = scan.nextLine();
         System.out.println("My Name Is "+name);
         System.out.println("My Age Is "+age);
         System.out.print("My Address Is "+address);

         Scanner num = new Scanner(System.in);
         int num1 = num.nextInt();
         int num2 = num.nextInt();
         int num3 = num.nextInt();
         System.out.println("The total value is "+(num1+num2+num3));

         

         

    }
    
}