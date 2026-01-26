import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        System.out.print("Nhap Ma Sach:");
        String MaSach=Scanner.nextLine();
        System.out.print("Nhap ten Sach:");
        String TenSach=Scanner.nextLine();
        System.out.print("Nhap Nam Xuat Ban:");
        int date=Scanner.nextInt();
        Scanner.nextLine();
        System.out.print("Nhap gia Ban:");
        double price=Scanner.nextDouble();
        System.out.print("Trinh Trang:");
        boolean status=Scanner.nextBoolean();
        System.out.println("----PHIẾU THÔNG TIN SÁCH----");
        System.out.printf("Ten Sach:%s | Tuoi Tho:%d \n",TenSach,2025-date);
        System.out.printf("Ma So:%s \n",MaSach);
        System.out.printf("Gia Ban:%2\n",price);
        System.out.printf("Trang Thai:%s",status? "con sach":"het hang");
    }
}