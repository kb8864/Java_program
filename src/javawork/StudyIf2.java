package javawork;

public class StudyIf2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        int umare = 2030;

        System.out.println(umare + "年生まれの人は、");

        if (umare < 1989) {
            if (umare < 1964) {
                System.out.println("昭和39年以前の人で、昭和の前半の人です。");
            } else {
                System.out.println("昭和40年から昭和64年の間の人で、昭和の後半の人です。");
            }
        } else if (umare < 2019) {
            if (umare < 2000) {
                System.out.println("平成の人で、平成の前半の人です。");
            } else {
                System.out.println("平成の人で、平成の後半の人です。");
            }
        } else if (umare == 2019) {
            System.out.println("令和元年の人です。");
        } else {
            if (umare < 2030) {
                System.out.println("令和の人で、令和の初期の人です。");
            } else {
                System.out.println("令和の人で、将来、令和の中期以降になる人です。");
            }
        }

	}

}
