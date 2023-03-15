import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //first number:
        Scanner numeroOneScanner =  new Scanner(System.in);
        System.out.print("Enter the first number:");
        int numeroOne = numeroOneScanner.nextInt();

        //second number:
        Scanner numeroTwoScanner = new Scanner(System.in) ;
        System.out.print("Enter the second number:");
        int numeroTwo = numeroTwoScanner.nextInt();

        //Result
        int resul = numeroOne + numeroTwo;
        System.out.println("The result is\n " + resul);
    }

}