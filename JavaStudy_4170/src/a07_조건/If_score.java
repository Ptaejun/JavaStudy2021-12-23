package a07_조건;

import java.util.Scanner;

public class If_score {

	public static void main(String[] args) {
		int score;
		Scanner in=new Scanner(System.in);
		score=in.nextInt();
	if (score>=90){
		System.out.println("A");
	}
	else if (score>=80) {
		System.out.println("B");
	}
	else if (score>=70) {
		System.out.println("C");
	}
	else if (score>=60) {
		System.out.println("D");	
	}
	else if (score>100 || score<0) {
		System.out.println("계산할 수 없는 점수입니다.");	
	}
	else {
		System.out.println("F");
	}
	}

}
