import java.time.LocalDate;

public class bai3 {
    public static void main(String[] args) {

        String[] bookIds = {"B001", "B002", "B003", "B004", "B005"};
        String[] borrowDates = {
                "01/01/2026", "02/01/2026",
                "03/01/2026", "04/01/2026", "05/01/2026"
        };
        long startSB = System.nanoTime();

        StringBuilder report = new StringBuilder();
        report.append("--- BÁO CÁO MƯỢN SÁCH ---\n");
        report.append("Thời gian tạo báo cáo: ")
                .append(LocalDate.now())
                .append("\n");

        for (int i = 0; i < bookIds.length; i++) {
            report.append("Giao dịch: ")
                    .append(bookIds[i])
                    .append(" - ")
                    .append(borrowDates[i])
                    .append("\n");
        }

        long endSB = System.nanoTime();

        System.out.println(report.toString());
        long startStr = System.nanoTime();

        String reportStr = "--- BÁO CÁO MƯỢN SÁCH ---\n";
        reportStr += "Thời gian tạo báo cáo: " + LocalDate.now() + "\n";

        for (int i = 0; i < bookIds.length; i++) {
            reportStr += "Giao dịch: " + bookIds[i] +
                    " - " + borrowDates[i] + "\n";
        }

        long endStr = System.nanoTime();
        System.out.println("Số thời gian thực thi với StringBuilder: "
                + (endSB - startSB));
        System.out.println("Số thời gian thực thi với String: "
                + (endStr - startStr));
    }
}
