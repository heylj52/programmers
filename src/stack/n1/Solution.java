package stack.n1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public static void main(String[] args) {
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		System.out.println(Arrays.toString(solution(progresses, speeds)));
	}
	
	public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Queue<Integer> result = new LinkedList<Integer>();
        for(int i=0; i<progresses.length; i++) {
        	queue.add((int) Math.ceil((double)(100 - progresses[i]) / speeds[i])); 
        }
        
        int n = 1;
        int poll = queue.poll();
        while(!queue.isEmpty()) {
        	if(poll < queue.peek()) {
        		result.add(n);
        		poll = queue.poll();
        		n = 1;
        	}else if(poll >= queue.peek()) {
        		queue.poll();
        		n++;
        	}
        }
        result.add(n);
        
        int[] answer = new int[result.size()];
        for(int i=0; i<answer.length; i++) {
        	answer[i] = result.poll();
        }
        
        return answer;
    }
}
