import java.util.HashSet;
import java.util.Set;

public class ss14_3 {
    public static void main(String[] args) {
        Set<String> component = new HashSet<>();
        component.add("Aspirin");
        component.add("Caffeine");
        component.add("Paracetamol");
        Set<String> allergy = new HashSet<>();
        allergy.add("Penicillin");
        allergy.add("Aspirin");
        Set<String> warningAllergy = new HashSet<>(component);
        warningAllergy.retainAll(allergy);
        Set<String> safeComponent = new HashSet<>(component);
        safeComponent.removeAll(allergy);
        System.out.println("Thành phần thuốc: " + component);
        System.out.println("Dị ứng: " + allergy);
        System.out.println("Cảnh báo dị ứng: " + warningAllergy);
        System.out.println("Thành phần an toàn: " + safeComponent);
    }
}