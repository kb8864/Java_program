package javawork;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        // 数字から文字に型変換
        int num = 100;
        String str = String.valueOf(num);
        String result = str + "円";
        System.out.println(result); 

        // 文字から数字に型変換
        String numberStr = "200";
        int convertedNum = Integer.parseInt(numberStr);
        System.out.println(convertedNum + 50); 
	
	}

}
