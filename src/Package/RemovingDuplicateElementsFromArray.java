package Package;

public class RemovingDuplicateElementsFromArray {

	public static void main(String[] args) {
		
		int arr[] = {0,1,2,3,2,3,};

		for(int i=0; i < arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}	
		}
	
	}

}
