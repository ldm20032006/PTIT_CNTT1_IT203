import java.util.Scanner;

 class StringRegexMenu {

    // FR3: Kiểm tra chuỗi đối xứng (Valid Palindrome)
    public static void validPalindrome(Scanner sc) {
        System.out.print("Nhap chuoi can kiem tra: ");
        String str = sc.nextLine();

        // Làm sạch chuỗi: chữ thường + bỏ ký tự không phải chữ cái
        str = str.toLowerCase().replaceAll("[^a-z]", "");

        String reverse = new StringBuilder(str).reverse().toString();

        if (str.equals(reverse)) {
            System.out.println("=> Day la chuoi doi xung");
        } else {
            System.out.println("=> Day KHONG la chuoi doi xung");
        }
    }

    // FR4: Đảo ngược từ trong câu (Reverse Words)
    public static void reverseWords(Scanner sc) {
        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine();

        // Xóa khoảng trắng thừa
        str = str.trim().replaceAll("\\s+", " ");

        if (str.isEmpty()) {
            System.out.println("=> Chuoi rong");
            return;
        }

        String[] words = str.split(" ");

        int left = 0, right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        System.out.println("=> Ket qua: " + String.join(" ", words));
    }

    // Menu nhóm 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== NHOM 2: STRING & REGEX ===");
            System.out.println("1. Kiem tra chuoi doi xung");
            System.out.println("2. Dao nguoc tu trong cau");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    validPalindrome(sc);
                    break;
                case 2:
                    reverseWords(sc);
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 0);

        sc.close();
    }
}

