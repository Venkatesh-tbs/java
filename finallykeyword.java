public class finallykeyword {
    public static void main(String[] args) {
        int err = 0;
        try {
            int a = 10/0;
           err = 0 ;
        } catch (Exception e) {
          err =  1;
        }
        finally{
            System.out.println("Woowww"); /*What is the use of finally if use the finally it must print the printstatement
            inside the block if the condtition is true or false what where if the finally print Statement is executed 
            What  is the purpos eof finally keyword it use mostly in file handinling when colse the file */
           if (err==0) {
            System.out.println("No error ");
           } else {
            System.out.println("Error found");
           }
        }
    }
}
