package com.qa.AccountManagement;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

import com.qa.AccountManagement.controller.AccountController;
import com.qa.AccountManagement.model.Account;
import com.qa.AccountManagement.repository.AccountRepository;

public class AccountControllerTest {
	@InjectMocks
	private AccountController ac;
	
	@Mock
	private AccountRepository accountRepository;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testAccountGet() {
		Account aw = new Account();
		aw.setId(1L);
		when(accountRepository.findOne(1L)).thenReturn(aw);
		
		Account acts = ac.get(1L);
		
		verify(accountRepository).findOne(1L);
		assertEquals(1L, acts.getId().longValue());
	}
}
