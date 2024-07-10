import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Mảng : là 1 biến đặc biệt tham chiếu đến 1 danh sách các phần tử liên quan đến nhau
        Mảng trong java là mảng tĩnh, không thể thay đổi length và không có các hàm có sẵn như js
        ArrayList :
         */
        int a = 10;
        int[] numbers = {1, 4, 6, 10, 20};
        //Index          0  1  2   3   4
        //Phần tử là các gi trị nằm tại vị trí tương ứng : numbers[0]
        System.out.println("Phần tử 0 : " + numbers[4]);
        System.out.println("Độ dài mảng : " + numbers.length);
        //Cách duyệt mảng
        //Fori
        System.out.println("Duyệt mảng");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Phần tử tại vị trí " + i + " là " + numbers[i]);
        }
        //For each
        System.out.println("Duyệt mảng for each : ");
        for(int item : numbers) {
            System.out.println("Phần tử : " + item);
        }
        System.out.println("-----------------");
        double[] numbers2 = new double[10]; //{0.0, 0.0, 0.0, ... 0.0}
        /*
        Khi khởi tạo theo kiểu này, giá trị của các phần tử là giá trị mặc định tương ứng với kiểu dữ liệu
        vd : double : 0.0, int : 0, boolean : false, String : null,...
         */
        System.out.println(Arrays.toString(numbers2));
        // Tạo tay các hàm thêm, chèn, sửa, xóa phần tử vào 1 mảng trong java
    }
}