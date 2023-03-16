import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> noble = new ArrayList<>();
        noble.add(new Person("Gasan", "Abdurahman Hattab", 386));
        noble.add(new Person("Alan", "Kempebericky", 39));
        noble.add(new Person("Edvard", "von Baron", 60));
        noble.add(new Person("Andrej", "Petrov Vodkin", 56));
       /* noble.add(new Person("Trifon","Barmaleev",17));
        noble.add(new Person("Ulugbek","Tohtamischev",16));
        noble.removeIf(x->x.getAge()<18);*/
        Comparator<Person>comparator=(Person o1,Person o2) ->{
            String[] surname1 = o1.getSurname().split("\\P{IsAlphabetic}+");
            String[] surname2 = o2.getSurname().split("\\P{IsAlphabetic}+");

            int compare = Integer.compare(surname2.length,
                    surname1.length);
            if (compare == 0) {
                return Integer.compare(o2.getAge(), o1.getAge());
            } else {
                return compare;
            }
        };
        Collections.sort(noble, comparator);
        System.out.println(noble);


    }
}
