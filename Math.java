public class Math {
 
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");

        int nums[] = {23, 56, 78, 14, 8, 90};

        int min = nums[0];
        for (int i : nums) {
            if (i < min) {
                min = i;
            }
          //  System.out.println(i);
        }
       
        System.out.println(min);
    }
}
