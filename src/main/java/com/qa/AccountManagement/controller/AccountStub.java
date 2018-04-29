package com.qa.AccountManagement.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.qa.AccountManagement.model.Account;

public class AccountStub {
	private static Map<Long, Account> acts = new HashMap<Long, Account>();
	private static Long idIndex = 3L;
	
	static {
		Account a = new Account(1L, "Abdirahman", "Hussein", "123");
		acts.put(1L, a);
		
		Account b = new Account(2L, "Awais", "Ajaz", "456");
		acts.put(2L, b);
		
		Account c = new Account(3L, "Abdihakim", "Dirie", "789");
		acts.put(3L, c);	
	}
	
	public static List<Account> list() {
		return new ArrayList<Account>(acts.values());
	}
	
	public static Account create(Account act) {
		idIndex += idIndex;
		act.setId(idIndex);
		acts.put(idIndex, act);
		return act;
	}
	
	public static Account get(Long id) {
		return acts.get(id);
	}
	
	public static Account update(Long id, Account act) {
		acts.put(id, act);
		return act;
	}
	
	public static Account delete(Long id) {
		return acts.remove(id);
	}

}
