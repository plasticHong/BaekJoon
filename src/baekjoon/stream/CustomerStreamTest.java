package baekjoon.stream;

import java.util.ArrayList;
import java.util.List;

public class CustomerStreamTest {
    public static void main(String[] args) {

        List<Customer> list = new ArrayList<>();

        Customer wee = new Customer("wee",28,100);
        Customer lim = new Customer("lim",22,100);
        Customer hong = new Customer("hong", 15, 50);

        list.add(wee);
        list.add(lim);
        list.add(hong);

        System.out.println("추가된 순서대로 출력");
        list.stream().map(cust -> cust.getName())
                .forEach(ele ->System.out.println(ele));

        int total = list.stream().mapToInt(cust->cust.getPrice()).sum();
        System.out.println("총 여행비용은"+total+"원 입니다");

        System.out.println("20세 이상 고객명단 정렬하여 출력");
        list.stream().filter(cust -> cust.getAge()>20)
                .map(cust->cust.getName())
                .sorted().forEach(ele ->System.out.println(ele));

    }
}
