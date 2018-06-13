package workHome3;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static int toInt(String n) {
		char[] m;
		m = n.toCharArray();
		int number = 0;
		for (int i = 0; i < m.length; i++) {
			number = number << 1;
			if (m[i] == '1') {
				number = number | 1;
			} else {
				number = number | 0;
			}
			if (m[i] != '1' && m[i] != '0') {
				System.out.println("Wrong number");
				number = 0;
				break;
			}

		}

		return number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the binary code");
		String n = sc.next();
		System.out.println(toInt(n));

	}

}
