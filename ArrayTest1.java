/* 학습내용
 * 1. 배열 학습
 * 2. 특징
 * 		1. 다수의 데이터를 하나의 변수로 관리
 * 		2. 각각의 데이터는 고유한 index로 관리
 * 			- index는 0부터 시
 * 		3. 기본타입과 참조타입으로 배열 생성 및 활용 가능
 * 		4. 생성된 배열의 크기는 수정 불가
 * 			- 데이터수가 가변적인 경우 차후에 java.util에서 List API 활용 예정
 * 		5. 배열 생성시 legth라는 배열 크기값 보유한 변수 자동 생성
 * 			- java script 언어도 동일	
 * 3. 문법
 * 		1. 타입 [] 변수 or 타입 변수 []
 * 
 */
package step01.syntax;

import org.junit.Test;
import model.domain.Person;

public class ArrayTest1 {
	
	// 기본 타입으로 배열
	@Test
	public void m1(){
		//int 배열 타입
		int [] i = {1, 2, 3};    //0~2까지의 index값을 보유한 int 생성 
		System.out.println(i[0] + " " + i.length);
		System.out.println("----");
		
		/* print() 출력만 실행
		 * println() 출력후 new line 적용
		 * 
		 * 모든 컴퓨터 언어의 공통 표현법
		 * \t - 키보드의 tab키 의미
		 * \n - "    enter키 의미
		 */
		
		//for    for(초기치;조건식;증감식){  조건식이 true인 경우 실행}
		for(int index = 0; index < i.length; index++) {
			System.out.print(i[index] + "\t");
		}
		
		System.out.println();  // new line 반영 
		
		//for each 
		//for(타입 변수 : 배열)
		for(int v : i) {
			System.out.print(v + "\t");
		}
	}
	
	// String 객체 타입으로 배열
	// new 연산자 없이 " " 표현법만으로 자동으로 객체
	// 3개의 String 객체를 보유한 String 배열 
	@Test
	public void m2() {
		System.out.println("\nm2() ---");
		String[] s = {"일", "이", "삼"};
		for(String v : s) {
			System.out.println(v);
		}
	}
	
	// Person 객체 타읍으로 배열 
	@Test
	public void m3() {
		System.out.println("\nm3() ---");
		
		Person[] p = {new Person("연아", 20), new Person("연아2", 50)};
		/* p = Person[]
		 * p[0] = Person 하나의 객체 
		 */
		
		System.out.println(p[0].getName());
		
		p[0].setName("동엽");
		System.out.println(p[0].getName()); //동엽
		
		p[1].setName(p[0].getName());
		System.out.println(p[1].getName()); //?
	}
	
}
