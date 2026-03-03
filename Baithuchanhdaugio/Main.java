import java.util.*;

public class Main {
    public static void main(String[] args) {

        ProductRepository repo = new ProductRepository();

        // Thêm sản phẩm
        repo.add(new ElectronicProduct("E01", "Laptop", 15000000, 24));
        repo.add(new ElectronicProduct("E02", "Tai nghe", 2000000, 6));
        repo.add(new FoodProduct("F01", "Bánh", 50000, 10));
        repo.add(new FoodProduct("F02", "Sữa", 30000, 5));

        // Hiển thị danh sách
        System.out.println("=== DANH SÁCH SẢN PHẨM ===");
        for (Product p : repo.findAll()) {
            p.displayInfo();
            System.out.println("Thành tiền: " + p.calculateFinalPrice());
            System.out.println("---------------------");
        }

        // Tìm theo ID
        System.out.println("=== TÌM SẢN PHẨM E01 ===");
        Product found = repo.findById("E01");
        if (found != null) {
            found.displayInfo();
        } else {
            System.out.println("Không tìm thấy");
        }

        // Sắp xếp theo giá tăng dần
        System.out.println("=== SẮP XẾP THEO GIÁ TĂNG DẦN ===");
        List<Product> sortedList = new ArrayList<>(repo.findAll());

        Collections.sort(sortedList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });

        for (Product p : sortedList) {
            p.displayInfo();
            System.out.println("Thành tiền: " + p.calculateFinalPrice());
            System.out.println("---------------------");
        }

        // Thống kê số lượng theo loại
        System.out.println("=== THỐNG KÊ ===");
        Map<String, Integer> statistics = new HashMap<>();

        for (Product p : repo.findAll()) {
            String type = "";

            if (p instanceof ElectronicProduct) {
                type = "Electronic";
            } else if (p instanceof FoodProduct) {
                type = "Food";
            }

            statistics.put(type, statistics.getOrDefault(type, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : statistics.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
