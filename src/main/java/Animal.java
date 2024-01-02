public class Animal {
    String name;
    static int animalCount;
    int runLimit;
    int swimLimit;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }

    static void run(Animal animal, int count) {

        if (animal instanceof Dog) {
            if (count <= animal.runLimit) {
                runBuild(animal, count);
            } else
                cantRunBuild(animal, count);

        }
        if (animal instanceof Cat) {
            if (count <= animal.runLimit) {
                runBuild(animal, count);
            } else
                cantRunBuild(animal, count);
        }
    }

    static void cantRunBuild(Animal animal, int count) {
        StringBuffer runMassage = new StringBuffer();
        runMassage.append(animal.name).append(" ").append("не может пробежать ").append(count).append("м.").append("\nЛимит бега ").append(animal.runLimit).append("м.");
        System.out.println(runMassage);
    }

    static void runBuild(Animal animal, int count) {
        StringBuffer runMassage = new StringBuffer();
        runMassage.append(animal.name).append(" ").append("пробежал").append(" ").append(count).append("м.");
        System.out.println(runMassage);
    }

    static void cantSwimBuild(Animal animal, int count) {
        StringBuffer runMassage = new StringBuffer();
        runMassage.append(animal.name).append(" ").append("не может проплыть ").append(count).append("м.").append("\nЛимит плавания ").append(animal.swimLimit).append("м.");
        System.out.println(runMassage);
    }

    static void swimBuild(Animal animal, int count) {
        StringBuffer runMassage = new StringBuffer();
        runMassage.append(animal.name).append(" ").append("проплыл").append(" ").append(count).append("м.");
        System.out.println(runMassage);
    }

    static void swim(Animal animal, int count) {
        if (animal instanceof Dog) {
            if (count <= animal.swimLimit) {
                swimBuild(animal, count);
            } else
                cantSwimBuild(animal, count);
        }
        if (animal instanceof Cat) {
            if (count <= animal.swimLimit) {
                swimBuild(animal, count);
            } else
                cantSwimBuild(animal, count);
        }
    }
}