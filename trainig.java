import java.util.Scanner;

class trainig {
    public static void main(String args[]){
        Scanner n = new Scanner(System.in);
       /*  int score = n.nextInt();
        if (score<50) {
            System.out.println("improve");
        }
        if (score>=50&&score<=70) {
            System.out.println("Good job");
        }
        if (score>70) {
            System.out.println("Excellent");
        }*/
        int m1 = n.nextInt() , m2 = n.nextInt();
        int m3 = n.nextInt(), m4 = n.nextInt() , m5 = n.nextInt();
        int total = m1+m2+m3+m4+m5;
        int avg = total/5;
        if (avg<35) {
            System.err.println("M is required");
        }
        else{
        System.err.println("Good");
        }
        
    }
}
