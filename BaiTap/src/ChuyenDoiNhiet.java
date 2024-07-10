import java.util.Scanner;

public class ChuyenDoiNhiet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c;
        double f;
        int choice;
        do {
            System.out.println("MENU");
            System.out.println("1. F to C");
            System.out.println("2. C to F");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn của bạn");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập độ F");
                    f = sc.nextDouble();
                    System.out.println("Sau khi chuyển đổi " + fToC(f));
                    break;
                case 2:
                    System.out.println("Nhập độ C");
                    c = sc.nextDouble();
                    System.out.println("Sau khi chuyển đổi " + cToF(c));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static double cToF(double c) {
        double f = (9 / 5) * c + 32;
        return f;
    }

    public static double fToC(double f) {
        double c = (5 / 9) * f - 32;
        return c;
    }
}
