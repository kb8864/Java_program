package model;

import java.util.HashMap;

import beans.ItemBean;

public class ItemLogic {
	//	HashMapを扱う
	//itemMapを属性値にする
	private HashMap<String, ItemBean> itemMap;

	//itemMapをnewするコンストラクタを作成
	//itemMapを使えるようにする
	//このコンストラクタ内でitemMapを新しいHashMapインスタンスで初期化し、ItemLogicオブジェクトが作成された時点で、商品情報を格納する準備を行う
	public ItemLogic() {
		this.itemMap = new HashMap<String, ItemBean>();
	}

	//ItemIDをキーにして、商品登録

	public void putItem(ItemBean itemBean) {//ItemBean itemBeanは、メソッドが受け取る引数で、登録したい商品の情報を含むItemBeanオブジェクト
		itemMap.put(itemBean.getItemID(), itemBean);

	}

	//商品IDで商品指定して、その在庫を増量させるので、2つの変数を引数として扱う
	public void updateStock(String itemID, int quantity)throws Exception {
		ItemBean itemBean = itemMap.get(itemID);
		int newStock = itemBean.getItemStock() + quantity;
		
		//itemBeanのあたらしい在庫をセットする前に例外処理を記述する
		if(newStock < 0 ) {
			throw new Exception(itemID + "は在庫不足です");
		}
		
		//itemBeanのあたらしい在庫をセットする
		itemBean.setItemStock(newStock);
		//新しいitemBeanをitemMapの中に追加する
		itemMap.put(itemID, itemBean);

	}

	//setter、getterの作成
	public HashMap<String, ItemBean> getItemMap() {
		return itemMap;
	}

	public void setItemMap(HashMap<String, ItemBean> itemMap) {
		this.itemMap = itemMap;
	}

}
