package ex3;

import ex3.MyDate;

public class TestMyDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate obj1 = new MyDate();
		obj1.hienThi();

		MyDate obj2 = new MyDate(8, 9, 1999);
		obj2.hienThi();

		MyDate obj3 = new MyDate();
		obj3.nhap();
		obj3.hienThi();
	}

}
