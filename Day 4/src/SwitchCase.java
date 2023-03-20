import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args){

        System.out.println("Digite o nome do produto:");
        Scanner scanner = new Scanner(System.in);
        String nomeProduto = scanner.next().toLowerCase();
        switch (nomeProduto){
            case "banana" :
                System.out.println("R$9.50");
                break;
            case "manga" :
                System.out.println("R$12.80");
                break;
            case "abacate" :
                System.out.println("16.10");
        }

    }
}
