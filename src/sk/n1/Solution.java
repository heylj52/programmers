package sk.n1;

import java.util.Arrays;

public class Solution {
	
	public static void main(String[] args) {
		int money = 4578;
		int[] costs = {1, 4, 99, 35, 50, 1000};
		System.out.println(solution(money, costs));
	}

	public static int solution(int money, int[] costs) {
        int answer = 0;
        
        int[] kinds = {1,5,10,50,100,500};
        
        int[] cost500 = new int[costs.length];
        for(int i=0; i<costs.length; i++) {
        	cost500[i] = costs[i] * (500/kinds[i]);
        }
        System.out.println(Arrays.toString(cost500));
        
        for(int i=1; i<costs.length; i++) {
        	for(int j=0; j<costs.length-i; j++) {
        		int tmp = 0;
        		int tmp2 = 0;
        		int tmp3 = 0;
        		if(cost500[j] > cost500[j+1]) {
        			tmp = kinds[j+1];
        			kinds[j+1] = kinds[j];
        			kinds[j] = tmp;
        			
        			tmp2 = cost500[j+1];
        			cost500[j+1] = cost500[j];
        			cost500[j] = tmp2;
        			
        			tmp3 = costs[j+1];
        			costs[j+1] = costs[j];
        			costs[j] = tmp3;
        		}
        	}
        }
        System.out.println(Arrays.toString(kinds));
        
        int[] cnts = new int[kinds.length];
        for(int i=0; i<kinds.length; i++) {
        	cnts[i] = money/kinds[i];
        	money = money % kinds[i];
        }
        System.out.println(Arrays.toString(cnts));
        for(int i=0; i<costs.length; i++) {
        	answer += costs[i] * cnts[i];
        }
        
        return answer;
    }
	
}
