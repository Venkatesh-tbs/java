import java.util.Scanner;

class baicarray2 {
    public static  void main(String args[]){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the Size Of Array :");
        int size = n.nextInt() , i;
        int[] arr = new int[size];
        System.out.println("Enter the Elements Of Array :");
        for(i = 0 ; i < size ; i++){
            arr[i] = n.nextInt();
        }
        System.out.println("Output");
        for( i = 0 ; i < size ; i++){
          System.out.println(arr[i]);
        }
        System.err.println("**** 2 Table ****");
        for ( i = 1; i <= 10; i++){
            int table = i*2;
            System.err.println(table);
        }
    }
}
