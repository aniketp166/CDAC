package com.cdac.service;

public class LoginService {

	public boolean loginCheck(String username, String password) {
		if(username.equals("aniket") && password.equals("123"))
			return true;
		return false;
	}
}
