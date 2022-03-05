package sort.n2;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

	public static void main(String[] args) {
		int[] numbers = {3, 30, 34, 5, 9};
		System.out.println(solution(numbers));
	}
	
	public static String solution(int[] numbers) {
        String answer = "";
        
        String[] strNumbers = new String[numbers.length];
        for(int i = 0; i<numbers.length; i++) {
    	    strNumbers[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strNumbers, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return (o2+o1).compareTo(o1+o2);
			}
        	
		});
        
        for(String s : strNumbers) {
        	answer += s;
        }
        
        return answer.charAt(0) == '0'?"0":answer;
    }
}
