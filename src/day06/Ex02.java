package day06;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		// �迭
		
		// ���� �ڷ������� ���ӵ� ������ ����� ��
		// �迭�� ���ٽ� index �� ����Ͽ� �����Ѵ�
		// index(÷��)�� 0���� �����Ѵ�
		// �ڷ���[] �迭�� �Ǵ� �ڷ��� �迭��[] �����Ѵ�
		
		int[] arr = new int[5];
		/*
		 int num=1;
		
		 arr[num] = 500;
		 */
		int a;
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		
		System.out.println(arr.length);
		for(a=0; a<arr.length; a++) {
			System.out.println("arr["+ a +"] : " + arr[a]);
		}
		/*
		System.out.println("arr[0] : " + arr[0]);
		System.out.println("arr[1] : " + arr[1]);
		System.out.println("arr[2] : " + arr[2]);
		System.out.println("arr[3] : " + arr[3]);
		System.out.println("arr[4] : " + arr[4]);
		*/
		
		
		// �迭�� ����� ���ÿ� �ʱ�ȭ
		//int [] str = new int[] {10,20,30,40}; // ���1
		int [] str = {10,20,30,40}; // ���2 
		for(int s : str) {
			System.out.println(s);
		}
		
		
		// String ���� �迭 �����
		String[] names = new String[3];
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<names.length; i++) {
			System.out.println(i + ". �̸� �Է�");
			names[i] = input.next();
			// System.out.println(names[i]);
		}
		for(String n : names) {
			System.out.println("�̸� : " + n);
		}
		
		
	}

}
















