package view;

import java.util.ArrayList;
import java.util.HashMap;

import beans.ItemBean;

public class ItemView {

	//ArrayListのItemBeanオブジェクトを表示
	//インスタンス化しない
	public static void itemView(ArrayList<ItemBean> itemList) {//ItemBeanオブジェクトのArrayList
		//	表示
		System.out.println("ここはItemView");
		System.out.println("商品ID：商品名：商品価格：商品の在庫");
		System.out.println("------------------------------");

		//拡張for文で表示
		for (ItemBean itemBean : itemList) {
			System.out.print(itemBean.getItemID() + ":");
			System.out.print(itemBean.getItemName() + ":");
			System.out.print(itemBean.getItemPrice() + "円");
			System.out.println(itemBean.getItemStock() + "個");
		}

	}
	
	//HashMapのItemBeanオブジェクトを表示
	//HashMap<キーの型, バリューの型> マップの名前
	//オーバロード
	//作成したHashMapであるitemMapをfor文で使い回してる
	public static void itemView(HashMap<String, ItemBean>itemMap) {
		//	表示
		System.out.println("ここItemView。Item2で作成した商品をHashMapのViewで表示");
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
