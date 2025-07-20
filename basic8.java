import java.util.Scanner;

class basic8 {
     public static void main(String args[]){
        Scanner n = new Scanner(System.in);
        int score = n.nextInt();
        if (score>=35&&score<60) {
            System.out.println("Video Game ");
        }
     if (score>=60&&score<90) {
    System.out.println("Iphone");
   }
    if (score>=90&&score<=100) {
    System.out.println("Macbook");
   }
     }
}
