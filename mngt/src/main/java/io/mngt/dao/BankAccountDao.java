package io.mngt.dao;

import io.mngt.entity.BankAccount;
import io.mngt.entity.Client;

public interface BankAccountDao {

  void persist(BankAccount bankAccount);
  BankAccount findBankAccountByClient(Client client);
  BankAccount findBankAccountByAccountNumber(int bankAccountNumber);

  
}