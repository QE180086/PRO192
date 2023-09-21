package tendiem;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ten t1 = new ten("Nguyen Van Thuong", 9, 10, 10);
		ArrayList<String> ten = new ArrayList<>(); 
		
		

		System.out.println(t1.toString());
		System.out.println(t1.getDiemhocphan());
		System.out.println("Nhap ten muon tim kiem: ");
		String tencantim = sc.nextLine();
		
		ten.add("Nguyen Van Thuong");
		if(ten.contains(tencantim)) {
			System.out.println("Ten can tim kiem: Yes");
		} else {
			System.out.println("Ten can tim kiem: No");
		}
		
	}

}
