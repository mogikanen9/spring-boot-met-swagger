package com.mogikanensoftware.swagger.entity.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mogikanensoftware.swagger.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
	Optional<Account> findByUsername(String username);
}
