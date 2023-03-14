import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        List<Person> noble = new ArrayList<>();
        noble.add(new Person("Gasan", "Abdurahman Hattab", 386));
        noble.add(new Person("Alan", "Kempebericky", 39));
        noble.add(new Person("Edvard", "von Baron", 60));
        noble.add(new Person("Andrej", "Petrov Vodkin", 56));
        Comparator<Person>comparator=(Person o1,Person o2) ->{
            String[] surname1 = o1.getSurname().split("\\P{IsAlphabetic}+");
            String[] surname2 = o2.getSurname().split("\\P{IsAlphabetic}+");
            int surnameLength1 = Math.min(surname1.length, 2);
            int surnameLength2 = Math.min(surname2.length, 2);
            int surnameCompare = Integer.compare(surnameLength2, surnameLength1);
            if (surnameCompare == 0) {
                return Integer.compare(o2.getAge(), o1.getAge());
            } else {
                return surnameCompare;
            }
        };
        Collections.sort(noble, comparator);
        System.out.println(noble);


    }
}
