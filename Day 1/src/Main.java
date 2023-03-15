import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //RESOLVER O PROBLEMA DA CALCULADORA DO TIPO 3.0 DOUBLE

        //first number:
        Scanner numeroOneScanner =  new Scanner(System.in);
        System.out.print("Enter the first number:");
        double numeroOne = numeroOneScanner.nextDouble();

        //second number:
        Scanner numeroTwoScanner = new Scanner(System.in) ;
        System.out.print("Enter the second number:");
        double numeroTwo = numeroTwoScanner.nextDouble();

        //Result
        double resul = numeroOne + numeroTwo;
        System.out.println("The result is " + resul);
    }

}