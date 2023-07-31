package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class PracticeService {
	
	public void practice1() {
		
		int[] arr = new int[9];
		
		int sumEven = 0;
		
		for(int i=0; i<9; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
			
			if(i%2 == 0) {
				sumEven = sumEven + arr[i] ;
			}
		} 
		
		System.out.println("\n짝수 번째 인덱스 합 : " + sumEven);
		
	}
	
	
	
	
	
	
	
	
	public void practice2() {	
		
		int[] arr = new int[9];
		
		int sumOdd = 0;
		
		for(int i=0; i<9; i++) {
			
			arr[i] = 9-i;
			
			System.out.print(9-i + " ");
					
			if( i%2 == 1 ) { 
				sumOdd = sumOdd + (9-i);				
			}
			
		}
		
		System.out.println("\n홀수 번째 인덱스 합 : " + sumOdd);
		
	}		
	
	
	
	
	
	
	
	
	public void practice3() {	
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i=0; i<input; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
			
		}
			
		
	}
	
	
	
	
	
	

	
	public void practice4() {	
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for (int i=0; i<5; i++) {
			
			System.out.print("입력 " + i + " : ");
			int input = sc.nextInt();
			arr[i] = input;
		}
		
		System.out.print("검색할 값 : ");
		int input2 = sc.nextInt();
		
		for (int i=0; i<5; i++) {
			if (input2 == arr[i]) {
				System.out.print("인덱스 : " + i);
			}
			
			
		}
				
		
	}	
	
	
	
	
	
	
	
	
	public void practice5() {	

		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		char[] arr = new char[input.length()];
		
		int count = 0;
		
		System.out.print("문자 : ");
		char input2 = sc.next().charAt(0);

		System.out.print("application에 i가 존재하는 위치(인덱스) : ");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = input.charAt(i);
			
			if(input2 == arr[i]) {
				System.out.print(i + " ");
				count++;
			}
						
		}
		
		System.out.print("\n" + input2 + "개수 : " + count);
		
		
	}
	
	
	
	
	
	
	
	
	public void practice6() {	

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		int sum = 0;
		
		for (int i = 0; i<input; i++) {
			System.out.print("배열 " + i +"번째 인덱스에 넣을 값 : ");
			int input2 = sc.nextInt();
			arr[i] = input2;
			sum = sum + input2;
		}
		
		for (int j = 0; j<input; j++ ) {
			System.out.print(arr[j] + " ");
		}
		
		System.out.println("\n총 합 : " + sum);
		
	}	
	
	
	
	
	
	
	
	
	
