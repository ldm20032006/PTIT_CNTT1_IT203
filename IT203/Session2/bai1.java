import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so tuoi cua ban:");
        int a = sc.nextInt();
        System.out.print("nhap so sach muon muon:");
        int b = sc.nextInt();
        if(a<18){
            System.out.println("ket qua : khong du dieu kien");
            System.out.println("-ban chua du 18 tuoi");
        } else if (b>3) {
            System.out.println("ket qua : khong du dieu kien");
            System.out.println("-ban da muon toi da 3 cuon");
        }else {
            System.out.println("ket qua : ban da du dieu kiemn muon sach quy hiem");
        }
    }
}