import java.util.HashMap;
import java.util.Random;

public class Solution {
	
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) {
        	hm.put(player, hm.getOrDefault(player, 0) + 1);
        }
        
        //즉 for문으로 participant의 길이만큼 
        //participant 배열을 String player로 쪼개고, 
        //HashMap에 키와 값을 넣는다.
        // 이때 participant배열의 String 을 키로 넣고, 값을 getOrDefault로 키가 존재한다면 1,없다면 0 으로 넣는다)
        //즉, 중복 참여자가 있다면 +1로 한다는 것이다. 중복값이 없다면 0 이겠지?? 
        
        
        
        for (String player : completion) {
        	hm.put(player, hm.get(player) - 1);
        }
        
        //완주한 사람들이다. 
        //hm.get(player)은 값인데 participant에서 player을 put할떄마다 중복 키값이 없다면 0 이므로,  
        //여기 코드에서는 -1이 대부분일거고, 만약 0이거나 그 이상일 경우는 중복 키 값이 존재한다는 말. 
        //

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}