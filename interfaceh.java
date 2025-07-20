/* A interface an is like class , the 5th type of inherits is multipleinherits that as a diamond problem issue 
 so then relese the interface feature , that create with the keyword of interface , inside interface all the function are defualty 
   dife eith abract and the variable and function defines with public static final deafualty  
*/
interface animal{
    int a = 10;
    void dis();
    static  void sample(){ //we can create function with body  with the help of static method

    }
    default void sample2(){// and also the function create with body in interface with the help of default also

    }
}
class intract implements animal{

    @Override
    public void sample2() {
    }
  
}
public class interfaceh{
    public static void main(String[] args) {
        intract i = new intract(); // we can't the object for the interface but one way is there create class and using implement method to access the variables and function of the interface 
        i.sample2();
        i.dis();
        // i.a;
    }
}
