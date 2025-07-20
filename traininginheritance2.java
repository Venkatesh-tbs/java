class vehicle{
    String brand ;
    int year;
    void stratengine(){

    }
}
    class car extends vehicle{
         String fuletype;

        @Override
        void stratengine() {
           System.out.println("Car engine starts");
        }
         void drive(){
            System.out.println("Car is driving ");
         }
    } 
    class truck extends  vehicle{
        int loadcapcity;

    @Override
    void stratengine() {
        System.out.println("truck engine Starts ");
    }
      void  haul(){
        System.out.println("Truck is hauling");
      }
    }
public class traininginheritance2 {

    public static void main(String[] args) {
        car c = new car();
        c.brand = "lambogani";
        c.year = 2000;
        c.fuletype = "pertrol";
        System.out.println(c.brand);
        System.out.println(c.year);
        System.out.println(c.fuletype);
        c.stratengine();
        c.drive();

        truck t = new truck();
        t.brand = "Tata motors";
        t.year = 1990;
        t.loadcapcity = 20000;
        System.out.println(t.brand);
        System.out.println(t.year);
        System.out.println(t.loadcapcity);
        t.stratengine();
        t.haul();

    }

    
}
