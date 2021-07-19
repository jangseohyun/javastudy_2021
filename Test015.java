/*=====================================
++++++++++자바 기본 프로그래밍++++++++++
-자바의 기본 입출력: System.in.read()
=======================================
◎ Test015.java
=====================================*/

/*
※ 『System.in.read()』 메소드는 한 문자만 가져온다.
	단, 하나의 문자를 입력받아 입력받은 문자의
	ASCII Code 값을 반환하게 된다. (A=65, a=97)
*/

// 실행 예시
// 한 문자 입력: 6
// 한 자리 정수 입력: 7
// >> 입력한 문자: 6
// >> 입력한 정수: 7
// 계속하려면 아무 키나 누르십시오 . . .


import java.io.IOException;

public class Test015
{
	public static void main(String[] args) throws IOException	//--System.in.read()에서 생길 수 있는 오류는 main() 밖으로 던진다
	{
		System.out.print("한 문자 입력: ");
		int a = System.in.read();
		System.in.read();			//--엔터 키 ← (\r, Carriage Return, 13)
		System.in.read();			//--엔터 키에 포함된 개행 ↓ (\n, Line Feed, 10)
		System.out.print("한 자리 정수 입력: ");
		int b = System.in.read();

		System.out.println("\n>> 입력한 문자: "+(char)a);
		System.out.println(">> 입력한 정수: "+(char)b);
	}
}

/*
[강사님 풀이]
// 주요 변수 선언
char ch;		//--입력받은 문자를 담을 변수
int n;			//--입력받은 정수를 담을 변수

// 연산 및 처리
// ①-① 사용자에게 안내 메세지 출력
System.out.print("한 문자 입력: ");
// 한 문자 입력: 'G'+엔터(←+↓)

// ①-② 사용자가 입력값을 문자형으로 변환한 후 변수 ch에 담아내기
ch = (char)System.in.read();		//--예외가 나올 수 있기 때문에 java는 싫어한다

// ※ 입력 대기열에 남아있는 『\r』과 『\n』을 스킵(건너뛰기, 버리기)
System.in.skip(2);		//--두 글자를 읽지 않고 건너뛴다(버린다)

// ②-① 사용자에게 안내 메세지 출력
System.out.print("한 자리 정수 입력: ");

// ②-② 사용자 입력값을 변수 n에 담아내기
n = System.in.read();
n -= 48;				//--n을 48만큼 감소시키면 원래 값이 됨

// 결과 출력
System.out.println();
System.out.println(">> 입력한 문자: "+ch);
System.out.println(">> 입력한 정수: "+n);
*/


/*
[실행 결과]
한 문자 입력: T
한 자리 정수 입력: 8

>> 입력한 문자: T
>> 입력한 정수: 8
계속하려면 아무 키나 누르십시오 . . .
*/