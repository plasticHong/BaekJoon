package wooteco_pre;

import java.util.*;

public class P6 {
    public static void main(String[] args) {
        List<List<String>> forms = List.of(
                List.of("jm@email.com", "제이엠"),
                List.of("jason@email.com", "제이슨"),
                List.of("woniee@email.com", "워니"),
                List.of("mj@email.com", "엠제이"),
                List.of("nowm@email.com", "이제엠")
        );

        Map<String,String> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        for (int i = 0; i <forms.size() ; i++) {
            List<String> member = forms.get(i);

            String email = member.get(0);
            String nickName = member.get(1);

            for (int j = 0; j <nickName.length()-1 ; j++) {
                String minPart = nickName.charAt(j)+""+nickName.charAt(j+1);

                if(map.containsKey(minPart)){
                    set.add(email);
                    set.add(map.get(minPart));
                }else {
                    map.put(minPart,email);
                }

            }

        }

        List<String> answer = new ArrayList<>(set);
        Collections.sort(answer);
        for (String s:answer
        ) {
            System.out.print(s+", ");
        }
        System.out.println(map.size());
        System.out.println(set.size());

    }
}
