import java.util.Scanner;
public class bai5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap ma sach:");
        int sumOfFirstThreeNumber=sc.nextInt();
        int unit=0;
        int sum=0;
        for(int i=0;i<4;i++){
            if(i==0){
                unit=sumOfFirstThreeNumber%10;
                sumOfFirstThreeNumber=sumOfFirstThreeNumber/10;
                continue;
            }
            int temp=sumOfFirstThreeNumber%10;
            sumOfFirstThreeNumber=sumOfFirstThreeNumber/10;
            sum+=temp;
        }
        System.out.printf("chu so kiem tra ky vong:%d\n",unit);
        System.out.printf("ket qua khiem tra ma sach:%s",unit==sum?"true":"false");
    }
}