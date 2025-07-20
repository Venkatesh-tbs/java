/*
 single inheritance 
class  bike{
      void biketemplate(){
        System.out.println("get template ");
     }
}
class  wheel extends bike{
      void wheels(){
        System.out.println("Wheels");
    }
}
public class tyinheritance {
     public static void main(String[] args) {
         wheel h = new wheel();
         h.biketemplate();
     }
}
     */
    /*
     multilevel class
    class  bike{   //super class 
        void biketemplate(){
          System.out.println("get template ");
       }
  }
  class  wheel extends bike{// derived class 
        void wheels(){
          System.out.println("Wheels");
      }
  }
  class petrol extends wheel{// derived class 
    void petrole(){
        System.out.println("petrol is ready");
    }
  }
  public class tyinheritance {
       public static void main(String[] args) {
           petrol h = new petrol();
           h.biketemplate();
           h.wheels();

       }
  }
       */
      /*
      hierarchical inheritance 
      class  bike{   //super class 
        void biketemplate(){
          System.out.println("get template ");
       }
  }
  class  wheel extends bike{// derived class 
        void wheels(){
          System.out.println("Wheels");
      }
  }
    class driver extends bike {// derived class 
        void divers(){
            System.out.println("driver is ready");
        }
    }
  
  public class tyinheritance {
       public static void main(String[] args) {
           driver h = new driver();
           h.biketemplate();
          

       }
  }
       */
      /*  hybrid inheritance 
      class  bike{   //super class 
        void biketemplate(){
          System.out.println("get template ");
       }
  }
  class  wheel extends bike{// derived class 
        void wheels(){
          System.out.println("Wheels");
      }
  }
    class driver extends bike {// derived class 
        void divers(){
            System.out.println("driver is ready");
        }
    }
    class petrol extends wheel{// derived class 
      void petrole(){
          System.out.println("petrol is ready");
      }
    }
  
  public class tyinheritance {
       public static void main(String[] args) {
           driver h = new driver();
           h.biketemplate();
          

       }
  }
        */
