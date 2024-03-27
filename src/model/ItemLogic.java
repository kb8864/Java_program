package model;

import java.util.HashMap;

import beans.ItemBean;

public class ItemLogic {
	//	HashMapを扱う
	//itemMapを属性値にする
	private HashMap<String,ItemBean>itemMap;
	
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
	
	//setter、getterの作成
	public HashMap<String, ItemBean> getItemMap() {
		return itemMap;
	}

	public void setItemMap(HashMap<String, ItemBean> itemMap) {
		this.itemMap = itemMap;
	}
	

	


}
