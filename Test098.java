/*=======================
+++++++배열(Array)+++++++
-배열의 복사
=========================
◎ Test098.java
=======================*/


// Test097.java와 비교

// ※ 배열 변수의 복사는 데이터 복사, 주소값 복사 두 가지 형태가 존재한다.

//    주소값 복사 → 얕은 복사 → 원본을 수정하면 복사본에 영향을 미치게 되는 복사 방법
//                                (배열 뿐만 아니라 모든 참조형 데이터에 해당하는 복사)
//    데이터 복사 → 깊은 복사 → 실제 요소로 들어있는 값에 대한 복사로
//                                원본을 수정해도 복사본에 영향을 미치지 않는 복사 방법


// 데이터 복사
// -int형 배열에 대한 깊은 의미의 복사를 처리하는
//  메소드를 구현하는(정의하는) 형태로 실습 진행


public class Test098
{
	public static void main(String[] args)
	{
		int[] nums = {10, 20, 30, 40, 50};	//--배열 원본
		int[] copy1 = nums;					//--얕은 의미의 배열 복사 수행(주소값 복사)
		int[] copy2 = copyArray(nums);		//--깊은 의미의 배열 복사 수행(사용자 정의 메소드 호출)
		int[] copy3 = (int[])nums.clone();	//--깊은 의미의 배열 복사 수행(자바 제공 clone() 메소드 호출)
											//--clone() 메소드는 오브젝트(객체) 전체를 복사함

		// 원본 배열의 요소 수정 발생
		nums[1] = 2000;

		// copy1 배열 전체 요소 출력
		for (int i=0; i<copy1.length; i++)
			System.out.print(copy1[i]+" ");
		System.out.println();

		// copy2 배열 전체 요소 출력
		for (int i=0; i<copy2.length; i++)
			System.out.print(copy2[i]+" ");
		System.out.println();

		// copy3 배열 전체 요소 출력
		for (int i=0; i<copy3.length; i++)
			System.out.print(copy3[i]+" ");
		System.out.println();
	}

	public static int[] copyArray(int[] os)
	{
		// 매개변수로 넘겨받은 배열
		// 즉, 원본 배열 만큼의 배열방(메모리 공간)을 확보한
		// 복사할 배열방을 생성하겠다.
		int[] temp = new int[os.length];

		// 각각의 원본 배열(os)에 담겨있는 요소들을 복사 배열(temp)에 담아내기
		for (int i=0; i<os.length; i++)	//--os.length == temp.length
			temp[i] = os[i];

		// 복사한 배열 반환
		return temp;
	}
}

/*
[실행 결과]
10 2000 30 40 50
10 20 30 40 50
10 20 30 40 50
계속하려면 아무 키나 누르십시오 . . .
*/