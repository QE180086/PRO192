package Du_An_PRO192;

import java.util.Objects;

public class Giang_Vien {
	private String ten;
	private String email;
	private String mon_Giang_Day;
	public Giang_Vien(String ten, String email, String mon_Giang_Day) {
		this.ten = ten;
		this.email = email;
		this.mon_Giang_Day = mon_Giang_Day;
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
	
	public String getMon_Giang_Day() {
		return mon_Giang_Day;
	}
	public void setMon_Giang_Day(String mon_Giang_Day) {
		this.mon_Giang_Day = mon_Giang_Day;
	}
	@Override
	public String toString() {
		return "Giang_Vien [ten=" + ten + ", email=" + email + ", mon_Giang_Day=" + mon_Giang_Day + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, mon_Giang_Day, ten);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Giang_Vien other = (Giang_Vien) obj;
		return Objects.equals(email, other.email) && Objects.equals(mon_Giang_Day, other.mon_Giang_Day)
				&& Objects.equals(ten, other.ten);
	}
	
	
	
	
	

}
