import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int legitPoints = 100;

        while(true) {
            System.out.print("Nhap so ngay tre tra sach: ");
            int pointReturnBooks = sc.nextInt();
            if(pointReturnBooks == 999) {
                break;
            }else if(pointReturnBooks <= 0) {
                legitPoints += 5;
            }else{
                legitPoints -= (pointReturnBooks*2);
            }
        }
        if(legitPoints >= 120) {
            System.out.print("Doc gia than thiet");
        }else if(legitPoints >= 80) {
            System.out.print("Doc gia binh thuong");
        }else{
            System.out.print("Doc gia can luu y");
        }
    }
}
