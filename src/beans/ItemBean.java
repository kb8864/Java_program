package beans;

import java.io.Serializable;

public class ItemBean implements Serializable {

	//以下4行はカプセル化
	private String itemID;//商品ID
	private String itemName;//商品名
	private int itemPrice;//商品価格
	private int itemStock;//商品の在庫

	//引数なしのコンストラクタの定義
	public ItemBean() {
	}//Item0.javaないの新しく作ったItemBeanクラスのインスタンス

	//引数ありののコンストラクタの定義(ID,商品名、商品価格、商品の在庫)
	public ItemBean(String itemID, String itemName, int itemPrice, int itemStock) {
		//		引数で渡された値を、this句を使って受け取る
		this.itemID = itemID;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemStock = itemStock;
	}

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getItemStock() {
		return itemStock;
	}

	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
	}

}
