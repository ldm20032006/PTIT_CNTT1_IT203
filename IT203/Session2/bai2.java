import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("moi ban nhap khu vuc(A,B,C,D):");
       String a=sc.nextLine();
       switch (a){
           case "A":
               System.out.println("Tang 1-Sach Van Hoc");
               break;
           case "B":
               System.out.println("Tang 2-Sach khoa Hoc");
               break;
           case "C":
               System.out.println("Tang 3-Sach Ngoai Ngu");
               break;
           case "D":
               System.out.println("Tang 1-Sach Tin Hoc");
               break;
           default:
               System.out.println("Ma khu vuc khong hop le");
               break;
       }

    }
}
