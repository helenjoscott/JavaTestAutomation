package chapter10;

public class Kiwi extends Fruit {

    int calories = 20;

    public void peelKiwi() {
        System.out.println("Peeled the Kiwi");
    }

    @Override
    public void makeJuice() {
        // super.makeJuice();
        System.out.println("Made Kiwi Juice");
    }
}
