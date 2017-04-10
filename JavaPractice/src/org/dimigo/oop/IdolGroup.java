/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *  |_ IdolGroup
 *
 * 1. 개요: 아이돌 그룹 배열
 * 2. 작성일: 2017. 4. 10.
 * </pre>
 *
 * @author     : 덮어라.pc
 * @version    : 1.0
 */
public class IdolGroup {

	public static void printArr(String[][] arr,int len){
		for(int i=0; i<arr[len].length; i++){
			System.out.println(arr[len][i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		String[] groupName = {"빅뱅", "2NE1", "걸스데이"};
		String[][] memberName = {
				{"GD", "태양", "대성", "탑", "승리"},
				{"CL", "산다라박", "박봄", "민지"},
				{"유라","혜리","소진","민아"}
		};
		
		IdolGroup obj = new IdolGroup();
		for(int i=0;i<3;i++)
		{
			System.out.println("<<"+groupName[i]+">>");
			obj.printArr(memberName, i);
		}
		
		

	}

}
