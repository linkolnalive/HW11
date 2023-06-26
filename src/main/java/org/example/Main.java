package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("js");
        arrayList.add("rt");
        arrayList.add("ef");
        arrayList.add("as");
        arrayList.add("gr");
        arrayList.add("ur");

        System.out.println(StringsMgt.oddNames(arrayList));
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Dqw", "efwe", "oqweb", "qwe"));
        List<String> sortedNames = StringsMgt.sortNames(names);
        System.out.println("Sorted: " + sortedNames);

        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);
        long seed = 12345L;

        Stream<Long> randomNumbers = RandomNumberGenerator.generateRandomNumbers(a, c, m, seed);
        randomNumbers.limit(10).forEach(System.out::println);
        String[] numbersArray = {"5, 3, 9", "3", "9", "11", "7, 11"};
        String sortedNumbers = NumberSorter.sortNumbers(numbersArray);
        System.out.println(sortedNumbers);

        Stream<Integer> first = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> second = Stream.of(6, 7, 8, 9, 10, 11, 12);
        Stream<Integer> zippedStream = StreamZipper.zip(first, second);
        zippedStream.forEach(System.out::println);
    }
}
