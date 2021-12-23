package a07_조건;

public class SwitchCase {

	public static void main(String[] args) {
		char select='B';
		
		switch(select) {
			case 'A': 
				System.out.println("A");
			case 'B': 
				System.out.println("B");
				break;
			case 'C': 
				System.out.println("C");
			case 'D': 
				System.out.println("D");
			case 'F': 
				System.out.println("F");
			default:
				System.out.println("잘못된 성적입니다");
				
		}
	}

}
