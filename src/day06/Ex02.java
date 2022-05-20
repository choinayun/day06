package day06;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		// 배열
		
		// 같은 자료형으로 연속된 공간을 만드는 것
		// 배열에 접근시 index 를 사용하여 접근한다
		// index(첨자)는 0부터 시작한다
		// 자료형[] 배열명 또는 자료형 배열명[] 생성한다
		
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
		
		
		// 배열을 만듦과 동시에 초기화
		//int [] str = new int[] {10,20,30,40}; // 방법1
		int [] str = {10,20,30,40}; // 방법2 
		for(int s : str) {
			System.out.println(s);
		}
		
		
		// String 으로 배열 만들기
		String[] names = new String[3];
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<names.length; i++) {
			System.out.println(i + ". 이름 입력");
			names[i] = input.next();
			// System.out.println(names[i]);
		}
		for(String n : names) {
			System.out.println("이름 : " + n);
		}
		
		
	}

}
















