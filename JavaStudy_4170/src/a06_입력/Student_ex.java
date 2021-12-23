package a06_입력;

import java.util.Scanner;

public class Student_ex {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		String name;
		int kr;
		int eng;
		int math;
		int avg;
		int total;
		String grade;
		
		System.out.print("학생의 이름을 입력해 주세요::  ");
		name=in.nextLine();
		System.out.print("학생의 국어 성적을 입력해 주세요::  ");
		kr=in.nextInt();
		in.nextLine();
		System.out.print("학생의 영어 성적을 입력해 주세요::  ");
		eng=in.nextInt();
		in.nextLine();
		System.out.print("학생의 수학 성적을 입력해 주세요::  ");
		math=in.nextInt();
		in.nextLine();
		total=kr+eng+math;
		avg=total/3;
		grade=avg>89?"A":avg>79?"B":avg>69?"C":avg>59?"D":"F";
		System.out.println("\n");
		System.out.println("[학생 성적 정보]");
		System.out.println("국어:" + kr);
		System.out.println("영어" + eng);
		System.out.println("수학" + math);
		System.out.println("총합" + total);
		System.out.println("평균" + avg);
		System.out.println("등급"+ grade);
		
		//avg=평균
		//total=총점
		//grade= 삼항연산자. 
		//grade가  90이상이면 A등급 80점이상이면 b 70점 이상이면 c 60점 이상이면 d 그 밑으로 f
	}

}
