public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобик");
        dogBobik.run(dogBobik, 100);
        Cat catBarsik = new Cat("Барсик");
        catBarsik.run(catBarsik, 200);
        dogBobik.swim(dogBobik, 10);
        catBarsik.swim(catBarsik, 10);

        Cat[] catsArray = new Cat[3];
        catsArray[0] = new Cat("Томас");
        catsArray[1] = new Cat("Бегемот");
        catsArray[2] = new Cat("Филипп Маркович");

        Cat.addEatToBowl(50);
        catsArray[0].printSatietyCat();
        catsArray[0].eating(18);
        catsArray[0].printSatietyCat();
        catsArray[1].eating(15);
        catsArray[1].printSatietyCat();
        catsArray[2].eating(20);
        catsArray[2].printSatietyCat();
        Dog.printCreateDogCount();
        Cat.printCreateCatCount();
        Animal.printCreateAnimalCount();
        Geometry circle = new Geometry("Красный", "Чёрный", 45);
        System.out.println(circle.printFigure());
        Geometry rectangle = new Geometry("Красный", "Чёрный", 13, 12);
        System.out.println(rectangle.printFigure());
        Geometry triangle = new Geometry("Красный", "Чёрный", 13, 12, 15);
        System.out.println(triangle.printFigure());
    }
}