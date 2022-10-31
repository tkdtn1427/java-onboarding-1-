package onboarding;

import java.util.*;

public class Problem7 {
    // 주어진 아이디A, B 의 친구관계를 친구 관계 목록 map 에 추가하는 함수
    public static void setUserFriendsMap(List<String> friend, Map<String, Info> map){
        String left = friend.get(0);
        String right = friend.get(1);

        if(!map.keySet().contains(left)){
            map.put(left, new Info(0,new ArrayList<>()));
        }
        if(!map.keySet().contains(right)){
            map.put(right, new Info(0,new ArrayList<>()));
        }

        map.get(left).knowing.add(right);
        map.get(right).knowing.add(left);
    }
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = Collections.emptyList();
        return answer;
    }
}
