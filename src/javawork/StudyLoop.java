package javawork;

public class StudyLoop {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int sum = 0;
		int x = 3000;
		
		for(int i=1; i<=100; i = i + 1) {
			sum  = sum +i;
			
			if(sum > x) {
				System.out.println(i + "番目で" + x + "を超えた");
				break;
			}
		}
		System.out.println("合計：" + sum );//出力77番目で3000を超えた　合計：3003

	}

}
