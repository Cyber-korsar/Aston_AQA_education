public class Cat extends Animal {
    static final int LIM_RUN_CAT = 200;
    static final int LIM_SWIM_CAT = 0;

    Cat(String name) {
        super(name, LIM_RUN_CAT, LIM_SWIM_CAT);
    }
}