//	public void practice7() {	
//
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("주민등록번호(-포함) : ");
//		String input = sc.nextLine();
//		
//		char[] arr = new char[input.length()];
//		
//		for (int i = 0; i<arr.length; i++) {
//			arr[i] = input.charAt(i);
//			
//			if ( 0<=i || i<=7 ) {
//				System.out.print(arr[i]);				
//			}
//			
//			if ( 8 <= i || i <=13 ) {
//				System.out.print("*");
//				//으악 막힘 내일풀자 ㅠㅠ
//			}
//		}
//		
//	}
//	
//	
//	아래는 2차시도
	public void practice7() {	

		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.nextLine();
		
		char[] arr = new char[input.length()];
		for (int i = 0; i<input.length(); i++) {
			arr[i] = input.charAt(i);
			if (i>7) { 
				arr[i] = '*';
			}
			
			System.out.print(arr[i]);			
		}
		
	}
	
	
	
	
	
	
	
	
	
	public void practice8() {	

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		if ( input%2==0 || input<3 ) {
			System.out.println("다시 입력하세요");
		} else {
			
			// 3이상의 홀수 정수 n을 입력했을때 1, 2, ... 
			// 피크점은 정수 5일때 3, 7일때 4, 8일때 5이다.
			// peak(n) = n/2 + 1 이다.
			// 또한 수열의 갯수는 입력한 정수값이므로
			
			int[] arr = new int[input];
			
										
			for(int i = 0; i<input; i++) {
				
				if( i <= (input/2)-1 ) {
					arr[i] = i+1;
					
				} else { // 1, 2, 3, 4,// 3, 2, 1       
					arr[i] = input-i;
					
				} //내부if-else1
				
				//출력 마지막 출력값은 " ,"를 붙이지 않는다.
				
				if (i<input-1) {
					System.out.print(arr[i] + ", ");
				} else {
					System.out.print(arr[i]);
					
				} //내부if-else2
			}
				
		} //외부if-else
	
	} //public void	
	
	
	
	
	
		
	
	
	
	public void practice9() {	
		
		int[] arr = new int[10];
		
		System.out.print("발생한 난수 : ");
		
		for (int i=0; i<10; i++) {
		
			arr[i] = (int) (Math.random() * 10 + 1);
			
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	
	
	
	
	
	
	
	public void practice10() {	
		
		int[] arr = new int[10];
		
		System.out.print("발생한 난수 : ");
		
		for(int i = 0; i<10; i++) {
			
			arr[i] = (int)(Math.random() * 10 + 1 );
			
			System.out.print(arr[i] + " ");
		}
		
		
		int max = arr[0];
		int min = arr[0];
				
		for(int j = 0; j<10; j++) {
			
			if(arr[j]>=max) {
				max = arr[j];
			}
			
			if(arr[j]<=min) {
				min = arr[j];
			}
		}
		
		System.out.println("\n최대값 : "+ max);
		System.out.println("최소값 : " + min);		
		
	}
	
	
	
	
	
	
	
	
	
	public void practice11() {	
		
		int[] arr = new int[10];
		

		for(int i = 0; i<10; i++) {
			
			int random = (int)( (Math.random() * 10) + 1 );
			
			arr[i]=random;			
			
			for(int j = 0; j<i; j++) {
				
				if (random == arr[j]) {
					
					i--;
					
					break;
					
				} 
			
			}

		}
		
		for(int k = 0; k<10; k++) {
			System.out.print(arr[k] + " ");
		}
		
	} //public void	
		
		
	
	
		
		
		
		
		
	public void practice12() {	
			
		//1. 로또 번호 6개 값을 가질 배열 만들기
		int[] lotto = new int[6];
		
		//2. 45개의 난수 생성 -> 3번 내부에 넣기
//		int random = (int)( Math.random() * 45 + 1);
		
		//3. 45개의 난수 중 6개를 뽑아서 배열값 6개에 대입하기
		for(int i = 0; i<lotto.length; i++) {
			
			int random = (int)( Math.random() * 45 + 1);
			lotto[i] = random;
			
			//4. 로또는 중복된 값이 없으므로 중복값 제거하기
			
			for(int j=0; j<i; j++) {
				
				if( lotto[j] == random ) {
					
					i--;
				}
				
			}
			
		}
		
		// 5. 오름차순 정렬하기 
		// Arrays.sort(배열명); 하면 배열 내에서 오름차순 된다.
		
		Arrays.sort(lotto);
		
		
		// 6. 결과 출력하기
		
		for(int k = 0; k<lotto.length; k++) {
			System.out.print(lotto[k] + " ");
		}
		
		
	
	} //public void
	
	
	
	
	
	
	
	
	
	
	
//	public void practice13() {	
//	
//		// 1. input값 출력
//		Scanner sc = new Scanner(System.in);	
//		System.out.print("문자열 : ");
//		String input = sc.nextLine();
//		
//		// 2. 각 문자를 배열화 및 
//		// 3. for문 이용하여 배열에 각문자열 대입
//		
//		System.out.print("문자열에 있는 문자 : ");
//		
//		char[] arr = new char[input.length()];
//		
//		for(int i = 0; i<input.length(); i++) {
//			
//			arr[i] = input.charAt(i);
//		}
//		
//		// 4. 중복된 문자는 빼기 
//		// : 문자열에 있는 문자 출력값에서도 빼고 & 카운트에서도 빼고
//
//		char[] arr2 = new char[input.length()];
//		
//		for(int j = 0; j<input.length(); j++) {
//			
////			모르겠다
////			모르겠다
////			모르겠다
////			모르겠다
////			모르겠다
////			모르겠다
//			
//		}
//		
//		
//	
//	} //public void
	
	
	
	
	
	
	
	
	
	
	public void practice14() {		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int input1 = sc.nextInt();
		
		String[] arr = new String[input1];
		
		for(int i=0; i<input1; i++) {
			System.out.print( (i+1) + "번째 문자열 : ");
			String input2 = sc.nextLine();
			
		}
		
		
	}








	private int input2() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
	
	
} //public class
