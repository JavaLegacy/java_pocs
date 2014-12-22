package loopImage;

public class Triangle {
	public static void main(String[] args) {
		for (int i = 1; i < 9; i++) {
			for (int j = 1; j < 9; j++) {
				if (j / i == 0) {
					System.out.print(0);
				} else {
					System.out.print(1);
				}
			}
			System.out.println();
		}
	}
}
