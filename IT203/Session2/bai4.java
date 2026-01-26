import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Moi ban nhap ma sach phai >0:");
        int a=sc.nextInt();
        while (a<=0){
            System.out.println("loi :ID Phai la so duong");
            System.out.print("Moi ban nhap lai ma sach phai >0:");
            a=sc.nextInt();
        }
        System.out.printf("Xac nhan:Ma sach %d da duoc ghi nhan.",a);
    }
}
