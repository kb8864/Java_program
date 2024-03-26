package javawork;

public class StudyError {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        try {
            int result = divide(10, 0); 
            System.out.println("結果: " + result);
        } catch (ArithmeticException e) {
            System.out.println("エラーが発生しました: 0で割ることはできません。");
        }
    }

    // 2つの整数の除算を行うメソッド。除算の結果を返す。
    public static int divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("分母が0です。");
        }
        return numerator / denominator;
    }
}