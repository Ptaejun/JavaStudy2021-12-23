package a06_입력;

import java.util.Scanner;

public class Userinfo {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.print("사용자의 이름을 입력해 주세요:  ");
		String name=in.nextLine();
		System.out.print("사용자의 아이디를 입력해 주세요:  ");
		String id=in.nextLine();
		System.out.print("사용자의 비밀번호를 입력해 주세요:  ");
		int ps=in.nextInt();
		System.out.print("사용자의 이메일을 입력해 주세요:   );
		String email=in.next();
		System.out.println("\n");
		System.out.println("[입력한 사용자의 정보]");
		System.out.println("이름:" + name);
		System.out.println("아이디:" + id);
		System.out.println("비밀번호:" + ps);
		System.out.println("이메일:" + email);
		
	}
          
}
