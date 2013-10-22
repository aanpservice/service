package com.sarvatra.smui.services;

public class SecurityServiceImpl implements SecurityService {

	public boolean login(String userName, String password) {
		System.out.println("**************login user : " + userName);
		System.out.println("**************login password : " + password);
		if(userName.equals("pawan") && password.equals("pawan")){
			return true;
		}
		return false;
	}

	public String[] getRoles(String userName) {
		String[] roles = new String[2];
		roles[0] = "role1";
		roles[1] = "role2";
		return roles;
	}

}
