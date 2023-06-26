package org.example;

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

class StreamZipper {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();

        Iterable<T> iterable = () -> new Iterator<T>() {
            boolean hasFirst = iterator1.hasNext();
            boolean hasSecond = iterator2.hasNext();
            boolean lastTakenFromFirst = false;

            @Override
            public boolean hasNext() {
                return hasFirst && hasSecond;
            }

            @Override
            public T next() {
                T next;
                if (!lastTakenFromFirst) {
                    next = iterator1.next();
                    hasSecond = iterator2.hasNext();
                    lastTakenFromFirst = true;
                } else {
                    next = iterator2.next();
                    hasFirst = iterator1.hasNext();
                    lastTakenFromFirst = false;
                }
                return next;
            }
        };

        return StreamSupport.stream(iterable.spliterator(), false);
    }
}
