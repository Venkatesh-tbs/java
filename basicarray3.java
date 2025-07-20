
import java.util.Scanner;

class basicarray3{
    public static void main(String args[]){
      Scanner n = new Scanner(System.in);
      System.out.println("Enter Size Of Array :");
      int size = n.nextInt() , i;
      System.out.println("Enter the Elements Of Array :");
      int[] arr = new  int[size];
      for(i = 0 ; i < size ; i++){
          arr[i] = n.nextInt();
      }
      System.out.println("Output");
      for( i = 0 ; i < size ; i++){
        System.out.println(arr[i]);
      }
      System.err.println("*********************");
      int left = arr[0];
      int right = arr[size-1] ;
      int mid = left + right / 2;
     System.err.println("The Array Of mid  is "+mid);
    }
   

    
     
}
