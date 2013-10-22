package com.sarvatra.smui.services;

public interface SecurityService {
	public boolean login(String userName, String password);
	public String[] getRoles(String userName);
}
