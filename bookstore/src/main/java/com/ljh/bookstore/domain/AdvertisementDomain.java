package com.ljh.bookstore.domain;

public class AdvertisementDomain {
    
	private String advId ; //id
	private String  advName ; //广告名称
	private String  advPicUrl;//广告路径
	private String  addTime;//
	
	public String getAdvId() {
		return advId;
	}
	public void setAdvId(String advId) {
		this.advId = advId;
	}
	public String getAdvName() {
		return advName;
	}
	public void setAdvName(String advName) {
		this.advName = advName;
	}
	public String getAdvPicUrl() {
		return advPicUrl;
	}
	public void setAdvPicUrl(String advPicUrl) {
		this.advPicUrl = advPicUrl;
	}
	public String getAddTime() {
		return addTime;
	}
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}
	@Override
	public String toString() {
		return "AdvertisementDomain [advId=" + advId + ", advName=" + advName + ", advPicUrl=" + advPicUrl
				+ ", addTime=" + addTime + "]";
	}
	
}
