import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ss14_4 {
    public static void main(String[] args) {
        List<String> diseaseList = Arrays.asList("Cúm A", "Sốt xuất huyết", "Cúm A", "Covid-19", "Cúm A", "Sốt xuất huyết");
        Map<String, Integer> report = new TreeMap<>();
        for (String disease : diseaseList) {
            if (report.containsKey(disease)) report.put(disease, report.get(disease) + 1);
            else report.put(disease, 1);
        }
        System.out.println("Báo cáo thống kê ca bệnh:");
        for (Map.Entry<String, Integer> entry : report.entrySet()) System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
    }
}