package a08_반복;

public class Continue_break {

	public static void main(String[] args) {
		for(int i=0;i<100;i++) {
			if (i%2==0) {
				continue;
			}
			if (i==81) {
				break;
			
			}
			System.out.println(i);

		} 
	}

}
