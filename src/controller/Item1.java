package controller;

import java.util.ArrayList;

import beans.ItemBean;

public class Item1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//商品の作成
		ItemBean itemBean1 = new ItemBean("001", "商品名1", 1000, 100);
		ItemBean itemBean2 = new ItemBean("002", "商品名2", 2000, 200);
		ItemBean itemBean3 = new ItemBean("003", "商品名3", 3000, 300);
		
		//商品リストへの登録
		//ArrayList<型> 変数名 = new ArrayList<>();
		ArrayList<ItemBean>itemList = new ArrayList<ItemBean>();
		//ArrayListにオブフェクトを格納
		itemList.add(itemBean1);
		itemList.add(itemBean2);
		itemList.add(itemBean3);
		
		//	表示
		System.out.println("------------------------------");
		System.out.println("商品ID：商品名：商品価格：商品の在庫");
		System.out.println("------------------------------");
		
		//拡張for文で表示
		for(ItemBean itemBean : itemList) {
			System.out.print(itemBean.getItemID() + ":");
			System.out.print(itemBean.getItemName() + ":");
			System.out.print(itemBean.getItemPrice() + "円");
			System.out.println(itemBean.getItemStock() + "個");
		}
		
	}

}
