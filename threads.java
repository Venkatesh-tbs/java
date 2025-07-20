// threads do multitasking at the same time 
class a extends  Thread{ // this is the way to create threads in java 
   public  void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hiii...");
            try {
                Thread.sleep(5); // u give sleep tym to use sleep function
            } catch (Exception e) { 
            System.out.println(e);
           
        }
       
    }                       // if u use thread u must create a function named run in public 
}
}                                                                
class b extends Thread{
   public  void  run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Guyss");
        }
      
    }
}
public class threads {
    public static void main(String[] args) {
        a h = new a();
        b c = new b();
       h.setPriority(10);
       c.setPriority(2);  // u
        h.start();
        c.start();   // u call the run function in thread u call the function start to start the threads
    }
}

