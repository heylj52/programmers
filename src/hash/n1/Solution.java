package hash.n1;

import java.util.HashMap;

public class Solution {	
	
	public static void main(String[] args) {
		String[] participant =  {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		System.out.println(solution(participant, completion));
	}

	public static String solution(String[] participant, String[] completion) {
		String result = "";
		HashMap<String, Integer> map = new HashMap<>();
		for(String p : participant) {
			if(map.containsKey(p)) {
				int n = map.get(p);
				map.replace(p, ++n);
			}else {
				map.put(p, 1);
			}
		}
		for(String c : completion) {
			if(map.containsKey(c)) {
				int n = map.get(c);
				map.replace(c, --n);
			}
		}
		for(String key : map.keySet()) {
			if(map.get(key)==1) {
				return key;
				
			}
		}
		
		return result;
	}
	
}