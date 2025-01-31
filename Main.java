public class Main {
    public static void A(int i, int j) {
        System.out.println(i+j);
    }
    public static void A(int i, int j , int k) {
        System.out.println(i+j-k);
    }

public static void main(String[] args) {
    System.out.println("\033[H\033[2J");
    A(2,3,4);
}
    
}
