

public class thiskeyword {
    String name = null;

    public thiskeyword() {

  System.out.println("hello");
    }
   static  void setname(String name){
     name = name ;
     System.out.println(name);
   }
    public static void main(String[] args) {
        thiskeyword h = new thiskeyword();
        h.setname("mark");
        System.out.println(h.name);
    }
}
