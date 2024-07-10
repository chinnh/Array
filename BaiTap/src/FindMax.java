import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập kích thước mảng");
            size = sc.nextInt();
            if(size > 20) {
                System.out.println("Mảng không được quá 20 phần tử");
            }
        }while(size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhập phần tử " + (i + 1));
            array[i] = sc.nextInt();
            i++;
        }
        System.out.println("Các phần tử đã nhập là ");
        for(int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
        int max = array[0];
        int index = 1;
        for(int j = 0; j < array.length; j++) {
            if(array[j] > max) {
                max = array[j];
                index = j;
            }
        }
        System.out.println("Giá trị lớn nhất trong danh sách là " + max + " tại vị trí " + index);
    }
}
