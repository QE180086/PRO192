package congtrunhanchia;

import java.util.Scanner;

public class congtrunhachia {
	public static void main(String[] args) {
		float a, b;
	     Scanner sc = new Scanner(System.in);

System.out.println("Nhap a: ");		
 a= sc.nextFloat();     
System.out.println("Nhap b: ");
b= sc.nextFloat();
		float c= a+b;
		float d= a-b;
		float e= a*b;
		float f = 0;
		
		
		System.out.println("Tong cua a va b: " + c);
		System.out.println("Hieu cua a va b: " + d);
		System.out.println("Tich cua a va b: " + e);
		if (b==0) {
			System.out.println("Thuong cua a va b: Ban da nhap b=0 (errol)");
		} else {
			f =a/b;
			System.out.println("Thuong cua a va b: " + f);

		}

	}

}
