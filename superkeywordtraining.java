class  person{
    public String name ;
   protected int age ;
   private int ssn;
   String address;

    public person(String name , int age , int ssn , String address){
       
    }
}
class employee extends person{
  
    public employee(String name , int age , int ssn , String address) {
        super(name,age,ssn,address);
    }
    
}
public class superkeywordtraining {
    public static void main(String[] args) {
        employee e = new  employee("hari",23,2345,"chennai");

    }
}
