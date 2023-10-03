package Du_An_PRO192;

public class Sinh_Vien {
	private String ten;
	private String email;
	private String chuyen_Nganh;
	public Sinh_Vien(String ten, String email, String chuyen_Nganh) {
		this.ten = ten;
		this.email = email;
		this.chuyen_Nganh = chuyen_Nganh;
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
	@Override
	public String toString() {
		return "Sinh_Vien [ten=" + ten + ", email=" + email + ", chuyen_Nganh=" + chuyen_Nganh + "]";
	}
	
	

}
