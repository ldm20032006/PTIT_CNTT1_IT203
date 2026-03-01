import java.util.LinkedHashSet;
import java.util.Set;

public class ss14_1 {
    public static void main(String[] args) {
        String[] inputs = {"Nguyễn Văn A – Yên Bái", "Trần Thị B – Thái Bình", "Nguyễn Văn A – Yên Bái", "Lê Văn C – Hưng Yên"};
        Set<String> danhSachGoiKham = new LinkedHashSet<>();
        for (String name : inputs) danhSachGoiKham.add(name);
        System.out.println("Danh sách gọi khám:");
        for (String name : danhSachGoiKham) System.out.println(name);
    }
}