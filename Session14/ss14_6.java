import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Patient {
    private String name;
    private int age;
    private String department; 

    public Patient(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name + " (tuổi " + age + ")";
    }
}

public class ss14_6 {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Lan", 30, "Tim mạch"));
        patients.add(new Patient("Hùng", 45, "Nội tiết"));
        patients.add(new Patient("Mai", 28, "Tim mạch"));
        patients.add(new Patient("An", 50, "Hô hấp"));
        patients.add(new Patient("Bình", 60, "Tim mạch"));

        Map<String, List<Patient>> departmentMap = new HashMap<>();

        for (Patient p : patients) {
            String dept = p.getDepartment();
            if (!departmentMap.containsKey(dept)) departmentMap.put(dept, new ArrayList<>());
            departmentMap.get(dept).add(p);
        }

        System.out.println("Danh sách bệnh nhân theo khoa:");
        for (Map.Entry<String, List<Patient>> entry : departmentMap.entrySet()) {
            String deptName = entry.getKey();
            List<Patient> deptPatients = entry.getValue();
            System.out.println("- Khoa " + deptName + ":");
            for (Patient p : deptPatients) System.out.println("  + " + p);
        }

        String khoaCanXem = "Tim mạch";
        System.out.println("\nBệnh nhân tại khoa " + khoaCanXem + ":");
        List<Patient> listKhoa = departmentMap.get(khoaCanXem);
        if (listKhoa != null) {
            for (Patient p : listKhoa) System.out.println("  + " + p);
        } else System.out.println("  (Không có bệnh nhân nào)");

        String busiestDept = null;
        int maxCount = 0;

        for (Map.Entry<String, List<Patient>> entry : departmentMap.entrySet()) {
            String deptName = entry.getKey();
            int count = entry.getValue().size();
            if (count > maxCount) {
                maxCount = count;
                busiestDept = deptName;
            }
        }

        if (busiestDept != null) System.out.println("\nKhoa đông bệnh nhân nhất: " + busiestDept + " (" + maxCount + " bệnh nhân)");
        else System.out.println("\nKhông có khoa nào trong danh sách.");
    }
}
