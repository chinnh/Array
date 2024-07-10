import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mảng đã cho là");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Nhập phần tử cần thêm");
        int x = sc.nextInt();
        System.out.println("Nhập vị trí muốn thêm");
        int index = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }
        if (index <= -1 || index >= n) {
            System.out.println("Phần tử " + x + " không thể thêm vào vị trí " + index);
        } else {
            int[] newArr = new int[n + 1];
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            newArr[index] = x;
            for (int i = index; i < n; i++) {
                newArr[i + 1] = arr[i];
            }
            System.out.println("Mảng sau khi đã thêm phần tử " + x);
            for (int i = 0; i < newArr.length; i++) {
                System.out.print(newArr[i] + " ");
            }
        }
        sc.close();
    }
}
