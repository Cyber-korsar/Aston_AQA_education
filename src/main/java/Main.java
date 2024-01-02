public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобик");
        dogBobik.run(dogBobik, 100);
        Cat catBarsik = new Cat("Барсик");
        catBarsik.run(catBarsik, 200);
        dogBobik.swim(dogBobik, 10);
        catBarsik.swim(catBarsik, 10);
    }
}