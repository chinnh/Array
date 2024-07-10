import java.util.Scanner;

public class TImGiaTri {
    public static void main(String[] args) {
        String[] student = {"a", "b", "c", "d", "e", "f", "g", "h"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên");
        String nhap = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(nhap)) {
                System.out.println("Vị trí trong danh sách của sinh viên " + nhap + " là " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Không có " + nhap +" trong danh sách");
        }
    }
}
