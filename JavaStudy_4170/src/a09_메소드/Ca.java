package a09_메소드;

import java.util.Scanner;

public class Ca {
	
	public static void add(double num1,double num2) {
		double result=num1+num2;
		System.out.println("두 수의 합은:  "+result);
		
	}
	public static void sub(double num1,double num2) {
		double result=num1-num2;
		System.out.println("두 수의 차는:  "+result);
	}
	public static void mul(double num1,double num2) { 
		double result=num1*num2;
		System.out.println("두 수의 곱은:  "+result);
	}
	public static void div(double num1,double num2) {
		if (num1>num2 && num2!=0) {
			double result=num1/num2;
			System.out.println("두 수의 몫은:  "+result);
		}
		else if (num2>num1 && num1!=0) {
			double result=num2/num1;
			System.out.println("두 수의 몫은:  "+result);
		}
		else if (num1==num2) {
		System.out.println("두 수의 몫은:  1");
	}
		else if (num1==0 || num2==0) {
			System.out.println("0은 나눌수가 없습니다.");}
		}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("1. 덧셈");
			System.out.println("2. 뺄셈");
			System.out.println("3. 곱셈");
			System.out.println("4. 나눗셈");
			System.out.println("0. 프로그램 종료");
			System.out.println("계산 방법을 선택해 주세요:  ");
			int cmd=sc.nextInt();
			sc.nextLine();
			
			System.out.println("두 수를 입력해주세요.");
			System.out.print("첫번째 수:  ");
			
			System.out.println("두번째 수:  ");
			double num1,num2;
			num1=sc.nextDouble();
			sc.nextLine();
		
			num2=sc.nextDouble();
			sc.nextLine();
			if(cmd==1) {
				add(num1,num2);
			}
			else if (cmd==2) {
				sub(num1,num2);
			}
			else if (cmd==3) {
				mul(num1,num2);
			}
			else if (cmd==4) {
				div(num1,num2);
			}
			else if (cmd==0) {
				System.out.println("프로그램 종료");
				break;
			}
			else {
				System.out.println("잘못된 선택입니다.");
			}
		}
		
	}

}
