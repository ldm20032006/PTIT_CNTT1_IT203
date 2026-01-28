import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai6 {
    public static String shotcut(String text,int n){
        if(text.length()<=n){
            return text;
        }
        StringBuilder newtext=new StringBuilder();
        String temp=text.substring(0,n);
        int lastindex=temp.lastIndexOf(" ");
        newtext=newtext.append(text.substring(0,lastindex)).append("...");
        return newtext.toString();
    }
    public static String replace(String [] blacklist,String text){
        String regex="(?i)\\b("+String.join("|",blacklist)+")\\b";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        StringBuilder result=new StringBuilder();
        while (matcher.find()){
            String word=matcher.group();
            String star="*".repeat(word.length());
            matcher.appendReplacement(result,star);
        }
        matcher.appendTail(result);
        return result.toString();
    }
    public static void main(String[] args) {
        String[] blacklist = {"ngu", "xau", "te", "bad"};

        String review = "San pham nay rat xau va cach phuc vu qua ngu. "
                + "Toi cam thay chat luong te va dich vu bad. "
                + "Neu co the toi se khong quay lai lan nua.";
        review=replace(blacklist,review);
        review=shotcut(review,100);
        System.out.println(review);
    }
}
