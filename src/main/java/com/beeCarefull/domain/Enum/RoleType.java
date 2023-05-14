package com.beeCarefull.domain.Enum;

public enum RoleType{
	ROLE_CUSTOMER("Customer"),
	ROLE_ADMIN("Administrator"),
	ROLE_MANAGER("Manager"),
	ROLE_ANONYMOUS("Anonymous");	
	private String name;
	private RoleType(String name) {
		this.name=name;
	}	
	public String getName() {
		return name;
	}	
	
}
