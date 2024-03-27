package controller;

import beans.ItemBean;

public class Item0 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//商品１の作成
		//インスタンス化の方法＝クラス名 インスタンス名 = new クラス名() ;
		//インスタンス＝インスタンス名. メソッド名（引数）
		ItemBean itemBean1 = new ItemBean();
		itemBean1.setItemID("001");
		itemBean1.setItemName("商品名1");
		itemBean1.setItemPrice(1000);
		itemBean1.setItemStock(10);

		//	表示
		System.out.println("商品ID：商品名：商品価格：商品の在庫");
		System.out.println("------------------------------");
		System.out.print(itemBean1.getItemID() + ":");
		System.out.print(itemBean1.getItemName() + ":");
		System.out.print(itemBean1.getItemPrice() + "円");
		System.out.print(itemBean1.getItemStock() + "個");
		System.out.println();

		//		商品２の作成=コンストラクタで作成
		ItemBean itemBean2 = new ItemBean("002", "商品名2", 2000, 200);
		//	表示
		System.out.println("------------------------------");
		System.out.println("商品ID：商品名：商品価格：商品の在庫");
		System.out.println("------------------------------");
		System.out.print(itemBean2.getItemID() + ":");
		System.out.print(itemBean2.getItemName() + ":");
		System.out.print(itemBean2.getItemPrice() + "円");
		System.out.print(itemBean2.getItemStock() + "個");
		System.out.println();

	}

}
