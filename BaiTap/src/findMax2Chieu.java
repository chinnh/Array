import java.util.Scanner;

public class findMax2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng của ma trận");
        int hang = sc.nextInt();
        System.out.println("Nhập số cột của ma trận");
        int cot = sc.nextInt();
        int[][] matrix = new int[hang][cot];
        System.out.println("Nhập giá trị");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.println("Phần tử [ " + i + " ] [ " + j + "]");
                matrix[i][j] = sc.nextInt();
            }
        }
        int max = matrix[0][0];
        int maxHang = 0;
        int maxCot = 0;
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxHang = i;
                    maxCot = j;
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong ma trân từ người dùng là " + max + " tại vị trí " + maxHang + " " + maxCot);
        sc.close();
    }
}
