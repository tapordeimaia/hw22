import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Automobil> automobile = new HashSet<>();
        automobile.add(new Automobil(2005, "BMW"));
        automobile.add(new Automobil(2007, "Audi"));
        automobile.add(new Automobil(2008, "Porsche"));
        automobile.stream()
                .sorted()
                .forEach(System.out::println);
        Set<Automobil> automobile2 = new TreeSet<>();
        automobile2.add(new Automobil(2005, "BMW"));
        automobile2.add(new Automobil(2007, "Audi"));
        automobile2.add(new Automobil(2008, "Porsche"));
        automobile2.stream()
                .forEach(System.out::println);
    }
}