public class Main {
    public static void main(String[] args) {

        Clients c001 = new Clients();
        c001.firstName = "William";
        c001.age = 28;


        Clients c002 = new Clients();
        c002.firstName = "Mariana";
        c002.age = 35;

        c001.newAccount();

    }
}