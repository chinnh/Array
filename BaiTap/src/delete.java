import java.util.Scanner;

public class delete {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mảng đã cho là");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Nhập phần tử cần xóa");
        int x = sc.nextInt();
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }if (index == -1){
            System.out.println("Phần tử " + x +" không có trong mảng");
        }else {
            for (int i = index; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
        }
        System.out.println("Mảng sau khi đã xóa phần tử " + x);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
