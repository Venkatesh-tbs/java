import java.io.*;
import java.io.IOException;
public class files {
    public static void main(String[] args) {
        File file = new File("summa.txt");
         try{
   FileWriter write = new FileWriter("summ.txt",true);
   write.write("modify the file ");
   write.close();
    }
     catch(IOException e){
System.out.println(e);
    }
    }
}
