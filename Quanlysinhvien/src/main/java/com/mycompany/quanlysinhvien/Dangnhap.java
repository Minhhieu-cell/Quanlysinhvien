
package com.mycompany.quanlysinhvien;
import java.util.Scanner;
public class Dangnhap {
    public static void main(String[] args){
        
    Scanner sc= new Scanner(System.in);   
    System.out.print("Nhap tai khoan: ");
    String taiKhoan = sc.nextLine();
    
    System.out.print("Nhap mat khau: ");
    String matKhau = sc.nextLine();
    
    if (taiKhoan.equals("admin") && matKhau.equals("123")) {
        System.out.println("Dang nhap mat khau thanh cong!");
} else {
    System.out.println("Sai tai khoan hoac mat khau!");
    }
    }
}
