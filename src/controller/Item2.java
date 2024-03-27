package controller;

import java.util.HashMap;

import beans.ItemBean;

public class Item2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//商品の作成
		ItemBean itemBean1 = new ItemBean("001", "商品名1", 1000, 100);
		ItemBean itemBean2 = new ItemBean("002", "商品名2", 2000, 200);
		ItemBean itemBean3 = new ItemBean("003", "商品名3", 3000, 300);
		
		// HashMapの作成
		HashMap<String, ItemBean> itemMap = new HashMap<String, ItemBean>();
		// 要素の追加
		itemMap.put(itemBean1.getItemID(), itemBean1);
		itemMap.put(itemBean2.getItemID(), itemBean2);
		itemMap.put(itemBean3.getItemID(), itemBean3);
		
		//	表示
		System.out.println("------------------------------");
		System.out.println("商品ID：商品名：商品価格：商品の在庫");
		System.out.println("------------------------------");
		
		//HashMapに格納されたすべてのキー（商品ID）に対して繰り返し処理
		//itemMap.get(key)を使って各商品IDに対応する商品情報を取得して表示
		for(String key:itemMap.keySet()) {
			System.out.print(key + ":");
			System.out.print(itemMap.get(key).getItemName() + ":");
			System.out.print(itemMap.get(key).getItemPrice() + "円");
			System.out.println(itemMap.get(key).getItemStock() + "個");

		}


	}

}
