/*==================================
+++++실행 흐름의 컨트롤(제어문)+++++
- switch문 실습
====================================
◎ Test041.java
==================================*/

// 1부터 3까지의 정수 중 하나를 사용자로부터 입력받아
// 입력받은 정수만큼 별문자(★)가 출력되는 프로그램을 작성한다.
// 단, 두 가지 방법으로 구현할 수 있도록 한다.

// ① switch 문의 일반 모델을 활용한다.
// ② switch 문의 기본 모델을 활용하되 『break』를 딱 한 번만 사용할 수 있도록 한다.

// 실행 예시
// 임의의 정수 입력(1~3): 3
// ★★★
// 계속하려면 아무 키나 누르십시오 . . .

// 임의의 정수 입력(1~3): 7
// 입력 오류
// 계속하려면 아무 키나 누르십시오 . . .


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test041 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("임의의 정수 입력(1~3): ");
		int a = Integer.parseInt(br.readLine());
		
		// 일반 모델
		switch(a)
		{
			case 1: System.out.println("일반 모델: ★"); break;
			case 2: System.out.println("일반 모델: ★★"); break;
			case 3:	System.out.println("일반 모델: ★★★"); break;
			default: System.out.println("일반 모델: 입력 오류"); break;
		}
		
		// 기본 모델
		String stars ="기본 모델: ";

		switch(a)
		{
			case 3: stars += "★";
			case 2:	stars += "★";
			case 1: stars += "★"; System.out.println(stars); break;
			default: System.out.println("기본 모델: 입력 오류");
		}
	}
}

/*
[강사님 풀이]
// 기본 모델
switch (n)
{
	default: System.out.print("입력 오류"); break;
	case 3: System.out.print("★");
	case 2: System.out.print("★");
	case 1: System.out.print("★");
}
System.out.println();
*/


/*
[실행 예시]
임의의 정수 입력(1~3): 1
일반 모델: ★
기본 모델: ★
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력(1~3): 3
일반 모델: ★★★
기본 모델: ★★★
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력(1~3): 7
일반 모델: 입력 오류
기본 모델: 입력 오류
계속하려면 아무 키나 누르십시오 . . .
*/