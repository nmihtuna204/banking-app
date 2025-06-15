package net.javaguides.banking.service;

import lombok.experimental.FieldDefaults;
import net.javaguides.banking.dto.AccountDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);

    List<AccountDto> getAllAccounts(); // New method to get all accounts

    void deleteAccount(Long id); // New method to delete an account
}
