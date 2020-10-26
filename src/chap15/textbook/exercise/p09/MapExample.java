package chap15.textbook.exercise.p09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue",96);
		map.put("hong",86);
		map.put("white",92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		
//		Set<String> scores = map.keySet();
//		for(String score : scores) {
//			totalScore += map.get(score);
//			if(maxScore< map.get(score)) {
//		    	maxScore = map.get(score);
//		    	name = score;
//		    }
//		}
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String id = entry.getKey();
			int score = entry.getValue();
			
			totalScore += score;
			
			if (score > maxScore) {
				maxScore = score;
				name = id;
			}
		}
		System.out.println("평균 점수:"+totalScore/map.size());
		System.out.println("최고 점수:" + maxScore);
		System.out.println("최고점수를 받은 아이디:" + name);
		
	} 
		
}
