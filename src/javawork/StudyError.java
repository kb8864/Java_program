package javawork;

public class StudyError {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        int sampleInt;
        sampleInt = arr(3, 0);
        System.out.println("戻り値 = " + sampleInt);
    }
 
    public static int arr(int num1, int num2) {
        try {
            int quotient = num1 / num2;
            
            return quotient;
 
        } catch (ArithmeticException e) {
            System.out.println("例外が発生しました。");
            System.out.println(e);
 
            return 0;
        }
    }
 
}