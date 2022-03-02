package sort.n1;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {

		int[] array = new int[] {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] result = solution(array, commands);
		System.out.println(result);
	}
	
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i<commands.length; i++) {
        	int a = commands[i][0];
        	int b = commands[i][1];
        	int c = commands[i][2];
        	
        	int[] newArray = new int[b-a+1];
        	int z = 0;
        	for(int j = a; j<=b; j++) {
        		newArray[z++] = array[j-1];
        	}
        	Arrays.sort(newArray);
        	answer[i] = newArray[c-1];
        }
        
        return answer;
    }
	
}
