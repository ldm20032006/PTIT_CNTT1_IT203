import java.util.Scanner;
public class bai3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so Sach muon tra:");
        int total=0;
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            System.out.printf("Nhập số ngày trễ của cuốn sách thứ %d:",i);
            int b=sc.nextInt();
            total+=b*5000;
        }
        System.out.printf("tong tien phai tra:%d VND",total);
    }
}