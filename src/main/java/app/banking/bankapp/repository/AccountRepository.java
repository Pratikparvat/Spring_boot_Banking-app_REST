package app.banking.bankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.banking.bankapp.entity.Account;

public interface AccountRepository extends JpaRepository<Account,Long>{
    
}
