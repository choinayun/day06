package day06;

public class Quize02 {
	
	public static void main(String[] args) {
		
		int su1, su2;
		
		/*
		for(su1=1; su1<=5; su1++) {
			
			for(su2=1; su2<=5; su2++) {
				System.out.print(su1*su2 + "\t");
			}
			System.out.println();
		}
		*/
		
		
		// if문 사용하지않고 만들기
		
		for(su1=0; su1<5; su1++) {
			
			for(su2=1; su2<6; su2++) {
				System.out.print(su2 + (5*su1) + "\t");
			}
			System.out.println();
		}
		
	}

}
