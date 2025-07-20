  abstract class  vechile{
    
    abstract void speed();

}
class car{
        void speed(){
            System.out.println("250km/sec");
        }
}






public class abractmethod {
    public static void main(String[] args) {
        car c = new car();
        c.speed();
    }
}
