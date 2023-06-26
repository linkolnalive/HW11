package org.example;

import java.util.stream.Stream;

class RandomNumberGenerator {
    public static Stream<Long> generateRandomNumbers(long a, long c, long m, long seed) {
        return Stream.iterate(seed, n -> (a * n + c) % m);
    }
}
