public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        System.out.println(apple);
        System.out.println(orange);

        Box<Apple> appleBox = new Box<>(apple, 6);
        Box<Orange> orangeBox1 = new Box<>(orange, 4);
        Box<Orange> orangeBox2 = new Box<>(orange, 0);
        orangeBox2.addFruit(2);
        System.out.println(orangeBox1);
        System.out.println(appleBox);
        System.out.println(orangeBox2);
        System.out.println(orangeBox1.compare(appleBox));
        orangeBox1.putFruitInAnotherBox(orangeBox1, orangeBox2);
        System.out.println(orangeBox2);
        System.out.println(orangeBox1);
        //orangeBox1.putFruitInAnotherBox(appleBox,orangeBox1); // согласно условию так делать не даёт
    }
}