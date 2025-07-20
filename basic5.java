import java.util.Scanner;

class basic5 {
    public static void main(String args[]){
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        if (num1==num2) {
            System.out.println("true");
            
        }
   else{
    System.out.println("false");
   }
    }
}
