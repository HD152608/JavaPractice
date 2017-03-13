/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *  |_ Operator
 *
 * 1. 개요: 디미베네
 * 2. 작성일: 2017. 3. 13.
 * </pre>
 *
 * @author     : 덮어라.pc
 * @version    : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("<<디미베네 연간 인건비>>");
		long money = 1700000;
		int people = 3;
		int store = 1500;
		long t= money*12*people*store;
		String total =String.format("%,d", t);
		String month= String.format("%,d", 1700000);
		String cnt= String.format("%,d", 1500);		
		System.out.printf("월 평균 급여 : %s원\n", month);
		System.out.printf("점포 내 직원 수 : %d명\n", people);
		System.out.printf("점포 수 : %s개\n\n", cnt);
		System.out.printf("연간 인건비 : %s원", total);
		
		

	}

}
