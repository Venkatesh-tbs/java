// use interface implements runnable 


class  A implements Runnable{
public void run(){
    System.out.println("Hiiii");
}
}
public class runnablthread {   
    public static void main(String[] args) {
        A obj = new A();
        // obj.start();   it give error becoz the thread in runnable so u create object in thread
    Thread t = new Thread(obj);
    t.start();  
    }
}
