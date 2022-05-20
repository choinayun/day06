package day06;

public class Quize06 {

	public static void main(String[] args) {
		
		int num[] = {5,243,2708,7806,17501,45412,86500};
		
		for(int i=0; i<num.length; i++) {
			if(num[i]%3 == 0) {
				System.out.println("3의 배수 : " + num[i]);
			}else if(num[i]%11 == 0) 
				System.out.println("11의 배수 : " + num[i]);
			
		}
		
		
	}
	
}
