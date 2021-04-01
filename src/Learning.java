import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Learning {
	
	public static void main(String[] args) {
		String[] arr1 = {"aaa","bbb","ccc","aaa","aaa","ccc"};
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String a : arr1) {
			map.put(a, map.getOrDefault(a, 0) +1 );
			
		}
		System.out.println(map);
	}
	
}