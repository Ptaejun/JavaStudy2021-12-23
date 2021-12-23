package a08_반복;

import java.util.Scanner;

public class Loop_controller {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int cmd;
		while(true) {
			System.out.println("[JAVA 사이트]");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("0. 프로그램 종료");
			System.out.print("명령을 선택해주세요:  ");
			cmd=in.nextInt();
			in.nextLine();
			System.out.println();
			if(cmd==0) {
				System.out.println("프로그램 종료");
				break;
			}else if (cmd==1) {
				System.out.println("[회원가입]");
				System.out.println("1. 일반 회원가입");
				System.out.println("2. 구글 계정을 사용하여 회원가입");
				System.out.println("3. 네이버 계정을 사용하여 회원가입");
				System.out.println("9. 뒤로가기");
				System.out.println("0. 프로그램 종료");
				System.out.print("명령을 선택해 주세요 ::  ");
				cmd=in.nextInt();
				in.nextLine();
				System.out.println();
				if(cmd==0) {
					System.out.println("프로그램 종료");
					break;
				}
				else if(cmd==9) {
					System.out.println("이전 페이지로 이동합니다.");
				}
				else if(cmd==1) {
					System.out.println("일반회원가입");
				}
				else if(cmd==2) {
					System.out.println("구글계정회원가입");
				}
				else if(cmd==3) {
					System.out.println("네이버계정회원가입");
				}
				
				else if (cmd==2) {
				System.out.println("[로그인]");
			}else {
			System.out.println("오류: 사용할 수 없는 명령입니다");
			}
			System.out.println();
		
		System.out.println("프로그램이 정상적으로 종료됨");
	}
		}
	}
}	
