import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] my_array1 = {

                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};

        System.out.println("Array one  - Original: " + Arrays.toString(my_array1));// Ordenado
        Arrays.sort(my_array1);
        System.out.println("Array one  - Order: " + Arrays.toString(my_array1));// Original

        String[] my_array2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };

        System.out.println("Array two  - Original: " + Arrays.toString(my_array2));// Ordenado
        Arrays.sort(my_array2);
        System.out.println("Array two  - Order: " + Arrays.toString(my_array2));// Original
    }
}