package ex3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args)

	{
		int day, month, year;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Nhap thang : ");
			month = sc.nextInt();
			if (month < 1 || month > 12)
				System.out.println("Nhap thang la 1 so nguyen tu 1 - 12! ");
		} while (month < 1 || month > 12);
		do {
			System.out.print("Nhap nam : ");
			year = sc.nextInt();
			if (year < 0)
				System.out.println("Nhap nam la 1 so nguyen duong! ");
		} while (year < 0);
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			day = 31;
		else if (month == 2) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				day = 29;
			else
				day = 28;
		} else
			day = 30;
		System.out.println("Thang " + month + " nam " + year + " co: " + day + " ngay!");
	}
}
