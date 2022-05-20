package day06;

public class Quize03 {

	public static void main(String[] args) {
		
		// ¹è¿­ ¹®Á¦ 
		
		int arr[] = new int[] {10,54,13,17,25,30};
		
		for(int i=0; i < arr.length; i++) {
			
			if(arr[i]%2 == 0) {
				System.out.println("Â¦¼ö : " + arr[i]);
			}else {
				System.out.println("È¦¼ö : " + arr[i]);
			}
		
		}
		
	}
	
}
