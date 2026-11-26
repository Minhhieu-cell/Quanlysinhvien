
package Main.java;

import java.util.Scanner;
import quanlysinhvien.Student;

public class Main {
    public static void main(String[] args) {
     
        Student sv1 = new Student("SV001", "Nguyễn Văn An", "15/08/2004");

        System.out.println("=== THÔNG TIN SINH VIÊN 1 ===");
        sv1.hienThiThongTin();

       
        try (Scanner scanner = new Scanner(System.in)) {
            Student sv2 = new Student();
            
            System.out.println("Nhập thông tin sinh viên 2:");
            System.out.print("Nhập mã SV: ");
            sv2.setMaSV(scanner.nextLine());
            
            System.out.print("Nhập họ tên: ");
            sv2.setHoTen(scanner.nextLine());
            
            System.out.print("Nhập ngày sinh (dd/mm/yyyy): ");
            sv2.setNgaySinh(scanner.nextLine());
            
            System.out.println("\n=== THÔNG TIN SINH VIÊN 2 ===");
            sv2.hienThiThongTin();
        }
    }

}