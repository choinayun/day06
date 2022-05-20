package day06;

import java.util.Scanner;

public class Quize07 {
	
	public static void main(String[] args) {
		
		// 입력 받은 숫자 5개 중에서 6의 배수가 있는지 출력 
		
		int num[] = new int[5];
	
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하세요. ");
		
		for(int i=0; i < num.length; i++) {
			num[i] = input.nextInt();
			if(num[i] %6 == 0) 
				System.out.println("6의 배수 : " + num[i]);
			
		}
		
		
		
	}

}
