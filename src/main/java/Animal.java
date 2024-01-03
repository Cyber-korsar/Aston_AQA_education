public class Animal {
    String name;
    static int animalCount;
    int runLimit;
    int swimLimit;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        animalCount++;
    }

    void run(int count) {
        if (count <= this.runLimit) {
            runBuild(count);
        } else
            cantRunBuild(count);
    }

    void cantRunBuild(int count) {
        StringBuffer runMassage = new StringBuffer();
        runMassage.append(this.name).append(" ").append("не может пробежать ").append(count).append("м.").append("\nЛимит бега ").append(this.runLimit).append("м.");
        System.out.println(runMassage);
    }

    void runBuild(int count) {
        StringBuffer runMassage = new StringBuffer();
        runMassage.append(this.name).append(" ").append("пробежал").append(" ").append(count).append("м.");
        System.out.println(runMassage);
    }

    void cantSwimBuild(int count) {
        StringBuffer runMassage = new StringBuffer();
        runMassage.append(this.name).append(" ").append("не может проплыть ").append(count).append("м.").append("\nЛимит плавания ").append(this.swimLimit).append("м.");
        System.out.println(runMassage);
    }

    void swimBuild(int count) {
        StringBuffer runMassage = new StringBuffer();
        runMassage.append(this.name).append(" ").append("проплыл").append(" ").append(count).append("м.");
        System.out.println(runMassage);
    }

    void swim(Animal animal, int count) {
        if (count <= this.swimLimit) {
            swimBuild(count);
        } else
            cantSwimBuild(count);
    }

    static void printCreateAnimalCount() {
        System.out.println("Животных создано " + animalCount);
    }
}