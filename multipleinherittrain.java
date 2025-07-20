interface readable{
 void read();
}
interface writable{
void write();
}
interface storable{
void store();
}
class file implements readable,writable,storable{

    @Override
    public void read() {
        System.out.println("The");
    }

    @Override
    public void write() {
        System.out.println("Contact is ");
    }

    @Override
    public void store() {
        System.out.println("Saved");
    }
    

}




public class multipleinherittrain {
    public static void main(String[] args) {
        file f = new file();
        f.read();
        f.write();
       f.store();
    }
}
