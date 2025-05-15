package Package;

public class GradeBook {

	public static void main(String[] args) {
	
		char result = grades(90,80,100);
		System.out.println(result);
	}
	
	public static char grades(int s1, int s2, int s3) {
		int mean = (s1+s2+s3) /3;
		
		if(mean >=90) return 'A';
		if(mean >=80) return 'B';
		if(mean >=70) return 'C';
		if(mean >=60) return 'D';
		return 'F';
	}

}
