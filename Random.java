public class Random {

public static void main(String[] args) {
    System.out.println("\033[H\033[2J");
   

    System.out.println(java.lang.Math.ceil(7.00001));
    System.out.println(java.lang.Math.floor(7.789));
    System.out.println(java.lang.Math.round(7.5));
    System.out.println(java.lang.Math.round(7.4));

    System.out.println("-- - - - - - -");


    System.out.println((int) java.lang.Math.ceil(java.lang.Math.random()*8999)+1000);




}
    
}
