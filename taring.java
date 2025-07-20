class animal{
  String name;
  int age ;
  void makesound(){
     System.out.println("Animals Makes a Sound ");
  }
}
class dog extends animal{
  String greed ;

    @Override
    void makesound() {
        System.out.println("Dog barks ");
    }
   void fetch(){
    System.out.println("Dog is fetching");
   }
}
class cat extends animal{
  String color ;

    @Override
    void makesound() {
        System.out.println("Cat meows");
    }
    void climb(){
      System.out.println("Cat is climbing");
    }
  
}
public class taring{
  public static void main(String[] args) {
    dog d = new dog();
    d.name = "dog";
    d.age = 17;
    
    System.out.println(d.name);
    System.out.println(d.age);
    d.makesound();
    d.fetch();
    cat c = new cat();
    c.name = "cat";
    c.age = 10 ;
    System.out.println(c.name);
    System.out.println(c.age);
    c.makesound();
    c.climb();
      

  }
}
//  this problem based on herarichal inheritance 
