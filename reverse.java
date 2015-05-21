import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word = input(in);
		reverse(word);
	}
	//receives input from user
	public static String input(Scanner in) {
		System.out.print("Input a word so I can reverse it: ");
		String word = in.next();
		return word;
	}
	//reverses string by adding chars in reverse order to empty string
	public static void reverse(String word) {
		String temp = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			temp += word.charAt(i);
		}
		System.out.print(temp);
		System.out.println();
	}
}