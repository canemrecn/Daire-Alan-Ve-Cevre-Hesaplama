package daçh;

import java.util.Scanner;

public class daçhh {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dairenin yaricap degerini giriniz: ");
		int r = scanner.nextInt();
		double alan = Math.PI * r * r;
		double cevre = 2 * Math.PI * r;
		System.out.println("Dairenin alani: " + alan);
		System.out.print("Dairenin cevresi: " + cevre);
		
	}
}
