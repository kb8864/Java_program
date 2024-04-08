package controller;

import java.util.ArrayList;

import beans.ItemBean;
import view.ItemView;

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
		
		// ItemViewに リスト管理されたオブジェクトを渡す
		ItemView.itemView(itemList);
		
		
	}

}
