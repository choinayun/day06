package day06;

public class Quize05 {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int a=0; a<=100; a++) {
			if(a%3 == 1) {
				sum+=a;
			}
		}
		System.out.println("гу : " + sum);
	}
	
}
