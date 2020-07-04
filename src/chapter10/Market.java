package chapter10;

public class Market {
    public static void main(String[] args) {
        Fruit apple = new Apple();

        // Type kiwi and instantiation of Kiwi
        Fruit kiwi = new Kiwi();
        kiwi.makeJuice();

        Apple greenApple = new Apple();
        greenApple.makeJuice();
        greenApple.binFruit();

        Fruit redApple = new Apple();
        redApple.makeJuice();

        // type fruit, instantiation of Kiwi, because kiwi extends (ISA) fruit
        Fruit niceFruit = new Kiwi();
        niceFruit.makeJuice();
        niceFruit = new Apple();

        (niceFruit).makeJuice();

        Fruit nastyFruit = new Apple();
        nastyFruit.makeJuice();
        nastyFruit.binFruit();
    }
}
