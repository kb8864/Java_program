package view;

import java.util.ArrayList;

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

}
