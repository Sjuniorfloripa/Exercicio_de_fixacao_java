package Fundamentos.solved.classesTeste.heranca;

public class MainCarroTest {
    public static void main(String[] args) {
        Carro fusca = new Fusca(110);

        System.out.println("Fusca tem " + fusca);

        fusca.acelerar();
        System.out.println("Fusca tem " + fusca);
        fusca.acelerar();
        System.out.println("Fusca tem " + fusca);
        fusca.acelerar();
        System.out.println("Fusca tem " + fusca);
        fusca.frear();
        System.out.println("Fusca tem " + fusca);

        System.out.println("---------------------------------------------");

        Carro ferrari = new Ferrari(300);

        System.out.println("Ferrari tem " + ferrari);

        ferrari.acelerar();
        System.out.println("Ferrari tem " + ferrari);
        ferrari.acelerar();
        System.out.println("Ferrari tem " + ferrari);
        ferrari.acelerar();
        System.out.println("Ferrari tem " + ferrari);
        ferrari.frear();
        System.out.println("Ferrari tem " + ferrari);
    }
}
