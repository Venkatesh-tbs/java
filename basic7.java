import java.util.Scanner;

class basic7 {
    public  static void main(String args[]){
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
         /*if (num%3==0&&num%5==0) {
            System.out.println("IF the Num Divisible Both 3 And 5");    
        }
        else{
            System.out.println("Not");
        }*/
      if (num%2==0) {
        System.out.println("Even");
      }
      else{
        System.err.println("odd");
      }
    }
}
