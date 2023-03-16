import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] valores = {10, 20, 30, 40};
        Arrays.sort(valores); //organizar em ordem

        System.out.println(Arrays.toString(valores));
        System.out.println(valores.length); //tamanho da minha arrays
    }
}