public class staticmethod{
    /*static  int a = 0;
    static String n = "hari";
    static  void name(){
        System.out.println("JAVA");
    }
    public static void main(String[] args) {
        staticmethod s1 = new staticmethod();
        s1.a = 100;
        staticmethod s2 = new staticmethod();
        s2.a = 20 ;
        s2.n = "naveen"; // the last object only chane the variable value
        System.out.println(s1.n);
        staticmethod.name();
    */
    int a = 0 ;
    static {
        System.out.println("HIii");
    }
        public static void main(String[] args) {
            staticmethod s1 = new staticmethod();
            s1.a = 10;
            System.out.println(s1.a);
    }
}
/*Static Keyword
In Java, the static keyword is used to indicate that a member
(field or method) belongs to the class itself, rather than to
instances of the class. This means that static members are
shared among all instances of the class. 

Static Fields:
• Shared Across Instances: A static field (also known as a class
variable) is shared by all instances of the class. All objects of
the class access the same static field.
• . Memory Allocation: The memory for a static field is allocated
when the class is loaded, and it is deallocated when the class
is unloaded.
*/


