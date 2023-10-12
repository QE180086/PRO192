package congtrunhanchia;

import java.util.Scanner;

public class congtrunhachia {
	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);
		do {

			try {

				System.out.println("Nhap a: ");
				a = sc.nextDouble();
				System.out.println("Nhap b: ");
				b = sc.nextDouble();
				double c = a + b;
				double d = a - b;
				double e = a * b;
				double f = 0;

				System.out.println("Tong cua a va b: " + c);
				System.out.println("Hieu cua a va b: " + d);
				System.out.println("Tich cua a va b: " + e);
				if (b == 0) {
					System.out.println("Thuong cua a va b: Ban da nhap b=0 (errol)");
				} else {
					f = a / b;
					System.out.println("Thuong cua a va b: " + f);

				}
				break;

			} catch (Exception e) {
				System.out.println("Vui long nhap lai  ");
			}
			sc.nextLine();

		} while (true);
	}
}
