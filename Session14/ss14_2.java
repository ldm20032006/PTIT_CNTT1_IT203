import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ss14_2 {
    public static void main(String[] args) {
        Map<String, String> listDrug = new HashMap<>();
        listDrug.put("T01", "Paracetamol");
        listDrug.put("T02", "Ibuprofen");
        listDrug.put("T03", "Amoxicillin");
        listDrug.put("T04", "Vitamin C");
        listDrug.put("T05", "Cetirizine");

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã thuốc: ");
        String id = sc.nextLine().trim();

        if (listDrug.containsKey(id)) {
            String name = listDrug.get(id);
            System.out.println("Tên thuốc: " + name);
        } else System.out.println("Thuốc không tồn tại");
    }
}