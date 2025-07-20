import java.util.Scanner;

public class training5 {
    static String  passorfail( int  mark  ){
        if (mark>=35) {
          return "pass";
        }
        else{
              return "fail";
        }

    }

    public static void main(String[] args) {
        Scanner h =new Scanner(System.in);
        int  mark = h.nextInt();
       String result =  passorfail(mark);
       System.err.println(result);
    }
}
