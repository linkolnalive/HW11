package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Iterator;
import java.util.stream.StreamSupport;

public class StringsMgt {
    public static String oddNames(ArrayList<String> names) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < names.size(); i++) {
            if (i % 2 == 0) {
                res.append(i + 1).append(". ").append(names.get(i));
                if (i < (names.size() - 2)) {
                    res.append(", ");
                } else {
                    res.append(".");
                }
            }
        }
        return res.toString();
    }

    public static List <String> sortNames(ArrayList<String> names) {
        List<String> sortedNames = names.stream()
                .map(String::toUpperCase)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        return Collections.singletonList(String.join(", ", sortedNames));
    }
}

