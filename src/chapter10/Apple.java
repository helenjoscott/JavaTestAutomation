package chapter10;

public class Apple extends Fruit {
    int calories = 10;

    public void deCoreApple() {
        System.out.println("Removed the core from the apple");
    }

    @Override
    public void makeJuice() {
        // super.makeJuice();
        System.out.println("Made Apple Juice");
    }
}
