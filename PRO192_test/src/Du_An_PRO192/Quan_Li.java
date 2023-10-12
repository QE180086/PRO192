package Du_An_PRO192;


import java.util.ArrayList;
import java.util.Iterator;



public class Quan_Li {
private ArrayList<Giang_Vien> quanli_gv;
private ArrayList<Sinh_Vien> quanli_sv;

public Quan_Li() {
	this.quanli_gv = new ArrayList<Giang_Vien>();
	this.quanli_sv = new ArrayList<Sinh_Vien>();
}
// GIANG VIEN -------------------------------------
// 1. Them giang vien
public void themGiangVien (Giang_Vien gv) {
	this.quanli_gv.add(gv);
}
// 2. In ra thong tin cua giang vien
public void xuatGiangVien () {
	for (Giang_Vien giang_Vien : quanli_gv) {
		System.out.println(giang_Vien);
	}
}
// 3. Tim kiem ten cua giang vien dua tren mon giang day
public void timKiemGiangVien_MonDay(String monday) {
	for (Giang_Vien giang_Vien : quanli_gv) {
		if(giang_Vien.getMon_Giang_Day().indexOf(monday)>=0) {
			System.out.println(giang_Vien);
		}
	}
}
// 4. Tim kiem ten cua giang vien dua tren email
public void timKiemGiangVien_Email(String email ) {
	for (Giang_Vien giang_Vien : quanli_gv) {
		if(giang_Vien.getEmail().indexOf(email)>=0) {
			System.out.println(giang_Vien);
		}
	}
}
// 5. Kiem tra giang vien co ton tai hay khong
public boolean kiemTraGiangVienTonTai(String  ten) {
	for (Giang_Vien giang_Vien : quanli_gv) {
		if(giang_Vien.getTen().indexOf(ten)>=0) {
			return true;
		}
	}
	return false;
}
// 6. Xoa ten giang vien ra khoi danh sach

public boolean xoaTenGiangVien(String email) {
	for (Giang_Vien giang_Vien : quanli_gv) {
		if(giang_Vien.getEmail().indexOf(email) >=0) {
			return this.quanli_gv.remove(giang_Vien);
		}
	}
	return false;
}
// 7. Sua thong tin giang vien
public boolean suaThongTin(String tenCu, Giang_Vien thongTinMoi) {
	for (Giang_Vien giang_Vien : quanli_gv) {
		if(giang_Vien.getTen().equals(tenCu)) {
			giang_Vien.setTen(thongTinMoi.getTen());
			giang_Vien.setEmail(thongTinMoi.getEmail());
			giang_Vien.setMon_Giang_Day(thongTinMoi.getMon_Giang_Day());
			return true;
		}
	}
	return false;
}
// HOC SINH ----------------------------------
// 9.Them sinh vien
public void themSinhVien(Sinh_Vien sv) {
	this.quanli_sv.add(sv);
	
}
// 10.In ra  sinh vien
public void xuatSinhVien() {
	for (Sinh_Vien sinh_Vien : quanli_sv) {
		System.out.println(sinh_Vien);
	}
	
}
// 11.Tim kiem ten cua sinh vien dua tren mon hoc
public void timKiemTen_MonHoc(String chuyenNganh) {
	for (Sinh_Vien sinh_Vien : quanli_sv) {
		if(sinh_Vien.getChuyen_Nganh().indexOf(chuyenNganh)>=0) {
			System.out.println(sinh_Vien);
		}
	}
}
// 12.Tim kiem ten hoc sinh dua tren email
public void timKiem_Email(String email) {
	for (Sinh_Vien sinh_Vien : quanli_sv) {
		if(sinh_Vien.getEmail().indexOf(email)>=0) {
			System.out.println(sinh_Vien);
		}
	}
	
}
// 13.Kiem tra ten cua hoc sinh do co ton tai hay khong
public boolean kiemTraTonTai_SinhVien(String ten) {
	for (Sinh_Vien sinh_Vien : quanli_sv) {
		if(sinh_Vien.getTen().indexOf(ten)>=0) {
			return true;
		}
	}
	return false;
}
// 14. Xoa thong tin cua hoc sinh
public boolean xoaThongTin_SinhVien(String email) {
	for(Sinh_Vien sinh_Vien : quanli_sv) {
		if(sinh_Vien.getEmail().indexOf(email)>=0) {
			return quanli_sv.remove(sinh_Vien);
		}
	}
	return false;
}
// 15.Sua thong tin cua hoc sinh
public boolean suaThongTin_SinhVien(String tenCu, Sinh_Vien thongTinMoi) {
	for (Sinh_Vien sinh_Vien : quanli_sv) {
		if(sinh_Vien.getTen().equals(tenCu)) {
			sinh_Vien.setTen(thongTinMoi.getTen());
			sinh_Vien.setEmail(thongTinMoi.getEmail());
			sinh_Vien.setChuyen_Nganh(thongTinMoi.getChuyen_Nganh());
			return true;
		}
	}
	return false;
}




	



}
