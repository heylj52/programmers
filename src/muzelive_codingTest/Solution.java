package muzelive_codingTest;

import java.util.ArrayList;

public class Solution {
	
	public static void main(String[] args) {
		int[][] p = {{1000,1},{1,3},{3,1},{3,5},{2,5},{5,3}};
		solution(p);
	}
	
    public static int solution(int [][] p)
    {
        int answer = 0;

        int n = p.length;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=1000; i++) {
        	graph.add(new ArrayList<Integer>());
        }
        for(int i=0; i<n; i++) {
        	graph.get(p[i][0]).add(p[i][1]);
        }
        for(int i=0; i<n; i++) {
        	int a = p[i][0];
        	int b = p[i][1];
        	if(graph.get(b).contains(a)) answer++;
        }
        answer /=2;
        System.out.println(answer);
        
        return answer;
    }
}
