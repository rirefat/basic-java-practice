import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        String name = "Md. Rafiul Islam Refat";
        System.out.println(name.replace("Md.", ""));

        // One dimensional array
        int[] num = {12,5,9,3};  // Declare array with elements
        Arrays.sort(num);  // Sorting array elements
        // Printing array (use toString for one dimensional array)
        System.out.println(Arrays.toString(num));

        // Multi-dimensional array
        int[][] numSet2 = { {1,2,3}, {4,5,6} };  // Declare two-dimensional array
        // Printing two-dimensional array. deepToString() is used to print multidimensional array
        System.out.println(Arrays.deepToString(numSet2));
    }
}