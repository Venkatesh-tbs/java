interface  fun{
    void dis();
}
/* What is Functional Interface the Interface Contain only one function that is 
 * called interface function we don'y need to create class to access the methode 
 * the can access directly cwith the object
 */


public class functionalinterface {
    public static void main(String[] args) {
        fun f = new fun(){
            public void dis(){
                System.out.println("hari");
            }   
        };
        f.dis(); // create inner class using the function in the body and call the funtion using the object 
    }
  
       
}
