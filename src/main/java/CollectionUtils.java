import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class CollectionUtils {
    void printCountingDuplicateWord(Collection collection, String word) {
        long count = collection.stream()
                .filter(a -> a.equals(word))
                .count();
        System.out.println(count);
    }

    void printFirstWord(Collection collection) {
        String word = collection.stream()
                .findFirst()
                .orElse("0").toString();
        System.out.println(word);
    }

    void printLastWord(Collection collection) {
        String word = collection.stream()
                .skip(collection.size() - 1)
                .findAny().orElse("0").toString();
        System.out.println(word);
    }

    String[] stringListSort(List<String> list) {
        return list.stream()
                .sorted(Comparator.comparingInt(f -> Integer.parseInt(f.substring(1))))
                .toArray(String[]::new);
    }
}