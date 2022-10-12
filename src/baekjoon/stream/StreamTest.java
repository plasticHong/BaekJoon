package baekjoon.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {

//        List<String> companyList = new ArrayList<>();
//        companyList.add("LG");
//        companyList.add("Samsung");
//        companyList.add("Apple");
//

        List<String> companyList = Arrays.asList("LG","Samsung","Apple");

        for (String Company : companyList) {
            System.out.println(Company);
        }

        System.out.println("==============================");

        //Stream Class Lambda
        Stream<String> stream = companyList.stream();
        stream.forEach(company -> System.out.println(company));


    }
}
