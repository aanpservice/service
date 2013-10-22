package com.sarvatra.smui.services.model;


public abstract class BaseModel {

	public abstract String getEntityName();

	private AccessModel access;

	/*
	 * boolean isAccessible = true;
	 * 
	 * public boolean isAccessible() { return isAccessible; }
	 * 
	 * public void setAccessible(boolean isAccessible) { this.isAccessible =
	 * isAccessible; }
	 */

	public final void setAccess(AccessModel access) {
		this.access = access;
	}

	public final AccessModel getAccess() {
		return access;
	}

	
}
