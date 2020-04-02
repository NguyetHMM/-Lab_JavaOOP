package ex2;

import javax.swing.JOptionPane;

class Point {
	private String tenDiem;
	private double hoanhDo, tungDo;

	// khoi tao khong tham so
	public Point() {
		setTenDiem("A");
		setTungDo(0.0);
		setHoanhDo(0.0);
	}

	// khoi tao ham hai tham so hoanh do va tung do
	public Point(double hoanh, double tung) {
		setTenDiem("Noname");
		setTungDo(tung);
		setHoanhDo(hoanh);
	}

	// khoi tao ham ba tham so ten diem, tung do, hoanh do
	public Point(String ten, double tung, double hoanh) {
		setTenDiem(ten);
		setTungDo(tung);
		setHoanhDo(hoanh);
	}

	public void setTenDiem(String ten) {
		tenDiem = ten;
	}

	public void setTungDo(double tung) {
		tungDo = tung;
	}

	public void setHoanhDo(double hoanh) {
		hoanhDo = hoanh;
	}

	public String getTenDiem() {
		return tenDiem;
	}

	public double getTungDo() {
		return tungDo;
	}

	public double getHoanhDo() {
		return hoanhDo;
	}

	public void nhap() {
		String strTenDiem, strTung, strHoanh;
		double dTung, dHoanh;
		strTenDiem = JOptionPane.showInputDialog(null, "Nhap ten diem: ", JOptionPane.INFORMATION_MESSAGE);
		setTenDiem(strTenDiem);
		strTung = JOptionPane.showInputDialog(null, "Nhap tung do: ", JOptionPane.INFORMATION_MESSAGE);
		dTung = Double.parseDouble(strTung);
		setTungDo(dTung);
		strHoanh = JOptionPane.showInputDialog(null, "Nhap hoanh do: ", JOptionPane.INFORMATION_MESSAGE);
		dHoanh = Double.parseDouble(strHoanh);
		setHoanhDo(dHoanh);
	}

	public void hienThi() {
		JOptionPane.showMessageDialog(null, "Point: " + getTenDiem() + "(" + getTungDo() + "," + getHoanhDo() + ")");
	}
}
