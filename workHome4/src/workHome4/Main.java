package workHome4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i < 10; i++) {
			System.out.println(doubleToString(Math.PI, i));
		}

	}

	public static String doubleToString(double number, int n) {
		String result = String.format("%." + n + "f", number);
		return result;
	}

}
