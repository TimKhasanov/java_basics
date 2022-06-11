
import java.util.HashMap;
import java.util.Map;

public class CustomerStorage {
    private final Map<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) {
        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;

        String[] components = data.split("\\s+");
        String regexEmail1 = "(.+[@][a-z]{2,6}[.][a-z]{2,4})";
        String regexPhone = "([+]\\d{11})";

        if (components.length != 4) {
            throw new FormatLengthException();
        }

        String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];
        storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));

        if (!components[2].matches(regexEmail1)) {

            throw new FormatEmailException();

        } else if (!components[3].matches(regexPhone)) {

            throw new FormatPhoneException();
        }

    }

    public void listCustomers() {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        storage.remove(name);
    }

    public Customer getCustomer(String name) {
        return storage.get(name);
    }

    public int getCount() {
        return storage.size();
    }

    class FormatLengthException extends ArrayIndexOutOfBoundsException {
        public String toString() {
            return "Wrong format. Correct format: " +
                    "Василий Петров vasily.petrov@gmail.com +79215637722";
        }
    }

    class FormatEmailException extends IllegalArgumentException {
        public String toString() {
            return "Wrong format. Correct format: vasily.petrov@gmail.com";
        }
    }

    class FormatPhoneException extends IllegalArgumentException {
        public String toString() {
            return "Wrong format. Correct format: +79215637722";
        }
    }
}