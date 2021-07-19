/*==============================
+++++++컬렉션(Collection)+++++++
================================
◎ Test164.java
==============================*/

// Map - Hashtable, HashMap

// -java.util.Map 인터페이스는
//  키(key)를 값(Value)에 매핑(mapping)하여,
//  동일한 키를 등록할 수 없고 유일해야 하며,
//  각 키는 한 개의 값만을 매핑해야 한다.
//  즉, 하나의 키에 대응하는 하나의 값을 갖는 자료구조이다.

/*
○ Hashtable<K, V> 클래스

   - 해시테이블 구조를 객체 모델링화한 클래스로
     검색이 용이하기 때문에 사용 빈도가 높은 편에 속한다.

   - 해시테이블이란 키(key)와 그에 상응하는 데이터(value)로
     구분된 데이터 구조이다.

   - 데이터를 저장하고, 검색하기 위해서 키로 접근하며,
     이 구조에서는 키 값을 부여하면 해당 데이터가 변환된다.

   - 또한, Hashtable클래스는 key 또는 Value 의 값으로 null 을 허용하지 않는다.
*/

import java.util.Hashtable;

public class Test164
{
	private static final String[] names = {"김아별","심혜진","조은선","김서현","소서현"};
	private static final String[] tels = {"010-6888-5456","010-7101-9504","010-5472-5201","010-8220-0980","010-9453-7149"};

	public static void main(String[] args)
	{
		// Hashtable 자료구조 인스턴스 생성
		Hashtable<String, String> ht = new Hashtable<String, String>();

		// ht 라는 Hashtable 자료구조에 배열(names,tels)에 담겨 있는
		// 데이터를 요소로 추가하기(담아내기) → put(k,v)
		// ex) ht.put("홍길동", "010-1234-5678");
		//               key         value
		for (int i=0; i<names.length; i++)
			ht.put(names[i], tels[i]);

		// ht라는 해시테이블의 요소 중 값을 검색(key를 이용하여 검색)
		String findName1 = "조은선";
		String str = ht.get(findName1);	//--get(키) → 값
		
		if (str != null)
			System.out.println(findName1 + " 전화번호: "+ str);	//--조은선 전화번호: 010-5472-5201
		System.out.println();

		// ht라는 해시테이블 자료구조에 key가 존재하는지의 여부 확인 → containsKey()
		String findName2 = "박정준";

		if (ht.containsKey(findName2))
			System.out.println(findName2 + " 데이터가 존재합니다");
		else
			System.out.println(findName2 + " 데이터가 존재하지 않습니다.");
		System.out.println();
		// 박정준 데이터가 존재하지 않습니다.

		String findName3 = "김서현";
		
		if (ht.containsKey(findName3))
			System.out.println(findName3 + " 데이터가 존재합니다");
		else
			System.out.println(findName3 + " 데이터가 존재하지 않습니다.");
		System.out.println();
		// 박정준 데이터가 존재합니다.

		// ht라는 해시테이블 자료구조에 value가 존재하는지의 여부 확인 → contains()
		String findTel1 = "010-9453-7149";

		if (ht.contains(findTel1))
			System.out.println(findTel1 + " 데이터가 존재합니다.");
		else
			System.out.println(findTel1 + " 데이터가 존재하지 않습니다.");
		System.out.println();
		// 010-9453-7149 데이터가 존재합니다.

		String findTel2 = "010-8019-2565";
		if (ht.contains(findTel2))
			System.out.println(findTel2 + " 데이터가 존재합니다.");
		else
			System.out.println(findTel2 + " 데이터가 존재하지 않습니다.");
		System.out.println();
		// 010-8019-2565 데이터가 존재하지 않습니다.

		// ht라는 해시테이블 자료구조에서 심혜진 데이터 삭제 → remove()
		ht.remove("심혜진");

		// 삭제(→ remove()) 이후 key가 존재하는지 확인
		if (ht.containsKey("심혜진"))
			System.out.println("데이터가 존재합니다.");
		else
			System.out.println("데이터가 존재하지 않습니다.");
		System.out.println();
		// 데이터가 존재하지 않습니다.
		
		// 삭제(→ remove()) 이후 value가 존재하는지 확인
		if (ht.contains("010-7101-9504"))
			System.out.println("데이터가 존재합니다.");
		else
			System.out.println("데이터가 존재하지 않습니다.");
		System.out.println();
		// 데이터가 존재하지 않습니다.

		// null 입력 시도
		// key, value 모두 null (X)
		//ht.put(null, null);			//--에러 발생(java.lang.NullPointerException)
		// value만 null (X)
		//ht.put("선혜연", null);		//--에러 발생(java.lang.NullPointerException)
		// key만 null (X)
		//ht.put(null, "010-2222-2222");//--에러 발생(java.lang.NullPointerException)

		// 중복된 key 값 입력
		ht.put("김아별", "010-7777-5456");

		System.out.println(ht.get("김아별"));	//--010-7777-5456
		System.out.println();
		// 덮어쓰기, 갱신

		// 중복된 value값 입력
		ht.put("박민지", "010-8220-0980");

		System.out.println(ht.get("김서현");	//--010-8220-0980
		System.out.println(ht.get("박민지");	//--010-8220-0980
		// 기존 데이터에 아무런 영향을 미치지 않음
	}
}