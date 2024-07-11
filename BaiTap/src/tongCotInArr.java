import java.util.Scanner;

public class tongCotInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Số hàng của mảng");
        int hang = sc.nextInt();
        System.out.println("Số cột của mảng");
        int cot = sc.nextInt();
        int[][] arr = new int[hang][cot];
        System.out.println("Nhập giá trị cho mảng");
        for (int i = 0; i < hang; i++) {
            for(int j = 0; j < cot; j++) {
                System.out.println("Giá trị [" + i + "][" + j + "]");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Bạn muốn tính tổng ở cột nào");
        int tinh = sc.nextInt();
        int tongCot = 0;
        for (int i = 0; i < arr.length; i++) {
            tongCot += arr[i][tinh];
        }
        System.out.println("Tổng của cột " + tinh + " là " + tongCot);
    }
}
