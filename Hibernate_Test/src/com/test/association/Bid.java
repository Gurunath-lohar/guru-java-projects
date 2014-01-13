package com.test.association;

public class Bid {
	private Integer id;
	private Integer item_id;
	private Integer bid_value;
	private Item item;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getItem_id() {
		return item_id;
	}
	public void setItem_id(Integer itemId) {
		item_id = itemId;
	}
	public Integer getBid_value() {
		return bid_value;
	}
	public void setBid_value(Integer bidValue) {
		bid_value = bidValue;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
}
