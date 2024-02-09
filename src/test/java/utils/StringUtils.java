package utils;

public class StringUtils {
    public static String deleteChars(String word) {
        return (word == null || word.length() == 0) ? null : word.substring(0, word.length() - 4);
    }

    public static String deleteFirstChars(String word) {
        return (word == null || word.length() == 0) ? null : word.substring(9);
    }

    public static String getNumber(String input) {

        String[] tokens = input.split("Номер:375");
        return tokens[tokens.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(getNumber("Оплата: Услуги связи Номер:375297777777"));
    }
}
