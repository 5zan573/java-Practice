package Package;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1 :");
		String c=sc.next();
		System.out.println("Enter String 2 :");
		String d=sc.next();
		sc.close();
		
		boolean ret = isAnagram(c,d);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams" );
	}

	static boolean isAnagram(String a, String b) {
	    a = a.toLowerCase();
	    b = b.toLowerCase();
	    
	    if (a.length() != b.length()){
	        return false;
	    }
	    
	    int count[]=new int[26];
	    
	    for (int i=0; i<a.length(); i++){
	        count[a.charAt(i) - 'a']++;
	        count[b.charAt(i) - 'a']--;
	    }
	    for (int i=0; i<26; i++){
	        if (count[i] !=0){
	            return false;
	        }
	    }
	    return true;
	    }
	
	public static boolean AnagramsArray(String c, String d) {
	
		char[] c1 = c.toLowerCase().toCharArray();
	    char[] c2 = d.toLowerCase().toCharArray();

	    Arrays.sort(c1);
	    Arrays.sort(c2);
	    
	    if(Arrays.equals(c1, c2)) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
		
		
	}
	
}
