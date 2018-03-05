package com.ljh.bookstore.domain;

public class UrlDomain {

	private String  url_id ; //链接序号
	private String  url_name ; //链接名称
	private String  url;//链接
	private int  url_sort;//链接排序
	private String  addTime;//
	public String getUrl_id() {
		return url_id;
	}
	public void setUrl_id(String url_id) {
		this.url_id = url_id;
	}
	public String getUrl_name() {
		return url_name;
	}
	public void setUrl_name(String url_name) {
		this.url_name = url_name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getUrl_sort() {
		return url_sort;
	}
	public void setUrl_sort(int i) {
		this.url_sort = i;
	}
	public String getAddTime() {
		return addTime;
	}
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}
	@Override
	public String toString() {
		return "UrlDomain [url_id=" + url_id + ", url_name=" + url_name + ", url=" + url + ", url_sort=" + url_sort
				+ ", addTime=" + addTime + "]";
	}
	
}
