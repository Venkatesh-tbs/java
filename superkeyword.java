



/* class dad{
    dad(){
         System.out.println("dad");
    }
}
     class  son extends dad {
        son(){
        System.out.println("hari");
        }
   }
    public class superkeyword {
    public static void main(String[] args) {
        son s = new son();

    } 
}
The super keyword in Java is used within a subclass to refer to the
superclass (parent class) objects and methods. It is commonly used in
three scenarios:
1. Calling the superclass constructor: This is used to call the constructor of
the superclass from the subclass constructor.
2. Accessing superclass methods: This allows a subclass to call a method
defined in its superclass, especially if the method is overridder on the
subclass.
3. Accessing superclass fields: This enables the subclass to access fields
that are defined in the superclass, even if the subclass has fields with the
same name.*/
class dad{

    dad(String name ){
         System.out.println(name);
    }
    void data(){
        int a = 6 ;
        System.out.println(a);
    }
}
     class  son extends dad {
        son(){
            super("navven");
            super.data();

        }
   }
    public class superkeyword {
    public static void main(String[] args) {
        son s = new son();

    } 
}
