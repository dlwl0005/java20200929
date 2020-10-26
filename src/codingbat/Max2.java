package codingbat;

import java.util.HashMap;
import java.util.Map;

public class Max2 {
	public Map<String, Integer> wordCount(String[] strings) {
		  Map<String, Integer> map = new HashMap<>();
		  for(String s : strings){
		    if(map.containsKey(s)){
		    int c = map.get(s);
		    map.put(s, c+1);
		    }else{
		    map.put(s,1);
		    }
		  }
		 return map;
		}

}
