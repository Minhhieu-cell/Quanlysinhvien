package Studen;

public class Student {
    private String maSV;
    private String hoTen;
    private String ngaySinh;

    public Student() {
    }

    public Student(String maSV, String hoTen, String ngaySinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void hienThiThongTin() {
        System.out.println("Mã SV: " + maSV);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngày thang nam sinh SV: " + ngaySinh);
        System.out.println("---------------------------");
    }
}