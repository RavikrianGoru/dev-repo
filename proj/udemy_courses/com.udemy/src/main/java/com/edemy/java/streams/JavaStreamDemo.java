package com.edemy.java.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamDemo
{

    public static void main(String[] args) throws IOException
    {
        // 1
        int s = IntStream.range(1, 10).sum();
        System.out.println("Sum:" + s);

        // 2
        long c = IntStream.rangeClosed(1, 10).count();
        System.out.println("Count:" + c);

        // 3
        Stream.of("Hi", "Bye", "Hey").forEach(System.out::println);

        // 4
        Arrays.stream(new int[]
        { 1, 3, 5, 7, 9 }).distinct().forEach(System.out::println);

        // map()
        // filter()
        // sort()

        // File reading
        Stream<String> lines = Files.lines(Paths.get("test.txt"));
        lines.filter(x -> !x.isEmpty()).filter(x -> x.length() > 5).map(x -> x.toUpperCase()).sorted().forEach(System.out::println);
        lines.close();
    }

}
