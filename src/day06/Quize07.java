package day06;

import java.util.Scanner;

public class Quize07 {
	
	public static void main(String[] args) {
		
		// �Է� ���� ���� 5�� �߿��� 6�� ����� �ִ��� ��� 
		
		int num[] = new int[5];
	
		Scanner input = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���. ");
		
		for(int i=0; i < num.length; i++) {
			num[i] = input.nextInt();
			if(num[i] %6 == 0) 
				System.out.println("6�� ��� : " + num[i]);
			
		}
		
		
		
	}

}
