package a09_메소드;

public class MethodEx {
	//매개변수x, 반환값x
	public static void printInfo() {
		
	}
	
	
	//매개변수0,반환값x
	public static void printName(String name) {
		System.out.println("이름"+ name);
	}
	//매개변수x,반환값 0
	public static String getName() {
		String name= "박태준";
		return name; 
	}
	//매개변수0,반환값0
	public static String transferName(String name) {
		String tname=name+"님";
		return tname;
	}
	public static String transferName2(String name,int number) {
		return number + "번 고객:  "+ name;
	}
	public static void main(String[] args) {
		System.out.println(getName());
		System.out.println(transferName("박태준"));
		
		System.out.println(transferName2("박태준",4));
	}

}
