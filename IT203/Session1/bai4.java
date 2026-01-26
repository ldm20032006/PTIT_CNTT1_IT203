import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá sách (USD): ");
        double giaSach = sc.nextDouble();
        float tygia = 25000;
        double tongTien=tygia*giaSach;
        long tongTienVND = (long) tongTien;
        System.out.printf("Giá chính xác (số thực): %.3E%n", tongTien);
        System.out.println("Tổng tiền (VND): " + tongTienVND);
    }
}
