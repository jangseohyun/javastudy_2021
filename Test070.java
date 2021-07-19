/*===========================
+++++클래스와 인스턴스+++++
=============================
◎ Test070.java
===========================*/

// 직사각형 클래스 설계 → Rect

/*
○ 내용(비즈니스로직, 업무로직): 직사각형의 넓이와 둘레를 계산, 클래스로 표현
○ 클래스의 정체성: 직사각형
○ 클래스의 속성: 가로, 세로 (+ 넓이, 둘레, 무게, 색상, 재질, ...)
○ 클래스의 기능: 넓이 계산, 둘레 계산, 가로/세로 입력, 결과 출력
   입력 예시) 가로 입력:     \n 세로 입력:      
   결과 예시) 가로: xxx \n 세로: xxx \n 넓이: xxxx \n 둘레: xxxx
*/

/*
※ 객체 구성  : 데이터(속성, 상태) + 기능(행위, 동작)
      |                  |                  | 
	  | (설계도 작성)    |                  |
	  |                  |                  |
   클래스 설계:        변수        +      메소드 
*/


import java.util.Scanner;


public class Test070
{
	public static void main(String[] args)
	{
		class Rectangle
		{
			public int width, height, area, around;

			void input()
			{
				Scanner sc = new Scanner(System.in);
				System.out.print("가로 입력: ");
				width = sc.nextInt();
				System.out.print("세로 입력: ");
				height = sc.nextInt();
			}

			void calArea()
			{
				area = width * height;
			}

			void calAround()
			{
				around = width*2 + height*2;
			}

			void result()
			{
				System.out.println();
				System.out.println("가로: "+width);
				System.out.println("세로: "+height);
				System.out.println("넓이: "+area);
				System.out.println("둘레: "+around);
			}
		}

		Rectangle rect = new Rectangle();
		rect.input();
		rect.calArea();
		rect.calAround();
		rect.result();
	}
}


/*
[강사님 풀이]
import java.util.Scanner;

class Rect	//--직사각형 클래스 설계(명명규칙 참조)
{
	// ○ 변수 선언
	// 전역 변수: 클래스 영역 안에서 글로벌 활동이 가능한 변수
	// 멤버 변수: 클래스에 소속되어 있는 요소로서의 의미
	// ★ 인스턴스 변수: ① 인스턴스가 생성되었을 때 비로소 메모리 할당이 이루어지는 변수
	//                   ② 생성된 인스턴스를 통해 접근 가능한 변수
	int w, h;

	// ○ 메소드 정의(가로/세로 입력)
	//    -메소드 이름 명명(명명 규칙 참조)
	//    -매개변수 구성
	//    -반환 자료형 구성
	//    -메소드 내부 정의

	// ※ 『void』는 메소드 실행 후 메소드를 호출한 곳에
	//    결과를 돌려줄 필요가 없을 때 지정하여 사용하게 되는데
	//    아무것도 돌려주지(반환하지) 않는다고 해서
	//    반환 자료형을 명시하지 않게 되면 문법적인 에러가 발생하게 된다.

	void input()
	{
		// 필요한 메소드 안에서 처리하는 것이 바람직함(불필요한 메모리 사용X)
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 입력: ");
		w = sc.nextInt();
		System.out.print("세로 입력: ");
		h = sc.nextInt();
	}

	// ○ 메소드 정의(둘레 계산)
	//    메소드의 실행 후 결과가 정수인 경우를 지정하기 위해
	//    리턴 자료형(반환 자료형)은 『int』형을 사용하게 된다.
	//    사각형의 둘레를 구하는 과정에서 필요한 연산은
	//    『(가로 + 세로) * 2』이며, 이들은 모두 정수이기 때문이다.
	//    또한, 넓이나 둘레를 담을 변수를 클래스 내부에 별도로 선언한 것이 아니기 때문에
	//    연산 결과는 메소드를 호출한 곳에 반환하는 형태로 처리되어야 한다.
	int calLength()
	{
		// 둘레 = (가로 + 세로) * 2
		return (w+h)*2;
		// ※ 메소드는 『return』문을 통해서만 결과를 돌려주게(반환하게) 된다.
	}

	// ○ 메소드 정의(넓이 계산)
	int calArea()
	{
		int result;
		result = w*h;
		return result;
	}

	// ○ 메소드 정의(결과 출력)
	//    매개변수를 통해 데이터를 넘겨받을 수 있도록 정의(갖고 있지 않은 데이터)
	//    메소드의 매개변수는 메소드 내에서만 활동 가능(보이는 영역)
	//    매개변수 선언 시 각각의 변수마다 자료형을 따로 지정해야 한다
	void print(int a, int l)		//--매개변수: 넓이, 둘레
	{
		System.out.println("가로: "+w);
		System.out.println("세로: "+h);
		System.out.println("넓이: "+a);
		System.out.println("둘레: "+l);
	}
}

// ※ 하나의 자바 파일(.java)에 여러 개의 클래스(class)를 만들 수 있다.
//    하지만 『public class』는 하나만 올 수 있다.
//    파일을 저장할 때의 이름은 『public class』의 이름으로 지정해야 하며,
//    구성된 모든 클래스가 『public class』가 아닐 경우
//    이들 중 파일을 대표할 수 있는 클래스를 선택하여
//    해당 클래스의 이름으로 지정해야 한다.
//    또한, 여러 개의 클래스가 설계된 하나의 파일을 컴파일하게 되면
//    내부에 설계된 클래스의 수만큼 클래스 파일(.class)이 파생된다.

// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class TestingAlone
{
	public static void main(String[] args)
	{
		// Rect 클래스 기반의 인스턴스 생성
		// ----------------
		//     설계도면
		Rect ob = new Rect();
		
		ob.input();
		int a = ob.calLength();
		int b = ob.calArea();

		ob.print(b, a);
	}
}
*/

/*
[실행 결과]
가로 입력: 10
세로 입력: 20

가로: 10
세로: 20
넓이: 200
둘레: 60
계속하려면 아무 키나 누르십시오 . . .
*/