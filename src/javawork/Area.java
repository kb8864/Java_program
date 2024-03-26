package javawork;

public class Area {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int bottom = 4; 
		 int height = 6;
		 double radius = 5.0; 
		 
		 System.out.println("面積：" + getRectangle(bottom,height) );
		 System.out.println("円の面積：" + getCircleArea(radius));

	}
	//底辺bottom、高さheightから面積を求める
	static int getRectangle(int bottom, int height) {
		return bottom * height;
	}
	
    // 半径radiusから円の面積を求める
    static double getCircleArea(double radius) {
        return Math.PI * radius * radius;//Math.PI（円周率πの値）
    }
	
}
