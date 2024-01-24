import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;

public class Students {
    void printAverageAge(Collection<Student> students) {
        System.out.println(students.stream()
                .filter(s -> s.getGender() == Gender.MAN)
                .mapToInt(Student::getAge)
                .average()
                .getAsDouble());
    }

    void subpoena(Collection<Student> students) {
        System.out.println(students.stream()
                .filter(A -> A.getAge() >= 18 && A.getAge() < 27 && A.getGender() == Gender.MAN)
                .collect(Collectors.toList()));
    }

    public enum Gender {
        MAN,
        WOMAN
    }

    protected static class Student {
        private final String name;
        private final Integer age;
        private final Gender gender;// Sex gender;

        public Student(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "{" + "name='" + name + '\'' + ", age=" + age + ", gender=" + gender + "}";
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) &&
                    Objects.equals(age, student.age) &&
                    Objects.equals(gender, student.gender);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, gender);
        }
    }
}