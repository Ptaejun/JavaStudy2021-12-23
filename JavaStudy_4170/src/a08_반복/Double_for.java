package a08_반복;

import java.util.Scanner;

public class Double_for {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i;
		int a;
		System.out.print("몇단부터 출력할까요?::  ");		//몇단 출력 입력
		a=in.nextInt();
		in.nextLine();
		int s;
		System.out.print("몇단까지 출력할까요?::  ");		//몇단 출력 입력  	
		s=in.nextInt();
		in.nextLine();
		int j;
		for (i=a;i<=s;i++) {								//for 안에는 조건문이어야하므로 새로운 변수 i와 s를 지정
	
			System.out.println("["+i+"]단");
			for (j=1;j<10;j++){
				System.out.println(i+"X"+j+"="+(i*j));
				}
			}
		}
	}
