package Bai10;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số phần tử của danh sách sinh viên: ");
        int n = scanner.nextInt();
        ArrayList<Student> listStudent = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào mã sinh viên: ");
            int id = scanner.nextInt();
            System.out.print("Nhập vào tên sinh viên: ");
            String name = scanner.next();
            System.out.print("Nhập vào điểm trung bình: ");
            double gpa = Double.parseDouble(scanner.next());
            listStudent.add(new Student(id, name, gpa));
        }

        do {
            System.out.println("------------------------MENU CHÍNH--------------------------------");
            System.out.println("1. In ra danh sách sinh viên");
            System.out.println("2. Tìm kiếm sinh viên theo tên");
            System.out.println("3. Phân loại sinh viên theo gpa");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.next());
            switch (choice) {
                case 1:
                    ListIterator<Student> listIterator = listStudent.listIterator();
                    while (listIterator.hasNext()) {
                        System.out.println(listIterator.next().toString());
                    }
                    break;
                case 2:
                    int count = 0;
                    System.out.print("Nhập vào mã sinh viên cần tìm: ");
                    int id = scanner.nextInt();
                    for (int i = 0; i < listStudent.size(); i++) {
                        if (listStudent.get(i).getId() == id) {
                            System.out.println(listStudent.get(i).toString());
                            count++;
                        }
                    }
                    if (count == 0) {
                        System.out.println("Không tìm thấy sinh viên có mã " + id);
                    }
                    break;
                case 3:
                    for (int i = 0; i < listStudent.size(); i++) {
                        System.out.println(listStudent.get(i).toString());
                        if (listStudent.get(i).getGpa() >= 8.5) {
                            System.out.println("Xếp loại: Xuất sắc");
                        } else if (listStudent.get(i).getGpa() >= 7.0) {
                            System.out.println("Xếp loại: Giỏi");
                        } else if (listStudent.get(i).getGpa() >= 5.5) {
                            System.out.println("Xếp loại: Khá");
                        } else {
                            System.out.println("Xếp loại: Trung bình/Yếu");
                        }
                        System.out.println("------------------------------------");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn 1 - 4");
            }
        }while (true);
    }

}
