package com.ljh.bookstore.domain;

public class ShopExplanationDomain {

	private String  shopProblemId ; //购物问题序号
	private String  shopProblem ; //购物问题
	private String  shopAnswer;//购物答案
	private String  addTime;//
	@Override
	public String toString() {
		return "ShopExplanationDomain [shopProblemId=" + shopProblemId + ", shopProblem=" + shopProblem
				+ ", shopAnswer=" + shopAnswer + ", addTime=" + addTime + "]";
	}
	public String getShopProblemId() {
		return shopProblemId;
	}
	public void setShopProblemId(String shopProblemId) {
		this.shopProblemId = shopProblemId;
	}
	public String getShopProblem() {
		return shopProblem;
	}
	public void setShopProblem(String shopProblem) {
		this.shopProblem = shopProblem;
	}
	public String getShopAnswer() {
		return shopAnswer;
	}
	public void setShopAnswer(String shopAnswer) {
		this.shopAnswer = shopAnswer;
	}
	public String getAddTime() {
		return addTime;
	}
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}
	
	
	
}
