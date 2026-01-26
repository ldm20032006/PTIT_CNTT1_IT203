import java.util.Scanner;
public class bai3 {
   public static void main(String[] args){
      String book1 = "Java Basic";
      String book2 = "Python Intro";
      String temp=book2;
      book2=book1;
      book1=temp;
      System.out.println(book1);
      System.out.println(book2);
   }
}
//Heap:
//Không tạo thêm String mới
//Các object "Java Basic" và "Python Intro" tồn tại xuyên suốt
//String là immutable → nội dung không bị thay đổi
//Stack:
//Chỉ thay đổi tham chiếu của các biến book1, book2, temp
//Hoán đổi thực chất là đổi hướng trỏ