import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] logs = {
                "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345",
                "2024-05-21 | User: TranThiB | Action: RETURN | BookID: BK12345",
                "2024-05-22 | User: LeVanC | Action: BORROW | BookID: BK67890"
        };
        String regex="^(\\d{4}-\\d{2}-\\d{2}) \\| User: ([A-Za-z]+) \\| Action: (BORROW|RETURN) \\| BookID: (BK\\d+)";
        Pattern pattern=Pattern.compile(regex);
        int BORROW=0;
        int RETURN=0;
        for (String w:logs) {
            Matcher matcher=pattern.matcher(w);
            if(matcher.find()){
                String Date=matcher.group(1);
                String User=matcher.group(2);
                String Action=matcher.group(3);
                String BookID=matcher.group(4);
                System.out.println("BOOK");
                System.out.println("Ngay:"+" "+Date);
                System.out.println("Nguoi Dung:"+" "+User);
                System.out.println("Hanh Dong:"+" "+Action);
                System.out.println("Ma Sach:"+" "+BookID);
                if(Action.equals("BORROW")){
                    BORROW+=1;
                }else {
                    RETURN+=1;
                }
            }
        }
        System.out.println("BORROW:"+BORROW);
        System.out.println("RETURN:"+RETURN);
    }
}
