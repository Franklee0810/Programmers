package Test1;

public class CodingExam02 {

    	public boolean solution(int x) { 
    		
    		boolean answer = false; 
    		String x_str = String.valueOf(x); 
    		int sum = 0; 
    		
    		for( int i = 0; i < x_str.length(); i++ ) { 
    			sum += Integer.parseInt(String.valueOf(x_str.charAt(i))); 
    			
    		} 
    		
    		if( x % sum == 0 ) { 
    			answer = true; 
    			
    		} 
    		
    		return answer; }

}
	

