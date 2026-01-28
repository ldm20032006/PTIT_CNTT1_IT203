//import java.util.Scanner;
//
//public class bai6 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int max=0;
//        int min=0;
//        int total=0;
//        for(int i=2;i<=8;i++){
//            if(i==8){
//                System.out.print("nhap luot muon ngay chu nhat:");
//            }else {
//                System.out.printf("nhap luot muon ngay thu %d:",i);
//            }
//            int a=sc.nextInt();
//            if(i==2) min=a;
//            if(a>max){
//                max=a;
//            }
//            if(a<min){
//                min=a;
//            }
//            total+=a;
//        }
//        System.out.printf("max=%d\n",max);
//        System.out.printf("min=%d\n",min);
//        System.out.printf("total=%d\n",total/7);
//    }
//}
