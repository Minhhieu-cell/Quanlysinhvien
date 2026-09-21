
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
sc.nextLine();
Sinhvien1 sv = new Sinhvien1(maSV, hoTen, diem);
System.out.println("\n--- THONG TIN SINH VIEN ---");
sv.hienThi();
System.out.print("\nNhap ma sinh vien can tim: ");
String maCanTim = sc.nextLine();

if (sv.timKiem(maCanTim)) {
    System.out.println("Tim thay sinh vien!");
    sv.hienThi();
} else {
    System.out.println("Khong tim thay sinh vien!");
}
    }
    
}
