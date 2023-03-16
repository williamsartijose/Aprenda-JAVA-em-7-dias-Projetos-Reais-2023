import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] cars = {"BMW", "TESLA", "JEEP", "FIAT"};
        cars [2] =  "FERRARI"; //trocar a informação da minha array
        System.out.println(Arrays.toString(cars));
        System.out.println(cars[2]); // escolher qual carro da lista
    }
}