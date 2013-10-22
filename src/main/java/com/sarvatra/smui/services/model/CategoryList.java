package com.sarvatra.smui.services.model;

import java.util.List;

public class CategoryList extends BaseModel {

	List<Category> categoryList = null;

	public List<Category> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<Category> categoryList) {
		this.categoryList = categoryList;
	}
	
	@Override
	public String getEntityName() {
		return "CategoryList";
	}
}
