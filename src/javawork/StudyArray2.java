package javawork;

public class StudyArray2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] name = {"山田", "田中", "佐藤","高橋"};
		double[] height = {170.2, 183.3, 175.7};
		double sum = 0;//身長の合計
		
		try {
		for(int i = 0; i < name.length; i++) {
			System.out.println(name[i] + ":" + height[i] + "cm");
			sum = sum + height[i];
		}
		System.out.println("平均身長:" + sum/name.length);

	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("名前と身長のデータ数がちがいます。");
		System.out.println(e.getMessage());
	}
	}

}
