package chapter11;

public class Farm {
    public static void main(String[] args) {
        Animal bob = new Pig();
        bob.makeSound();

        Pig jill = new Pig();
        jill.makeSound();

        Duck jon = new Duck();
        jon.makeSound();
    }
}
