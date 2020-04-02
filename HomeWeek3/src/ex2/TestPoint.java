package ex2;

import ex2.Point;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Goi ham tao khong tham so
		Point obj1 = new Point();
		obj1.hienThi();

		//Goi ham khoi tao 2 tham so
		Point obj2 = new Point(-8.9, 99);
		obj2.hienThi();
		
		//Goi ham khoi tao 3 tham so
		Point obj3 = new Point("N", 22.2, 20.20);
		obj3.hienThi();
		Point obj4 = new Point();
		obj4.nhap();
		obj4.hienThi();

	}

}
