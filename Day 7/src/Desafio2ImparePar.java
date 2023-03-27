import java.util.Scanner;

public class Desafio2ImparePar {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nuemro: ");
        int n = sc.nextInt();
        
        if (n % 2 == 1 )
            System.out.println("impar");
        else {
            if (n >= 2 && n <= 5)
                System.out.println("A");
            else if (n >= 6 && n <= 20)
                System.out.println("B");
            else
                System.out.println("C");
            }
        }
        
    }
}
