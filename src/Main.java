import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        String name = "Md. Rafiul Islam Refat";
        System.out.println(name.replace("Md.", ""));

        int[] num = {12,5,9,3};  // Declare array with elements
        Arrays.sort(num);  // Sorting array elements
        System.out.println(Arrays.toString(num));  // Printing array
    }
}