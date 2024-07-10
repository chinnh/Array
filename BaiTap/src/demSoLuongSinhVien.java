import java.util.Scanner;

public class demSoLuongSinhVien {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập số lượng");
            size = sc.nextInt();
            if (size > 30) {
                System.out.println("Vượt quá số sinh viên cho phép");
            }
        } while (size > 30);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Nhập điểm cho sinh viên " + (i + 1) + " ");
            arr[i] = sc.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("Danh sách điểm");
        for(int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
            if(arr[j] >= 5 && arr[j] <= 10) {
                count++;
            }
        }
        System.out.println("Số lượng sinh viên đã đạt là " + count);
    }
}
