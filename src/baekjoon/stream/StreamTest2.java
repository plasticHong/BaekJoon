package baekjoon.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest2 {
    public static void main(String[] args) {

        List<Student> list = Arrays.asList(
                new Student("wee", 20),
                new Student("wee2", 60),
                new Student("wee3", 60)
        );

        Stream<Student> stream = list.stream();
        stream.forEach(Student -> {
            String name = Student.getName();
            int score = Student.getScore();
            System.out.println(name + "," + score);
        });

        stream = list.stream();

        stream.map(std -> std.getName())
                .forEach(s -> System.out.println(s));

System.out.println("========================");
        list.stream().filter(std -> std.getScore()>50)
                .map(std -> std.getName()).forEach(s ->System.out.println(s));

    }


}
