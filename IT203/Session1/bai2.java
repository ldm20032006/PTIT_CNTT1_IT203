import java.util.Scanner;
public class bai2 {
    public static void main(String[] args){
        Scanner Scanner=new Scanner(System.in);
        System.out.print("nhap so ngay cham tre:");
        int a=Scanner.nextInt();
        System.out.print("Nhap so sach muon:");
        int b=Scanner.nextInt();
        System.out.printf("so ngay cham tre:%d\n",a);
        System.out.printf("so ngay luong sach muon:%d\n",b);
        System.out.printf("Tien phat goc:%.2f VND\n",(float)a*b*5000);
        System.out.printf("Tie phat sau dieu chinh:%.2f VND\n",a>7 && b>=3 ? (float)(a*b*5000+(5000*(0.2))):(float)(a*b*5000));
    }
}
