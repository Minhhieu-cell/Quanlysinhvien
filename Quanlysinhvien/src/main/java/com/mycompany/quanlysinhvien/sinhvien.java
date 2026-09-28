
package com.mycompany.quanlysinhvien;
import java.util.Scanner;
public class sinhvien {
    private String maSV, hoTen;
    private float diem;

    public sinhvien() {
    }

    public sinhvien(String maSV, String hoTen, float diem) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public float getDiem() {
        return diem;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }
public void nhap(Scanner sc)
{
    System.out.print("Mã sinh viên: ");
    maSV=sc.nextLine();
    System.out.print("Họ và tên: ");
    hoTen=sc.nextLine();
    System.out.print("Điểm: ");
    diem=sc.nextFloat();
    
}
}
