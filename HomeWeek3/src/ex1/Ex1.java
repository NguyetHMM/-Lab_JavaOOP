package ex1;

import java.util.*;

public class Ex1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// cau a
		System.out.println("Nhap mot dong chu:");
		String s = sc.nextLine();
		System.out.println("Dong vua nhap: " + s);

		// cau b
		System.out.println("Nhap so thu nhat:");
		int a = sc.nextInt();
		System.out.println("Nhap so thu hai:");
		int b = sc.nextInt();
		System.out.println("Tong hai so: a+b= " + (a + b));
		System.out.println("Hieu hai so: a-b= " + (a - b));
		System.out.println("Tich hai so: ab= " + (a * b));
		if (b == 0)
			System.out.println("Khong ton tai thuong a/b");
		else
			System.out.println("Thuong a/b= " + (a / b));

		// cau c
		System.out.println("Nhap so nguyen:");
		int a2 = sc.nextInt();
		System.out.println("Nhap so thuc:");
		float b2 = sc.nextFloat();
		System.out.println("Nhap so thuc:");
		double c2 = sc.nextDouble();
		System.out.println("So vua nhap la: "+a2 +";"+b2+";"+c2);
		//nextByte(), nextInt(),nextShort(),nextLong() 
		//nextFloat(), nextDouble(), nextBoolean()
	}
}
