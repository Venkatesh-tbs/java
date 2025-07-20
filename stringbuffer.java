public class stringbuffer {
    public static void main(String[] args) {
        StringBuffer ad = new StringBuffer("hari");
        ad.delete(0, 3);
        System.err.println(ad);
        ad.replace(0,2,"har");
        System.out.println(ad);
    }
}
