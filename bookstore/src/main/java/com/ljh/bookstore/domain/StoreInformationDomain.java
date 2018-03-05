package com.ljh.bookstore.domain;

public class StoreInformationDomain {

	private String  storeId ; //店铺序号
	private String  storeName ; //店铺名称
	private String  storeAddress;//店铺地址
	private String  storeIntroduce;//店铺介绍
	private String  storeTelephone ; //店铺电话
	private String  addTime;//
	
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStoreAddress() {
		return storeAddress;
	}
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}
	public String getStoreIntroduce() {
		return storeIntroduce;
	}
	public void setStoreIntroduce(String storeIntroduce) {
		this.storeIntroduce = storeIntroduce;
	}
	public String getStoreTelephone() {
		return storeTelephone;
	}
	public void setStoreTelephone(String storeTelephone) {
		this.storeTelephone = storeTelephone;
	}
	public String getAddTime() {
		return addTime;
	}
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}
	@Override
	public String toString() {
		return "StoreInformationDomain [storeId=" + storeId + ", storeName=" + storeName + ", storeAddress="
				+ storeAddress + ", storeIntroduce=" + storeIntroduce + ", storeTelephone=" + storeTelephone
				+ ", addTime=" + addTime + "]";
	}
	
}
