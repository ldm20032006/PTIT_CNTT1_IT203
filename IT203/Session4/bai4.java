import java.util.Scanner;
import java.util.regex.Matcher;
public class bai4 {
    public static void main(String[] args) {
       String regex="^[A-Z]{2}\\d{4}[0-9]{5}$";
       Scanner sc = new Scanner(System.in);
       String code=sc.nextLine();
       if(code.matches(regex)){
           System.out.println("ma hop le");
       }else{
           System.out.println("ma khong hop le");
       }
    }
}
