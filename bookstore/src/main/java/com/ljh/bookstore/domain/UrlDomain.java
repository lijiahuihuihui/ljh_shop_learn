package com.ljh.bookstore.domain;

public class UrlDomain {

	private String urlId; // 链接序号
	private String urlName; // 链接名称
	private String url;// 链接
	private int urlSort;// 链接排序
	private String addTime;//

	public String getUrlId() {
		return urlId;
	}

	public void setUrlId(String urlId) {
		this.urlId = urlId;
	}

	public String getUrlName() {
		return urlName;
	}

	public void setUrlName(String urlName) {
		this.urlName = urlName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getUrlSort() {
		return urlSort;
	}

	public void setUrlSort(int urlSort) {
		this.urlSort = urlSort;
	}

	public String getAddTime() {
		return addTime;
	}

	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}

	@Override
	public String toString() {
		return "UrlDomain [urlId=" + urlId + ", urlName=" + urlName + ", url=" + url + ", urlSort=" + urlSort
				+ ", addTime=" + addTime + "]";
	}

}
