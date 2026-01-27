import java.util.Scanner;

public class bai5 {
    public static int deleteBook(int[] arr, int n, int bookid) {
        int flag = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == bookid) {
                flag = i;
                break;
            }
        }
        if (flag == -1) {
            return n;
        }
        for (int i = flag; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return n-1;
    }

    public static void printBooks(int[] arr, int n) {
        if (n == 0) {
            System.out.println("Mang rong");
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] books = {101, 102, 103, 104, 105};
        int n = 5;
        while (true){
            System.out.printf("Kho sach hien tai(%d):",books.length);
            printBooks(books,n);
            System.out.println();
            System.out.print("Nhap ma sach can xoa(0 de thoat): ");
            int bookId = sc.nextInt();
            if(bookId==0){
                break;
            }
            n=deleteBook(books,n,bookId);
            if(n==5){
                System.out.println("ma sach khong ton tai");
            }
            System.out.println("da xoa sach id"+bookId);
            System.out.printf("Kho sach hien tai(%d):",books.length);
            printBooks(books,n);
            System.out.println();

        }

    }
}
