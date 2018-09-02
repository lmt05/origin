import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(12);
        list.add(22);
        list.add(32);
        list.add(42);
        list.add(52);
/*        list.stream().filter(Integer->Integer>20).forEach(Integer->{
            System.out.println(Integer);
        });*/
        //list.forEach(System.out::println);

/*
        List<String> names = Arrays.asList("Jsli","Jsfjend","sfejljs","J,,e");
        Predicate<String> startsWithJ = (n) -> n.startsWith("J");
        Predicate<String> fourLetterLong = (n) -> n.length() == 4;

        names.stream()
                .filter(startsWithJ.and(fourLetterLong))
                .forEach((n) -> System.out.print("\nName, which starts with'J' and four letter long is : " + n));
*/

       String str = "aaasssdddffttry";
        String[] split = str.split("");
        List<String> strings = Arrays.asList(split);
        Map<String, Integer> collect = strings.stream().collect(Collectors.groupingBy(p->p, Collectors.summingInt(p -> 1)));
        System.out.println(collect);


        Stream.generate(Math::random).limit(10).forEach(System.out::println);

        Thread thread = new Thread(()->{
            System.out.println("多线线程");});
        thread.start();


    }
}
