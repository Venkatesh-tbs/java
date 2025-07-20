abstract class vechile{
    abstract void drive();
    final void stratengine(){
        System.out.println("Engine started");
    }
    static  String getvehicle(){
        return  "Generic  vechile";
    }
}
class car extends vechile{
  void 
   drive(){
    System.out.println("Drive a car");
   }
}
class motorcycle extends vechile{
    void drive(){
        System.out.println("Drive a bike");
       }
}



public class combinedtrain {
    public static void main(String[] args) {
        car c = new car();
        c.stratengine();
        System.out.println(vechile.getvehicle());
     motorcycle m = new motorcycle();
     m.stratengine();
     System.out.println(vechile.getvehicle());
    }
}
