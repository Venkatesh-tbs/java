class  run extends Thread{
    int j = 0  ;
    public  void run(){

        for (int i = 0; i < 10; i++) {
         j ++;
        }
    }
}

public class jointhreads {
    public static void main(String[] args) {
        run r  = new run();
        r.start();
        try {
            r.join();
        } catch (Exception e) {  // why the function call in try and catch becoz the join function give possible to give error some tym 
            System.out.println(e);
        }
        System.out.println(r.j); // it can't give value of j i will be only 0 becoz the main thread can't wait to the sub thread execute so we use join function it help to wait the 
        //main thread till the sub thread  execute 
       
        
    }
}
