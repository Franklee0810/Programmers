import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Solution2 {
	
	public String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for ( i=0; i<completion.length; i++){

            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];
    }
	
	// 이 방법은 일단 정렬을 무조건 반드시 해야 된다는 것임.
	// 그래야 대조가 가능하니...
	// 코드상 어려운건 없네 .
}