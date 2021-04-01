import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Solution3 {
	
	public String solution(String[] participant, String[] completion) {
		public String solution(String[] participant, String[] completion) {

	        Map<String, Long> participantMap = Arrays.asList(participant).stream()
	                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	        for(String name : completion) {

	            Long value = participantMap.get(name) - 1L;

	            if(value == 0L) {
	                participantMap.remove(name);
	            } else {
	                participantMap.put(name, value);
	            }
	        }

	        return participantMap.keySet().iterator().next();
	    }
}