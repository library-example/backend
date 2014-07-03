package com.amzi.dao;

public class LoginDaoBean implements LoginDao {

	@Override
	public boolean validate(String name, String pass) {
		
		if( name != null && pass != null && name.equals("Admin") && pass.equals("passw0rd") ) {
			return true;
		}
		
		return false;
	}
	
}