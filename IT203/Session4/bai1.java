import java.util.Scanner;

public class bai1 {
    public static String xoakhoangtrang(String s){
        return s.trim();
    }
    public static String viethoachucaidau(String s){
        s=s.toLowerCase();
        String [] word=s.split(" ");
        String resuft="";
        for(String w:word){
            resuft+=Character.toUpperCase(w.charAt(0))+w.substring(1)+" ";
        }
        return resuft;
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