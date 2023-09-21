package tendiem;

public class ten {
	private String ten;
	private float diemchuyencan;
	private float diemgiuaky;
	private float diemcuoiky;
	private float diemhocphan;
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public float getDiemchuyencan() {
		return diemchuyencan;
	}
	public void setDiemchuyencan(float diemchuyencan) {
		this.diemchuyencan = diemchuyencan;
	}
	public float getDiemgiuaky() {
		return diemgiuaky;
	}
	public void setDiemgiuaky(float diemgiuaky) {
		this.diemgiuaky = diemgiuaky;
	}
	public float getDiemcuoiky() {
		return diemcuoiky;
	}
	public void setDiemcuoiky(float diemcuoiky) {
		this.diemcuoiky = diemcuoiky;
	}
	public ten(String ten, float diemchuyencan, float diemgiuaky, float diemcuoiky) {
		this.ten = ten;
		this.diemchuyencan = diemchuyencan;
		this.diemgiuaky = diemgiuaky;
		this.diemcuoiky = diemcuoiky;
	}
	@Override
	public String toString() {
		return "ten [ten=" + ten + ", diemchuyencan=" + diemchuyencan + ", diemgiuaky=" + diemgiuaky + ", diemcuoiky="
				+ diemcuoiky + "]";
	}
	public ten(float diemhocphan) {
	this.diemhocphan = diemhocphan;
	}
	public float getDiemhocphan() {
		return diemhocphan = (float) (0.1*this.diemchuyencan + 0.2*this.diemgiuaky + 0.7*this.diemcuoiky) ;
	}
	
	

}
