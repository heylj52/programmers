package muzelive_codingTest;

import java.util.Arrays;

public class Solution2 {
	
	public static void main(String[] args) {
		solution(40);
		//solution(5);
	}

	public static String solution(int n) {
        String answer = "";
        
        String[] graph = new String[41];
        graph[1] = "1";
        for(int i=2; i<=n; i++) {
        	String str = graph[i-1];
        	
        	StringBuilder sb = new StringBuilder();
        	int cnt = 1;
        	for(int j=0; j<str.length(); j++) {
        		if(j!=0) {
        			if(str.charAt(j)==str.charAt(j-1)) {
        				cnt++;
        			}else {
        				sb.append(cnt);
        				sb.append(str.charAt(j));
        				cnt=1;
        			}
        		}else {
        			sb.append(str.charAt(j));
        		}
        	}
        	sb.append(cnt);
        	graph[i] = sb.toString();
        }
        System.out.println(Arrays.toString(graph));
        answer = graph[n]+"";
        
        return answer;
    }
	
}
