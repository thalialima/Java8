import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import static java.util.Comparator.*;

public class SortStrings {
    public static void main(String[] args) {
        List<String> words = new ArrayList<String>();
        words.add("chair");
        words.add("table");
        words.add("pineapple");
        words.add("chicken");

        ComparatorBySize comparatorBySize = new ComparatorBySize();

        System.out.println(words);
        //Collections.sort(words, comparatorBySize);
        //now interfaces can have concrete methods starting with the keyword "default"
        //interface still can't have attributes or state
        words.sort(comparatorBySize);
        System.out.println(words);

        //new way to iterate through a list of elements
        Consumer<String> consumer = new PrintInLine();
        words.forEach(consumer);

        words.forEach(System.out::println);

        //lambda com be converted to a functional interface
        //The target type of this expression(lambda) must be a functional interface
        words.sort((o1,  o2) -> Integer.compare(o1.length(), o2.length()));

        System.out.println(words);

        words.forEach(System.out::println);
        //method reference is like a lambda (short lambda)
        words.sort(Comparator.comparingInt(String::length));
        //palavras, ordene comparando o length da string
        words.sort(comparing(String::length));

        new Thread(() -> System.out.println("Executing thread")).start();

        words.forEach(System.out::println);

    }
}
