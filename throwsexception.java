/* throws 

In Java, the throws keyword is used in a method's
signature to declare that the method can throw
one or more checked exceptions. It indicates to the
caller that they need to handle or further propagate
these exceptions. */
class diss{
 void cal() throws Exception
 {
       int a = 10/0;
 }
}



public class throwsexception {
    public static void main(String[] args) {
        diss d = new diss();
        // d.cal();  don't call the function like this becoz when the function is having throws exception
        // so u call the function with exception handling 
        try {
            d.cal();
        } catch (Exception e) {
            System.out.println(e+"Add Valid Number");
        }
    }
}
