package bai6;

public class Person {
	private String email;
	private String ten;
	private int tuoi;
	private String gioitinh;
	private String sdt;
	private String diachi;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	@Override
	public String toString() {
		return "Person [email=" + email + ", ten=" + ten + ", tuoi=" + tuoi + ", gioitinh=" + gioitinh + ", sdt=" + sdt
				+ ", diachi=" + diachi + "]";
	}
	public Person(String email, String ten, int tuoi, String gioitinh, String sdt, String diachi) {
		this.email = email;
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioitinh = gioitinh;
		this.sdt = sdt;
		this.diachi = diachi;
	}
	

}
