public class constructor {
     int mark;
     String name ;
   // when i create object when the constructor defaulty created and assing value to un valued variable and call defaulty 
      /* constructor(){
        System.err.println("mark");
       }

     public static void main(String[] args) {
         constructor h = new constructor();
          System.err.println(h.mark);
          System.err.println(h.name);
       
     }*/


// if pass arguments to constructor ? yes 

       /*constructor(int a){
        System.out.println(a);
       }

     public static void main(String[] args) {
         constructor h = new constructor(10);

       
     }*/

    //  functions rules
    // if 2 function having same name and arguments if the function is not working it give error 
    //  if 2 2 function having same name but different arguments if the function are work
    
    constructor(int a){
        System.out.println(a);
       }
       constructor(){
        System.out.println();
       }


     public static void main(String[] args) {
         constructor h = new constructor(10); //this line a should pass args and the functions having same name which is working which function having args that function is called and print 
         constructor h1 = new constructor();    //this line a should call a function  and the functions having same name which is working which function having no  args that function is called and print  becoz i dn't pass args
         

       
     }

}




