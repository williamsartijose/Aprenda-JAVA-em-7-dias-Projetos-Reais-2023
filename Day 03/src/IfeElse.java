public class IfeElse {
    public static void main(String[] args){
        //faixa de carro entre 90 e 100
        int valorCarro = 100_00;
        if (valorCarro > 100_00)
        System.out.println("Não comprar. Acima da tabela");

        else if (valorCarro >= 90_00 && valorCarro <= 100_00)
            System.out.println("Comprar o carro");
            else
            System.out.println("Não comprar. Valor abaixo");

        }
    }

