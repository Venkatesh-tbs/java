import java.util.Scanner;

class basicarray {
    public static void main(String arg[]){
        int[] arr = new int[5];
        Scanner c = new Scanner(System.in);
        arr[0] =c.nextInt();
        arr[1]=c.nextInt();
        arr[2]=c.nextInt();
        arr[3]=c.nextInt();
        arr[4]=c.nextInt();
        System.err.println("Output");
        for(int i =0; i <5 ; i++){
           
            System.out.println(arr[i]);
        }
    }
}
