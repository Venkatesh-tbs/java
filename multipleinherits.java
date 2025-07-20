/*The way we achive muliple inherits with help of interface 

interface a{

}
interface b{

}
//create class for both a and b interfaces and implements bindly that the multiple inherits
class c implements a,b{

}

public class achivemulipleinterface {
    
}*/
interface printable{
void dis();
}
interface showable{
void dis();
}
class douc implements  printable,showable {

    @Override
    public void dis() {
       System.err.println("Multiple inherits");
    }
   
}
public class  multipleinherits{
 public static void main(String[] args) {
     douc d = new douc();
     d.dis();
 }
}