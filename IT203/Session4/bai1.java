import java.util.Scanner;

public class bai1 {
    public static String xoakhoangtrang(String s){
        return s.trim();
    }
    public static String viethoachucaidau(String s){
        s=s.toLowerCase();
        String [] word=s.split(" ");
        String result="";
        for(String w:word){
            result+=Character.toUpperCase(w.charAt(0))+w.substring(1)+" ";
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String books=sc.nextLine();
        books=xoakhoangtrang(books);
        String author=sc.nextLine();
        author=xoakhoangtrang(author);
        author=viethoachucaidau(author);
        System.out.println(books.toUpperCase()+" - "+"Tac gia: "+author);
    }
}

//import java.util.Scanner;
//
//public class bai1 {
//
//    public static String xoakhoangtrang(String s) {
//        return s.trim().replaceAll("\\s+", " ");
//    }
//
//    public static String viethoachucaidau(String s) {
//        s = xoakhoangtrang(s.toLowerCase());
//        String[] words = s.split(" ");
//        StringBuilder result = new StringBuilder();
//
//        for (String w : words) {
//            result.append(Character.toUpperCase(w.charAt(0)))
//                    .append(w.substring(1))
//                    .append(" ");
//        }
//        return result.toString().trim();
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String book = xoakhoangtrang(sc.nextLine()).toUpperCase();
//        String author = viethoachucaidau(sc.nextLine());
//        String genre = xoakhoangtrang(sc.nextLine());
//
//        System.out.println(book + " - Tác giả: " + author);
//        System.out.println("Thể loại: " + genre);
//    }
//}
