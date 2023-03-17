public class OperadorLoogicoAND {
    public static void main(String[] args){
        // priceProduct = R$20
        // Comprar Somente entre R$10 e R$15

        int priceProduct = 20;
        boolean buy = priceProduct >= 10 && priceProduct  <= 15; // price e maior ou igual ou menor que 15
        System.out.println(buy);
    }
}
