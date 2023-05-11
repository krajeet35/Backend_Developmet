package com.ajeet.dao;

import com.ajeet.model.Account;

public interface AccountDao {
	public boolean createAccount(Account acc);
	
	public boolean deleteAccount(int acc);
	
	public boolean updateAccount(Account acc);
	
	public Account findAccount(int acc);

}
