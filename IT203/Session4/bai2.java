import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String description = "Sách lập trình Java cơ bản, Kệ: A12, dành cho người mới bắt đầu.";
        if(description.contains("Kệ")){
            int start=description.indexOf("Kệ")+4;
            int end=description.indexOf(",",start);
            System.out.println("vi tri tim thay:"+description.substring(start,end));
        }
        String newdescription=description.replace("Kệ","Vị trí lưu trữ");
        System.out.println(newdescription);
    }
}
