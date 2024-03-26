package beans;

import java.io.Serializable;

public class itemBean implements Serializable {

	//以下4行はカプセル化
	private String itemID;//商品ID
	private String itemName;//商品名
	private int itemPrice;//商品価格
	private int itemStock;//商品の在庫

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
