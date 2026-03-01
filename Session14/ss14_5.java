import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Patient {
    private String name;
    private int severity;
    private int arrivalTime;

    public Patient(String name, int severity, int arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    public String getName() {
        return name;
    }

    public int getSeverity() {
        return severity;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    private String severityText() {
        return switch (severity) {
            case 1 -> "Nguy kịch";
            case 2 -> "Nặng";
            case 3 -> "Nhẹ";
            default -> "Không rõ";
        };
    }

    @Override
    public String toString() {
        return "Bệnh nhân " + name + " (Mức " + severity + " - " + severityText() + ", đến lúc " + formatTime(arrivalTime) + ")";
    }

    private String formatTime(int time) {
        int hour = time / 100;
        int minute = time % 100;
        return String.format("%02d:%02d", hour, minute);
    }
}

public class ss14_5 {
    public static void main(String[] args) {
        Comparator<Patient> patientComparator = (p1, p2) -> {
            if (p1.getSeverity() != p2.getSeverity()) return Integer.compare(p1.getSeverity(), p2.getSeverity());
            return Integer.compare(p1.getArrivalTime(), p2.getArrivalTime());
        };
        Set<Patient> queue = new TreeSet<>(patientComparator);
        Patient a = new Patient("A", 3, 800);
        Patient b = new Patient("B", 1, 815);
        Patient c = new Patient("C", 1, 805);
        queue.add(a);
        queue.add(b);
        queue.add(c);

        System.out.println("Thứ tự xử lý cấp cứu:");
        for (Patient p : queue) System.out.println(p);
    }
}