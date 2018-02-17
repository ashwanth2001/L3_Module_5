package other;

public class Amc1 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			for (int j = 1; j < 101; j++) {
				sum += i + j;
			}
		}
		System.out.println(sum);
	}
}
