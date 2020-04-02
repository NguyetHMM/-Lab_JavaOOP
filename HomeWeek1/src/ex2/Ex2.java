package ex2;

import javax.swing.JOptionPane;

public class Ex2 {
	public static void main(String[] args) {
		boolean check = true;
		double tong = 0;
		do {
			double st1;
			String tongHT;
			String strHienThi = "Tong cua cac so da nhap la: ";
			st1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhap so thuc: ", JOptionPane.INFORMATION_MESSAGE));
			tong = tong + st1;
			tongHT = String.valueOf(tong);
			strHienThi += tongHT;
			int chon;
			chon = JOptionPane.showConfirmDialog(null, "Ban muon tiep tuc?");
			if (chon == JOptionPane.YES_OPTION) {
		
			} else {
			
				JOptionPane.showMessageDialog(null, strHienThi, "Tong", JOptionPane.INFORMATION_MESSAGE);
				check =false;
			System.exit(0);
			}
		} while (check);

	}

}

