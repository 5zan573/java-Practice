package Package;

import java.util.HashMap;
import java.util.Map;

public class test {

	public static void main(String[] args) {
		
		String s = "Hello";
		
		Map<Character, Integer>map=new HashMap<Character, Integer>();
		
		for(int i=0; i<s.length(); i++) {
			char ch=s.toLowerCase().charAt(i);
		if(Character.isLetter(ch)) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		}
		
		int maxfreq = 0;
		char result = 'z'+1;
		
		for(Map.Entry <Character, Integer> entry : map.entrySet()){
			char key =  entry.getKey();
			int freq = entry.getValue(); 
		if(freq > maxfreq || (freq == maxfreq && key < result)) {
			maxfreq=freq;
			result=key;
		}
		}
		System.out.println("Most frequent char: " + result);
		}
	}


