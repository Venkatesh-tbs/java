public class basicfunction {
    /*without static in function
     void  cat(){
         System.out.println("AHhhh");
     }
     void dog(){
        System.out.println("Woow");
     }
     public static void main(String[] args) {
          basicfunction g = new basicfunction();
          g.cat();
          g.dog();
          }*/
           // with static in function
    static  void  cat(){
        System.out.println("AHhhh");
    }
    static void dog(){
       System.out.println("Woow");
    }
    public static void main(String[] args) {
         cat();
         dog();
         }
}
