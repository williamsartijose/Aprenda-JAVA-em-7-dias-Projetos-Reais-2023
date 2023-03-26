package Cars;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW", "X6" , 2024);
        System.out.println(car.marca); // marca has private access in Cars.Car N acessa por os parametro ser privado
    }
}