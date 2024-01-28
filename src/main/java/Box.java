public class Box<T extends Fruit> {
    private T obj;
    private int fruitCount;

    public Box() {
    }

    public Box(T obj, int fruitCount) {
        this.obj = obj;
        this.fruitCount = fruitCount;
    }

    public void putFruitInAnotherBox(Box<T> firstBox, Box<T> secondBox) {
        if (secondBox.obj == firstBox.obj) {
            secondBox.addFruit(firstBox.fruitCount);
            firstBox.fruitCount = 0;
        }
    }

    public void addFruit(int num) {
        fruitCount += num;
    }

    float getWeight() {
        float boxWeight = fruitCount * obj.getWeight();
        return boxWeight;
    }

    public boolean compare(Box<?> box) {
        return this.getWeight() == box.getWeight();
    }

    @Override
    public String toString() {
        return
                "Weight " + getClass().getName() + " = " + getWeight();
    }
}