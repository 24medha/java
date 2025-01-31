public class CallBackFunction {
    
    public static void B(int i, int j) {
    System.out.println(i+j);
}
public static void A(int i, int j , int k) {

    int z = i +j +k;
   B(z, 9); // call back function 
}

    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        A(2, 3, 5);
    }
}
