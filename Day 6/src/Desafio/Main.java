package Desafio;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW", "X6" , 2024, 125_000);

        car.setModelo("X5"); // usando o metodo SET para alterar

        System.out.println(car.getMarca()); // marca has private access in Cars.Car N acessa por os parametro ser privado
        System.out.println(car.getModelo()); // Usando o metodo get ele puxa informação
        System.out.println(car.getAno());
        System.out.println("Valor de venda: " + car.getValor());
    }
}