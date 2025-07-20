import java.util.Scanner;

class basic6 {
    public static  void main(String args[]){
        /*Scanner team = new Scanner(System.in);
        String RCB = team.nextLine();
        if (RCB.equals("win")) {
            System.out.println("Winner RCB");
        }
        else{
            System.out.println("Looser");
        }*/
        Scanner m = new Scanner(System.in);
        /*int mark = m.nextInt();
        if(mark>=35) {
            System.out.println("Pass");
        }
        else{
            System.out.println("fail");
        }*/
        int income = m.nextInt();
        if (income>7000) {
            System.err.println("Eligible for scholarship");
            
        }
        else{
            System.err.println("Not Eligible ");
        }
    }

    }
