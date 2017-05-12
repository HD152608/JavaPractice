/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *  |_ PersonTest
 *
 * 1. 개요: We are the world! 업그레이드
 * 2. 작성일: 2017. 5. 12.
 * </pre>
 *
 * @author     : 덮어라.pc
 * @version    : 1.0
 */
public class PersonTest2 {
	private static void greeting(Person p){
		System.out.println(p);
		p.sayHello();
		p.sayBye();
		System.out.println();
	}

	public static void main(String[] args) {
		Person [] persons ={
				new Person("Tom"),
				new Korean("홍길동"),
				new Japanese("다나카"),
				new Chinese("왕밍")
				
		};
		for(Person p: persons){
			greeting(p);
		}
	}
	

}
