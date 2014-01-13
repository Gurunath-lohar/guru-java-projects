package com.test.association;

import java.util.Set;

public class Item {
	private Integer id;
	private String item_name;
	private String description;
	private Integer initial_price;
	private Set<Bid> bids;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getInitial_price() {
		return initial_price;
	}
	public void setInitial_price(Integer initial_price) {
		this.initial_price = initial_price;
	}
	public Set<Bid> getBids() {
		return bids;
	}
	public void setBids(Set<Bid> bids) {
		this.bids = bids;
	}

}
