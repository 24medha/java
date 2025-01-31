public class C {
    public static void A(int i, int j){
        System.out.println(i+j);
    }
    public static void A(int i, int j, int k){
        System.out.println(i+j-k);
    }
    public static void A(){
        System.out.println("hello world");
    }
    public static void main(String[] args, int i) {
    A(4, 5, 7);
    }
    
}
