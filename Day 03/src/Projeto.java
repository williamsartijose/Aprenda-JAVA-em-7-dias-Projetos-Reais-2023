import java.util.Scanner;

public class Projeto {
    public static void main(String[] args) {

        Scanner lerNumeros = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numeroDigito = lerNumeros.nextInt();
        //0 codigo
        if (numeroDigito < 9 && numeroDigito >= 1) {
            System.out.println("Esse numero tem 1 digitos");
        } else if (numeroDigito < 100 && numeroDigito >= 10) {
            System.out.println("Esse numero tem 2 digitos");
        } else if (numeroDigito < 1000 && numeroDigito >= 100) {
            System.out.println("Esse numero tem 3 digitos");
        } else if (numeroDigito < 10000 && numeroDigito >= 1000) {
            System.out.println("Esse numero tem 4 digitos");
        } else if (numeroDigito < 100000 && numeroDigito >= 10000) {
            System.out.println("Esse numero tem 5 digitos");
        } else {
            System.out.println("Esse numero tem 5 digitos");
        }
    }
}
