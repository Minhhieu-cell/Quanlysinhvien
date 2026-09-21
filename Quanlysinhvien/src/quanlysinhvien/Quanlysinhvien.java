
package quanlysinhvien;
import java.util.Scanner;
public class Quanlysinhvien {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

System.out.print("Nhap ma sinh vien: ");
String maSV = sc.nextLine();

System.out.print("Nhap ho ten: ");
String hoTen = sc.nextLine();

System.out.print("Nhap diem: ");
double diem = sc.nextDouble();

Sinhvien1 sv = new Sinhvien1(maSV, hoTen, diem);

System.out.println("\n--- THONG TIN SINH VIEN ---");
sv.hienThi();

    }
    
}
