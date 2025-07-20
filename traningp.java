import java.util.Scanner;

class traningp {
    public static void main(String args[]){
        Scanner n = new Scanner(System.in);
        int salary = n.nextInt();
        int age = n.nextInt();
        
        if (salary>=20000||age<=25) {
           System.out.println("Enter Loan amount ");
           int loan = n.nextInt();
             if (loan<=50000) {
            System.out.println("Your Eligible For Loan");
           }
           else{
            System.out.println("Your Not Eligible");
              }
              
    }
        }
       
}
