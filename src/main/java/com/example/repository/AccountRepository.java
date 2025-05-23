package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    public Account findByUsername(String username);
    public Account findByUsernameAndPassword(String username, String passwrod);
    public Account findByAccountId(Integer accountId);

}