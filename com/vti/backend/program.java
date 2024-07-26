package com.vti.backend;

import java.util.Scanner;

import javax.swing.text.Position;

public class program {
//	Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
//	cách 1
//	public static void main (String args[]) {
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Mời bạn nhập 3 số nguyên");
//		if(scan.hasNextInt()) {
//			int songuyen1 = scan.nextInt();
//			System.out.println("Số nguyên 1: " + songuyen1);
//			int songuyen2 = scan.nextInt();
//			System.out.println("Số nguyên 2: " + songuyen2);
//			int songuyen3 = scan.nextInt();
//			System.out.println("Số nguyên 3: " + songuyen3);
//		}else {
//			System.out.println("Vui lòng nhập số nguyên");
//		}
//		
	
//		Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình
//	public static void main(String args[]) {
//		Scanner scan2 = new Scanner(System.in);
//		System.out.println("Mời bạn nhập 2 số thực");
//		if(scan2.hasNextDouble()) {
//			double sothuc1 = scan2.nextDouble();
//			System.out.println("Số thực 1: " + sothuc1);
//			double sothuc2 = scan2.nextDouble();
//			System.out.println("Số thực 2: " + sothuc2);
//		
//	}else {
//		System.out.println("Vui lòng nhập số thực");
//	}
//	
	
	
//	Viết lệnh cho phép người dùng nhập họ và tên
//	public static void main(String args[]) {
//		Scanner scan3 = new Scanner(System.in);
//		System.out.println("Vui lòng nhập Họ và Tên");
//		String hovaten = scan3.nextLine();
//		
////		Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ		
//		System.out.println("Vui lòng nhập ngày sinh");
//		String dateofbirth = scan3.nextLine();
		
//	}
//	Question 5:
//	Viết lệnh cho phép người dùng tạo account (viết thành method)
//	Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào
//	chương trình sẽ chuyển thành Position.Dev, Position.Test,
//	Position.ScrumMaster, Position.PM
	public static Account createAccount() {
        Scanner scanner = new Scanner(System.in);

     
        System.out.println("Nhập vị trí (1: Dev, 2: Test, 3: ScrumMaster, 4: PM):");
        int positionInput = scanner.nextInt();
        Position position = null;

        switch (positionInput) {
            case 1:
                position = Position.Dev;
                break;
            case 2:
                position = Position.Test;
                break;
            case 3:
                position = Position.ScrumMaster;
                break;
            case 4:
                position = Position.PM;
                break;
            default:
                System.out.println("Vị trí không hợp lệ. Vui lòng nhập lại.");
                System.exit(1);
        }
        }
		
	}

	
	
	
	

}
