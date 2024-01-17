import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> word = Arrays.asList(
                "Instagram", "Vk", "FaceBook", "Google", "Yandex",
                "GitHub", "Twitter", "SpaceX", "Toyota", "Vokswagen",
                "Renault", "Vk", "Toyota", "SpaceX", "GitHub", "Google");
        System.out.println("Исходный массив:");
        System.out.println(word);
//Вариант1
        Words words = new Words();
        words.numberOfWordRepetitions(word);
        words.uniqueWords(word);
//вариант2
        System.out.println("Вариант: 2");
        Set<String> uniqueWords = new HashSet<>(word);
        System.out.println("Исходный массив:");
        System.out.println(word);
        System.out.println("Уникальные слова");
        System.out.println(uniqueWords);
        System.out.println("Количество повторов слов");
        for (String key : uniqueWords) {
            System.out.print(key + ": " + Collections.frequency(word, key) + " ");
        }

        Phonebook phonebook = new Phonebook();
        System.out.println("\nЗаполняем справочник");
        phonebook.add("Иванов", "11111");
        phonebook.add("Петров", "22222");
        phonebook.add("Пупкин", "33333");
        phonebook.add("Сидоров", "44444");
        phonebook.add("Иванов", "55555");
        phonebook.add("Иванов", "55555");

        System.out.println("\nПолучаем номера");
        phonebook.get("Иванов");
        phonebook.get("Петров");
        phonebook.get("Пупкин");
        phonebook.get("Сидоров");
        phonebook.get("Головач");
////        System.out.println("Иванов");
////        System.out.println(phonebook.get("Иванов"));
////        System.out.println("Петров");
////        System.out.println(phonebook.get("Петров"));
////        System.out.println("Сидоров");
////        System.out.println(phonebook.get("Сидоров"));
//        System.out.println("-----------------");

//        System.out.println("Случай отсутствия записи");
//        System.out.println("Головач");
//        System.out.println(phonebook.get("Кузнецов"));
//        System.out.println("-----------------");

//        System.out.println("Пробуем записать существующий номер");
//        phonebook.add("Иванов", "223344");
//        System.out.println("Иванов");
//        System.out.println(phonebook.get("Иванов"));
    }
}