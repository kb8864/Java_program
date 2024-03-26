package javawork;

public class StudyIf {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int umare = 2019;
			
		System.out.println(umare + "年生まれの人は、");
		
		if(umare < 1989) {
			System.out.println("昭和以前の人です。");
		}else if(umare < 2019) {
			System.out.println("平成の人です。");			
		}else if (umare == 2019) {
			System.out.println("令和元年の人です。");			
		}
		else {
			System.out.println("令和の人です。");	
		}

	}

}
