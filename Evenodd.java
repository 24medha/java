public class Evenodd {

public static void main(String[] args) {
    System.out.println("\033[H\033[2J");
   

    int a[] = {1, 6, 5, 11, 67, 12}; 


    for (int i : a) {
        if (i%2 == 1) {
        System.out.println(i);
            
        }
    }
}
    
}
