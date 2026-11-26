package Studen;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Student findById(List<Student> students, String id) {
        for (Student s : students) {
            if (s.getMaSV().equalsIgnoreCase(id.trim())) {
                return s;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("SV01", "Nguyễn Văn An", "15/08/2004"),
            new Student("SV02", "Trần Thị Bình", "20/10/2004"),
            new Student("SV03", "Lê Hoàng Minh", "02/03/2005")
        );

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã SV cần tìm: ");
        Student found = findById(students, sc.nextLine());

        if (found != null) {
            found.hienThiThongTin();
        } else {
            System.out.println("Không tìm thấy!");
        }
    }
}