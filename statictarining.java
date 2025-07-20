// static training 
class Counter{
    static int count = 0 ;
     int instanceNumber = 0 ;
     Counter(){
        count = count + 1 ;
        instanceNumber = instanceNumber + 1;
        System.out.println(count);
        System.out.println(instanceNumber);
     }
}

public class statictarining {

   public static void main(String[] args) {
       Counter c = new Counter();
      Counter h = new Counter();
      Counter g = new Counter();


   }
}

