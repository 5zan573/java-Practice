package Package;

import java.util.ArrayList;
import java.util.List;

public class FindtheCapitals {

	public static void main(String[] args) {
		
		capitals("coDEWars");
	}
	
	public static void capitals(String s) {
		List arr=new ArrayList();
		
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				arr.add(ch);
			}
		}
		System.out.println(arr);
	}
	
}
