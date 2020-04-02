package ex4;

import ex4.Complex;

public class TestComplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex obj1 = new Complex();
		obj1.inSoPhuc(obj1);

		Complex obj2 = new Complex();
		obj2.nhapSoPhuc(obj2);
		obj2.inSoPhuc(obj2);

		Complex obj3 = new Complex();
		obj3.nhapSoPhuc(obj3);
		obj3.inSoPhuc(obj3);

		Complex tong = new Complex();
		tong.congHaiSoPhuc(obj2, obj3);
		tong.inSoPhuc(tong);

		Complex hieu = new Complex();
		hieu.truHaiSoPhuc(obj2, obj3);
		hieu.inSoPhuc(hieu);

		Complex tich = new Complex();
		tich.nhanHaiSoPhuc(obj2, obj3);
		tich.inSoPhuc(tich);

		Complex thuong = new Complex();
		thuong.chiaHaiSoPhuc(obj2, obj3);
		thuong.inSoPhuc(thuong);

	}

}
