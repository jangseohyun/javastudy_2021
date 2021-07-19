/*=====================================
++++++++++자바 기본 프로그래밍++++++++++
-자바의 기본 입출력: java.util.Scanner
=======================================
◎ Test017.java
=====================================*/

// ※ 『java.util.Scanner』
//     단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며
//     디폴트(default)로 사용되는 단락 문자는 공백이다.
//     작성된 다음 토큰은 『next()』 메소드를 사용,
//     다른 형태의 값으로 변환할 수 있다.


import java.util.Scanner;


public class Test017
{
	public static void main(String[] args)
	{
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// 주요 변수 선언
		String name;
		int kor, eng, mat;

		// 연산 및 처리
		System.out.print("이름을 입력하세요: ");
		name = sc.next();		//--br.readLine()과 유사한 메소드

		System.out.print("국어 점수 입력: ");
		kor = sc.nextInt();		//--Integer.parseInt(br.readLine())
		System.out.print("영어 점수 입력: ");
		eng = sc.nextInt();
		System.out.print("수학 점수 입력: ");
		mat = sc.nextInt();

		// 결과 출력
		System.out.println("\n이름: "+name);
		System.out.printf("총점: %d\n", (kor+eng+mat));
	}
}


/*
[실행 결과]
이름을 입력하세요: 장서현
국어 점수 입력: 90
영어 점수 입력: 80
수학 점수 입력: 70

이름: 장서현
총점: 240
계속하려면 아무 키나 누르십시오 . . .
*/