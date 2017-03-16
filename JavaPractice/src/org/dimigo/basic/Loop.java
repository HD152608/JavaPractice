/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *  |_ Loop
 *
 * 1. 개요: 초간단 게임프로그램
 * 2. 작성일: 2017. 3. 16.
 * </pre>
 *
 * @author     : 덮어라.pc
 * @version    : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice, cnt=100;
		String[] charac = {"마법사","영주","기사","농민"};
		do{
		System.out.println("--------------------");
		System.out.println("<<게임 메뉴>>");
		System.out.println("1.공격력 증가");
		System.out.println("2.공격력 감소");
		System.out.println("3.캐릭터 설정");
		System.out.println("9.종료");
		System.out.println("--------------------");
		System.out.println("메뉴 입력 => ");
		choice = scanner.nextInt();
		switch(choice)
		{
		case 1:
			cnt+=10;
			System.out.println("공격력이 증가되었습니다.현재 공격력: "+ cnt);
			break;
		case 2:
			cnt -= 10;
			System.out.println("공격력이 감소되었습니다.현재 공격력: "+ cnt);
			break;
		case 3:
			int num = new Random().nextInt(4);
			if(num==0) 
				System.out.println(charac[0]+"(으)로 설정되었습니다.");
			else if(num==1)
				System.out.println(charac[1]+"(으)로 설정되었습니다.");
			else if(num==2)
				System.out.println(charac[2]+"(으)로 설정되었습니다.");
			else if(num==3)
				System.out.println(charac[3]+"(으)로 설정되었습니다.");
			break;
		case 9:
			System.out.println("이제 공부하세요!!");
			scanner.close();
			break;
		default:
			System.out.println("없는 메뉴입니다!!");
			break;
		}
		}
		while(choice !=9);
	}

}
