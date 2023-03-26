package Cars;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW", "X6" , 2024);
        System.out.println(car.getMarca()); // marca has private access in Cars.Car N acessa por os parametro ser privado
        System.out.println(car.getModelo());
        System.out.println(car.getAno());
    }
}