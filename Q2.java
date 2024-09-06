import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name;
		System.out.println("What is your name?");
		name = in.nextLine();
		int l = name.length(), count=0;
		while (count<l) {
			System.out.print(count+1);
			System.out.print(". ");
			System.out.print(name.charAt(count++));
			System.out.print("\n");
		}
	}
}
