import java.util.Scanner;

public class tongDuongCheoMTVuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Số hàng của mảng");
            int hang = sc.nextInt();
            System.out.println("Số cột của mảng");
            int cot = sc.nextInt();
            int[][] arr = new int[hang][cot];
            if (hang == cot){
                System.out.println("Nhập giá trị cho mảng");
                for (int i = 0; i < hang; i++) {
                    for(int j = 0; j < cot; j++) {
                        System.out.println("Giá trị [" + i + "][" + j + "]");
                        arr[i][j] = sc.nextInt();
                    }
                }
                int sum = 0;
                for (int i = 0; i < hang; i++) {
                    sum += arr[i][i];
                }
                System.out.println("Tổng các phần tử trên đường chéo chính là " + sum);
                break;
            }else {
                System.out.println("Vui lòng nhập hàng và cột bằng nhau");
            }
        }
        sc.close();
    }
}
