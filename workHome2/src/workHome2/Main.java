package workHome2;

import java.util.Arrays;

public class Main {

	public static String tostr(int mass[]) {
		StringBuilder sb = new StringBuilder();
		String str;
		for (int j : mass) {
			sb.append(j);
			sb.append(" ");
		}
		str = sb.toString();
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 50, 1, 2, 3, 54 };

		System.out.println(Arrays.toString(a));
		System.out.println(tostr(a));

	}

}
