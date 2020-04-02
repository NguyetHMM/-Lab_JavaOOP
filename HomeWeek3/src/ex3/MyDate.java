package ex3;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class MyDate {

	private int ngay;
	private int thang;
	private int nam;


	public MyDate() {
		Calendar cal = Calendar.getInstance();
		setNgay(cal.get(Calendar.DAY_OF_MONTH));
		setThang(cal.get(Calendar.MONTH) + 1);
		setNam(cal.get(Calendar.YEAR));
	}
	
	public MyDate(int ngay, int thang, int nam) {
		setNgay(ngay);
		setThang(thang);
		setNam(nam);
	}

	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}
	
	public void nhap() {
		String strNgay, strThang, strNam;
		int iNgay, iThang, iNam;
		do{
			strNgay = JOptionPane.showInputDialog(null,"Nhap ngay: ",
			JOptionPane.INFORMATION_MESSAGE);
			iNgay = Integer.parseInt(strNgay); } while (iNgay < 1 || iNgay > 32);
			    setNgay(iNgay);
			do{
			strThang = JOptionPane.showInputDialog(null,"Nhap thang: ",
			JOptionPane.INFORMATION_MESSAGE);
			iThang = Integer.parseInt(strThang); } while (iThang < 1 || iThang > 12);
			    setThang(iThang);
			do{
			strNam = JOptionPane.showInputDialog(null,"Nhap nam: ",
			JOptionPane.INFORMATION_MESSAGE);
			iNam = Integer.parseInt(strNam); } while (iNam < 0);
			    setNam(iNam);
			}
			public void hienThi(){
			Calendar cal = Calendar.getInstance(); cal.set(getNam(), getThang() - 1, getNgay());
			JOptionPane.showMessageDialog(null, ((cal.get(Calendar.DAY_OF_WEEK)==1)?
			"Chu nhat":
			"Thu " + cal.get(Calendar.DAY_OF_WEEK)) + ", ngay " + getNgay() + "/"
			+ getThang() + "/" + getNam());
			}
	
	

}
