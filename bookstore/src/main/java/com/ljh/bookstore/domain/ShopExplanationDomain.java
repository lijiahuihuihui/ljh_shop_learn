package com.ljh.bookstore.domain;

public class ShopExplanationDomain {

	private String  shop_problem_id ; //购物问题序号
	private String  shop_problem ; //购物问题
	private String  shop_answer;//购物答案
	private String  addTime;//
	public String getShop_problem_id() {
		return shop_problem_id;
	}
	public void setShop_problem_id(String shop_problem_id) {
		this.shop_problem_id = shop_problem_id;
	}
	public String getShop_problem() {
		return shop_problem;
	}
	public void setShop_problem(String shop_problem) {
		this.shop_problem = shop_problem;
	}
	public String getShop_answer() {
		return shop_answer;
	}
	public void setShop_answer(String shop_answer) {
		this.shop_answer = shop_answer;
	}
	public String getAddTime() {
		return addTime;
	}
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}
	@Override
	public String toString() {
		return "ShopExplanationDomain [shop_problem_id=" + shop_problem_id + ", shop_problem=" + shop_problem
				+ ", shop_answer=" + shop_answer + ", addTime=" + addTime + "]";
	}
	
}
