package javawork;
import java.time.LocalDate; // 現在年を取得するため

public class StudyIf {

    public static void main(String[] args) {
        int umare = 1999;
        System.out.println(umare + "年生まれの人は、" + judge(umare) + " " + ageCategory(umare) + "です。");
    }

    static String judge(int umare) {
        if (umare < 1989) {
            return "昭和よりも以前に生まれて";
        } else if (umare < 2019) {
            return "平成生まれで";            
        } else if (umare == 2019) {
            return "令和元年生まれの人で";            
        } else {
            return "令和の人で";    
        }
    }

    static String ageCategory(int umare) {
        int currentYear = LocalDate.now().getYear(); // 現在の年を取得
        int age = currentYear - umare; // 年齢を計算

        if (age < 20) {
            return "未成年";
        } else {
            return "成人";
        }
    }
}