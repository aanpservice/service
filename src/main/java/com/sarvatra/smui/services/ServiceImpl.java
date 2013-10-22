package com.sarvatra.smui.services;


public class ServiceImpl implements Service {
	
	SecurityService securityService;

	public SecurityService getSecurityService() {
		return securityService;
	}
	public void setSecurityService(SecurityService securityService) {
		this.securityService = securityService;
	}
}
