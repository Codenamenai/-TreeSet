import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> noble = new ArrayList<>();
        noble.add(new Person("Gasan", "Abdurahman Hattab", 386));
        noble.add(new Person("Alan", "Kempebericky", 39));
        noble.add(new Person("Edvard", "von Baron", 60));
        noble.add(new Person("Andrej", "Petrov Vodkin", 56));
        Collections.sort(noble, new PersonComparator());
        System.out.println(noble);


    }
}
