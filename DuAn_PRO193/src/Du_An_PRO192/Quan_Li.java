package Du_An_PRO192;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Quan_Li {
	private ArrayList<Giang_Vien> quanli_gv;
	private ArrayList<Sinh_Vien> quanli_sv;
	ArrayList<Giang_Vien> ketquatimkiem = new ArrayList<>();
	ArrayList<Sinh_Vien> ketQuaTimKiem = new ArrayList<>();

	public Quan_Li() {
		this.quanli_gv = new ArrayList<Giang_Vien>();
		this.quanli_sv = new ArrayList<Sinh_Vien>();
	}

// GIANG VIEN -------------------------------------
// 1. Them giang vien
	public void themGiangVien(Giang_Vien gv) {
		this.quanli_gv.add(gv);
	}

// 2. In ra thong tin cua giang vien
	public void xuatGiangVien() {
		for (Giang_Vien giang_Vien : quanli_gv) {
			System.out.println(giang_Vien);
		}
	}

// 3. Tim kiem ten cua giang vien dua tren mon giang day
	public void timKiemGiangVien_MonDay(String monDay, String tenFile) {
		for (Giang_Vien giang_Vien : quanli_gv) {
			if (giang_Vien.getMon_Giang_Day().equals(monDay)) {
				ketquatimkiem.add(giang_Vien);
			}
		}
		if(ketquatimkiem.isEmpty()) {
			System.out.println("Khong tim thay giang vien nao day:" + monDay);
		} else {
			try 
				(FileWriter fw = new FileWriter(tenFile)){
				for (Giang_Vien giang_Vien : ketquatimkiem) {
					fw.write("Tên: " + giang_Vien.getTen() +   "   Email:" + giang_Vien.getEmail()+    "   Môn Dạy: " + giang_Vien.getMon_Giang_Day()+     "Số điện thoại: " + giang_Vien.getSo_Dien_Thoai()+ "\n");
				}
				System.out.println("Ket qua tim giang vien duoc xuat ra file: " + tenFile);
			} catch (IOException e) {
				
			}
		}
	}

// 4. Tim kiem ten cua giang vien dua tren email
	public void timKiemGiangVien_Email(String email, String tenFile) {
		for (Giang_Vien giang_Vien : quanli_gv) {
			if (giang_Vien.getEmail().equals(email)) {
				ketquatimkiem.add(giang_Vien);
			}

		}
		if (ketquatimkiem.isEmpty()) {
			System.out.println("Khong tim thay giang vien co email: " + email);
		} else {
			try (FileWriter writer = new FileWriter(tenFile)) {
				for (Giang_Vien giang_Vien : ketquatimkiem) {
					writer.write("Tên: " + giang_Vien.getTen() +   "   Email: " + giang_Vien.getEmail()
							+   "   Môn dạy: " + giang_Vien.getMon_Giang_Day() + "   Số điện thoại: " + giang_Vien.getSo_Dien_Thoai() +"\n");
				}
				System.out.println("Ket quả tìm kiem giang vien đa đuoc xuat ra file:  " + tenFile);
			} catch (IOException e) {
			}

		}
	}

// 5. Kiem tra giang vien co ton tai hay khong
	public boolean kiemTraGiangVienTonTai(String ten) {
		for (Giang_Vien giang_Vien : quanli_gv) {
			if (giang_Vien.getTen().indexOf(ten) >= 0) {
				return true;
			}
		}
		return false;
	}
// 6. Xoa ten giang vien ra khoi danh sach

	public boolean xoaTenGiangVien(String email) {
		for (Giang_Vien giang_Vien : quanli_gv) {
			if (giang_Vien.getEmail().indexOf(email) >= 0) {
				return this.quanli_gv.remove(giang_Vien);
			}
		}
		return false;
	}

// 7. Sua thong tin giang vien
	public boolean suaThongTin(String tenCu, Giang_Vien thongTinMoi) {
		for (Giang_Vien giang_Vien : quanli_gv) {
			if (giang_Vien.getTen().equals(tenCu)) {
				giang_Vien.setTen(thongTinMoi.getTen());
				giang_Vien.setEmail(thongTinMoi.getEmail());
				giang_Vien.setMon_Giang_Day(thongTinMoi.getMon_Giang_Day());
				giang_Vien.setSo_Dien_Thoai(thongTinMoi.getSo_Dien_Thoai());
				return true;
			}
		}
		return false;
	}
// 8. Xoa tat ca giang vien
	public boolean xoaTatCaGiangVien() {
		return this.quanli_gv.removeAll(quanli_gv);
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
	public void timKiemTen_MonHoc(String chuyenNganh, String tenFile) {
		for (Sinh_Vien sinh_Vien : quanli_sv) {
			if (sinh_Vien.getChuyen_Nganh().equals(chuyenNganh)) {
				ketQuaTimKiem.add(sinh_Vien);
			}
		}
		if(ketQuaTimKiem.isEmpty()) {
			System.out.println("Khong tim thay sinh vien nao hoc:" + chuyenNganh);
		} else {
			try 
				(FileWriter fw = new FileWriter(tenFile)){
				for (Sinh_Vien sinh_Vien : ketQuaTimKiem) {
					fw.write("Tên: " + sinh_Vien.getTen() +   "     Email:" + sinh_Vien.getEmail()+    "     Chuyên Ngành: " + sinh_Vien.getChuyen_Nganh()+ "     Số điện thoại:" + sinh_Vien.getSo_Dien_Thoai() +"\n");
				}
				System.out.println("Ket qua tim sinh vien duoc xuat ra file: " + tenFile);
			} catch (IOException e) {
				
			}
		}

	}

// 12.Tim kiem ten hoc sinh dua tren email
	public void timKiem_Email(String email, String tenFile) {
		for (Sinh_Vien sinhVien : quanli_sv) {
			if (sinhVien.getEmail().equals(email)) {
				ketQuaTimKiem.add(sinhVien);
			}

		}
		if (ketQuaTimKiem.isEmpty()) {
			System.out.println("Khong tim thay sinh vien co email: " + email);
		} else {
			try (FileWriter writer = new FileWriter(tenFile)) {
				for (Sinh_Vien sinh_Vien : ketQuaTimKiem) {
					writer.write("Tên: " + sinh_Vien.getTen() +   "   Email: " + sinh_Vien.getEmail()
							+   "   Chuyên Ngành: " + sinh_Vien.getChuyen_Nganh() + "   Số điện thoại: " + sinh_Vien.getSo_Dien_Thoai()+ "\n");
				}
				System.out.println("Ket qua tim kiem sinh vien đa đuoc xuat ra file:  " + tenFile);
			} catch (IOException e) {
			}

		}

	}

// 13.Kiem tra ten cua hoc sinh do co ton tai hay khong
	public boolean kiemTraTonTai_SinhVien(String ten) {
		for (Sinh_Vien sinh_Vien : quanli_sv) {
			if (sinh_Vien.getTen().indexOf(ten) >= 0) {
				return true;
			}
		}
		return false;
	}

// 14. Xoa thong tin cua hoc sinh
	public boolean xoaThongTin_SinhVien(String email) {
		for (Sinh_Vien sinh_Vien : quanli_sv) {
			if (sinh_Vien.getEmail().indexOf(email) >= 0) {
				return quanli_sv.remove(sinh_Vien);
			}
		}
		return false;
	}

// 15.Sua thong tin cua hoc sinh
	public boolean suaThongTin_SinhVien(String tenCu, Sinh_Vien thongTinMoi) {
		for (Sinh_Vien sinh_Vien : quanli_sv) {
			if (sinh_Vien.getTen().equals(tenCu)) {
				sinh_Vien.setTen(thongTinMoi.getTen());
				sinh_Vien.setEmail(thongTinMoi.getEmail());
				sinh_Vien.setChuyen_Nganh(thongTinMoi.getChuyen_Nganh());
				sinh_Vien.setSo_Dien_Thoai(thongTinMoi.getSo_Dien_Thoai());
				return true;
			}
		}
		return false;
	}
//16. Xoa tat ca sinh vien

	public boolean xoaTatCaSinhVien() {
		return this.quanli_sv.removeAll(quanli_sv);
	}

}
	
