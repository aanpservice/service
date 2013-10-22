package com.sarvatra.smui.services.model;

public class Category extends BaseModel {
	private Integer categoryId;
	private String category;
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String getEntityName() {
		return "Category";
	}
}
