
package quanlysinhvien;
public class Sinhvien1 {
    String maSV;
    String hoTen;
    double diem;
    
    public Sinhvien1(String maSV, String hoTen, double diem){
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diem = diem;
    }
     public void hienThi() {
        System.out.println("Ma SV: " + maSV);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Diem: " + diem);
     }
     public boolean timKiem(String maCanTim) {
             return maSV.equalsIgnoreCase(maCanTim);
     }
             public String xepLoai() {
    if (diem >= 8) {
        return "Gioi";
    } else if (diem >= 6.5) {
        return "Kha";
    } else if (diem >= 5) {
        return "Trung binh";
    } else {
        return "Yeu";
    }
}
}
