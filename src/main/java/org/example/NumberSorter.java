package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

class NumberSorter {
    public static String sortNumbers(String[] array) {
        String joinedString = String.join(",", array);
        String[] splitArray = joinedString.split(",");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String num : splitArray) {
            numbers.add(Integer.parseInt(num.trim()));
        }
        Integer[] sortedNumbers = numbers.toArray(new Integer[0]);
        Arrays.sort(sortedNumbers);
        return Arrays.stream(sortedNumbers)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}
