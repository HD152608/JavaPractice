/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *  |_ SmartPhoneTest
 *
 * 1. 개요: 스마트폰 경쟁 업그레이드
 * 2. 작성일: 2017. 5. 16.
 * </pre>
 *
 * @author     : 덮어라.pc
 * @version    : 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmartPhone [] phones ={
				new IPhone("iPhone 7", "애플", 900000),
				new Galaxy("갤럭시 S8", "삼성", 800000)
		};
		for(SmartPhone v : phones){
			System.out.println(v);
			v.turnOn();
			v.pay();
			v.useSpecialFunction();
			v.turnOff();
			System.out.println();
		}
		

	}

}
