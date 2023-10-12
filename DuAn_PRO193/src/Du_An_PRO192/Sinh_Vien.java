package Du_An_PRO192;

public class Sinh_Vien {
	private String ten;
	private String email;
	private String chuyen_Nganh;
	private String so_Dien_Thoai;

	public Sinh_Vien(String ten, String email, String chuyen_Nganh, String so_Dien_Thoai) {
		this.ten = ten;
		this.email = email;
		this.chuyen_Nganh = chuyen_Nganh;
		this.so_Dien_Thoai = so_Dien_Thoai;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getChuyen_Nganh() {
		return chuyen_Nganh;
	}
	public void setChuyen_Nganh(String chuyen_Nganh) {
		this.chuyen_Nganh = chuyen_Nganh;
	}
	
	public String getSo_Dien_Thoai() {
		return so_Dien_Thoai;
	}
	public void setSo_Dien_Thoai(String so_Dien_Thoai) {
		this.so_Dien_Thoai = so_Dien_Thoai;
	}
	@Override
	public String toString() {
		return "Sinh_Vien [ten=" + ten + ", email=" + email + ", chuyen_Nganh=" + chuyen_Nganh + ", so_Dien_Thoai="
				+ so_Dien_Thoai + "]";
	}
	
	
	
	

}
