package teacher;

public class OverloadMainMethod {

	public static void main(String[] args) {
		System.out.println("1");
		main("manish");
	}
	public static void main() {
		System.out.println("2");
	}
	public static void main(int a) {
		System.out.println("3");
	}
	public static void main(String name) {
		System.out.println("4");
	}
}
