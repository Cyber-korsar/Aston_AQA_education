import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CollectionUtils utils = new CollectionUtils();
        Collection<String> collection = Arrays.asList("Highload", "High", "Load", "Highload", "Highload", "High", "Load", "Highload", "Qwerty");
        utils.printCountingDuplicateWord(collection, "High");
        utils.printFirstWord(collection);
        utils.printLastWord(collection);
        List<String> list = Arrays.asList("f10", "f15", "f2", "f4", "f3");
        utils.stringListSort(list);
        System.out.println(Arrays.asList(utils.stringListSort(list)));
        utils.printFirstWord(Arrays.asList(utils.stringListSort(list)));

        Students student = new Students();
        Collection<Students.Student> students = Arrays.asList(
                new Students.Student("Дмитрий", 17, Students.Gender.MAN),
                new Students.Student("Максим", 20, Students.Gender.MAN),
                new Students.Student("Екатерина", 20, Students.Gender.WOMAN),
                new Students.Student("Пётр", 20, Students.Gender.MAN),
                new Students.Student("Михаил", 28, Students.Gender.MAN)
        );
        // средний возраст
        student.printAverageAge(students);
        // кто получит повестку
        student.subpoena(students);

    }
}