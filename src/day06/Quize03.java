package day06;

public class Quize03 {

	public static void main(String[] args) {
		
		// �迭 ���� 
		
		int arr[] = new int[] {10,54,13,17,25,30};
		
		for(int i=0; i < arr.length; i++) {
			
			if(arr[i]%2 == 0) {
				System.out.println("¦�� : " + arr[i]);
			}else {
				System.out.println("Ȧ�� : " + arr[i]);
			}
		
		}
		
	}
	
}
