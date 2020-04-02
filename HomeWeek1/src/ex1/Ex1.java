package ex1;

import java.util.Scanner;
import java.lang.*;

public class Ex1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        do {
            int chon = -1;
            do {

                System.out.println("Phuong trinh can giai co dang: ");
                System.out.println("[1]: Bac nhat");
                System.out.println("[2]: Bac hai");
                System.out.println("[0]: Thoat");
                System.out.print(" Bạn chọn: ");
                try {
                    chon = Integer.parseInt(sc.nextLine().trim());
                } catch (Exception e) {
                }
                if (chon > 2 || chon < 0) {
                    System.out.println("Vui lòng chọn 1 hoac 2 !");
                }
            } while (chon > 2 || chon < 0);
            switch (chon) {
                case 1:
                	float a,b;
            		System.out.println("Hay nhap he so phuong trinh ban muon giai ( ax + b = 0 )");
            		Scanner sc1 = new Scanner(System.in);
            		System.out.print("a= ");
            		a = sc1.nextFloat();
            		System.out.print("b= ");
            		b = sc1.nextFloat();
                    giaiPTBacNhat(a,b);
                    break;
                case 2:
                	float a1,b1,c1;
            		System.out.println("Hay nhap he so phuong trinh ban muon giai ( ax^2 + bx + c = 0 )");
            		Scanner sc2 = new Scanner(System.in);
            		System.out.print("a= ");
            		a1 = sc2.nextFloat();
            		System.out.print("b= ");
            		b1 = sc2.nextFloat();
            		System.out.print("c= ");
            		c1 = sc2.nextFloat();
                    giaiPTBacHai(a1,b1,c1);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        } while (check);
    }
	
	
	public static void giaiPTBacNhat(float a, float b) {
		if ( a==0 && b==0 ) System.out.println("Phuong trinh co vo so nghiem!");
		else if (a==0 && b!=0) System.out.println("Phuong trinh vo nghiem!");
		else System.out.println("Phuong trinh co mot nghiem duy nhat x= "+(-b/a));
		main(null);
	}
	
	public static void giaiPTBacHai(float a, float b, float c) {
		float denta;
		if ( a==0 ) giaiPTBacNhat(b,c);
		else 
		{
			denta= b*b - 4*a*c;
			if ( denta < 0 ) System.out.println("Phuong trinh vo nghiem!");
			else if (denta ==0) System.out.println("Phuong trinh nghiem kep x1= x2= "+(-b/(2*a)));
			else System.out.println("Phuong trinh co hai nghiem phan biet x1= "+(-b+Math.sqrt(denta)/(2*a))+" va x2= "+(-b-Math.sqrt(denta)/(2*a)));
					
		}
		main(null);
	}
	
}
