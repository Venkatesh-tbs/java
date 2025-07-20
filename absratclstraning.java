

abstract class ani{
    String nam;
   ani(String name){
  nam = name ;
   }
    abstract void makesound();
}
class dog extends ani {

     dog(String name){
     super(name);
     }
    @Override
    void makesound() {
         System.out.println("Waaw");
    }
    
}

class cat extends ani {
    cat(String name){
     super(name);
 }
    @Override
    void makesound() {
         System.out.println("meow");
    }
    
}


public class absratclstraning {
    public static void main(String[] args) {
        dog d  = new dog("dog");
    cat c = new cat("cat");
       System.out.println(d.nam);
    d.makesound();
    System.out.println(c.nam);
    c.makesound();
    }
    
    
}
