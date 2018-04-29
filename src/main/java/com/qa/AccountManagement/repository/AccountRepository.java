package com.qa.AccountManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.AccountManagement.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
