import java.util.*;

public class Words {
    public void uniqueWords(List<String> list) {
        System.out.println("Уникальные слова");
        Set<String> unique = new HashSet<>(list);
        System.out.println(unique);
    }

    public void numberOfWordRepetitions(List<String> list) {
        System.out.println("Количество повторов слов");
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : list) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        System.out.println(wordsCount.entrySet());
    }
}