public class Cat extends Animal {
    static final int LIM_RUN_CAT = 200;
    static final int LIM_SWIM_CAT = 0;
    static int catCount;
    boolean satiety;
    static int amountOfFoodInBowl;

    Cat(String name) {
        super(name, LIM_RUN_CAT, LIM_SWIM_CAT);
        this.satiety = false;
        catCount++;
    }

    void printSatietyCat() {
        System.out.println(this.name + " " + satiety);
    }

    static void printCreateCatCount() {
        System.out.println("Котов создано " + catCount);
    }

    public void eating(int count) {
        if (amountOfFoodInBowl >= count) {
            amountOfFoodInBowl = amountOfFoodInBowl - count;
            this.satiety = true;
            System.out.println("Кот съел еды " + count);
            System.out.println("В миске осталось еды " + amountOfFoodInBowl);
        } else
            System.out.println("Кот хотел съесть еды " + count + "\nВ миске недостаточное количество еды " + amountOfFoodInBowl);
    }

    public static void addEatToBowl(int count) {
        amountOfFoodInBowl = amountOfFoodInBowl + count;
        System.out.println("В миску добавили еды " + count);
        System.out.println("В миске осталось еды " + amountOfFoodInBowl);
    }
}