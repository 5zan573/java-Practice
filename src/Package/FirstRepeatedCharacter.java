package Package;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharacter {

	public static void main(String[] args) {
		
		String s = "missisipi";
		
		Set<Character> set=new HashSet();
		
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			if(set.contains(ch)) {
				System.out.println(ch);
				return;
			}
			else {
				set.add(ch);
			}
		}

	}

}
