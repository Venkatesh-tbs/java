class person{
    String name;

    public person(String name) {
          System.out.println(name);
    }
    
}
class Employee extends person{
 int empID = 23689;
  Employee(){
    super("hari");
  }
  void empD(){
     System.out.println(empID);
  }
}

public class trainingsk {
    public static void main(String[] args) {
        Employee E = new Employee();
     E.empD();
    }
}
