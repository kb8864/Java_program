package controller;

import java.util.HashMap;

import beans.ItemBean;
import model.ItemLogic;
import view.ItemView;

public class Item3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//商品の作成
		ItemBean itemBean1 = new ItemBean("001", "商品名1", 1000, 100);
		ItemBean itemBean2 = new ItemBean("002", "商品名2", 2000, 200);
		ItemBean itemBean3 = new ItemBean("003", "商品名3", 3000, 300);

		//		// HashMapの作成
		//		HashMap<String, ItemBean> itemMap = new HashMap<String, ItemBean>();
		//		// 要素の追加
		//		itemMap.put(itemBean1.getItemID(), itemBean1);
		//		itemMap.put(itemBean2.getItemID(), itemBean2);
		//		itemMap.put(itemBean3.getItemID(), itemBean3);

		//ItemLogicを使って商品登録を行う
		ItemLogic itemLogic = new ItemLogic();
		itemLogic.putItem(itemBean1);
		itemLogic.putItem(itemBean2);
		itemLogic.putItem(itemBean3);
		
		//商品2の在庫を試しに500個に増やす
		itemLogic.updateStock("002", 500);
		
		//商品3の在庫を400個減らす
		itemLogic.updateStock("003", -400);
		
		//ItemLogicを使って登録したものをItemViewにHashMapを使って渡す
		HashMap<String, ItemBean> itemMap = itemLogic.getItemMap();

		// ItemViewのHasuMapで使うため キー管理されたオブジェクトを渡す
		ItemView.itemView(itemMap);

	}

}
