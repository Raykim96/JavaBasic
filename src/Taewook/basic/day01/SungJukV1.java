package Taewook.basic.day01;

/**
 * 
 * @author Taewook Kim
 * @category Javabasic
 * @version 1.0 자바기초프로그램
 */
public class SungJukV1 {
	public static void main(String[] args) {
		String name;
		int kor;
		int eng;
		int mat;
		int sum;
		double avg;
		char grd;

		// 입력
		name = "홍길동";
		kor = 90;
		eng = 59;
		mat = 84;

		sum = kor + eng + mat;
		avg = sum / 3;

		grd = '가';

		// 결과출력
		System.out.print("이름: ");
		System.out.println(name);
		System.out.print("국어: ");
		System.out.println(kor);
		System.out.print("영어: ");
		System.out.println(eng);
	}
}
