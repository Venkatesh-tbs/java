import java.util.Scanner;

public class trainig4 {
   static void evenorodd(int num){
        if (num%2==0){
            System.out.println("Even ");
        }
        else{
            System.out.println("odd");
        }
   }
   public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     int a = s.nextInt();
     evenorodd(a);
   }
}
