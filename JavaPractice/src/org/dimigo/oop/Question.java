/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *  |_ Question
 *
 * 1. 개요: My Favorite
 * 2. 작성일: 2017. 4. 3.
 * </pre>
 *
 * @author     : 덮어라.pc
 * @version    : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String [] questions = {"1.가장 좋아하는 과목은?", "2.가장 좋아하는 음식은?", "3.가장 좋아하는 급훈은?"};
		String [] answers = {"체육", "치킨", "언행일치"};
		for(int i=0;i<3;i++)
		{
			System.out.println(questions[i]);
			Scanner scanner = new Scanner(System.in);
			String answer = scanner.nextLine();
			if(answer.equals(answers[i])){
				System.out.println("정답입니다!");
			}
			else{
				System.out.println("틀렸습니다!");
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append("<<결과출력>>\n");
		for(int i=0;i<3;i++){
			sb.append(questions[i]).append(" ").append(answers[i]).append("입니다.\n");
		}

		System.out.println(sb);
	}

}
