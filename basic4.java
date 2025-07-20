import java.util.Scanner;
  class basic4 {
    public  static void main(String args[]){
        Scanner u = new Scanner(System.in);
        String name = u.nextLine();
    float score = u.nextInt();
        u.nextLine();
        String dep = u.nextLine();
        System.out.println("My name is "+name);
        System.out.println("My score is "+(score/10)+"/10");
        System.out.println("My department is CSE"+dep);

    }
}