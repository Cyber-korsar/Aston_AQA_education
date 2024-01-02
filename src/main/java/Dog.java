public class Dog extends Animal {
    static final int LIM_RUN_DOG = 500;
    static final int LIM_SWIM_DOG = 10;

    Dog(String name) {
        super(name, LIM_RUN_DOG, LIM_SWIM_DOG);
    }
}