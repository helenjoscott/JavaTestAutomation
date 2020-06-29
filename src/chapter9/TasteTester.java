package chapter9;

public class TasteTester {
    public static void main(String[] args) {
        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setCandles(42);
        birthdayCake.setFlavor("Lemon");
        birthdayCake.setPrice(9.99);
        System.out.println("Helen's " + birthdayCake.getCandles() + " birthday cake is " + birthdayCake.getFlavor() + " flavour and cost " + birthdayCake.getPrice());

       WeddingCake weddingCake = new WeddingCake();
       weddingCake.setTiers(5);
       weddingCake.setFlavor("chocolate");
       weddingCake.setPrice(51.43);
        System.out.println("Helen's wedding cake has " + weddingCake.getTiers() + " tiers, is " + weddingCake.getFlavor() + " flavour and cost " +  weddingCake.getPrice());
    }
}
