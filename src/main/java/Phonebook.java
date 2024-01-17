import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Phonebook {

    private HashMap<String, List<String>> phoneBook;

    public Phonebook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        if (phoneBook.containsKey(surname)) {
            List<String> numbers = phoneBook.get(surname);
            if (!numbers.contains(phoneNumber)) {
                numbers.add(phoneNumber);
                printPhoneBook(surname, phoneNumber);
            } else {
                System.out.printf("Для фамилии %s уже существует телефон %s%n", surname, phoneNumber);
            }
        } else {
            phoneBook.put(surname, new ArrayList<>(Arrays.asList(phoneNumber)));
            printPhoneBook(surname, phoneNumber);
        }
    }

    private void printPhoneBook(String surname, String phoneNumber) {
        System.out.printf("Для фамилии %s добавлен номер: %s%n", surname, phoneNumber);
    }

    public void get(String surname) {
        if (phoneBook.containsKey(surname)) {
            String phoneNumber = phoneBook.get(surname).toString();
            System.out.printf("%s \nтелефон(ы) %s\n\n", surname, phoneNumber);
        } else {
            System.out.printf("В справочнике нет записи для фамилии: %s", surname);
        }
    }
}