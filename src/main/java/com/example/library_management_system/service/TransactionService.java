package com.example.library_management_system.service;

import com.example.library_management_system.entity.Transaction;

import java.util.List;

public interface TransactionService {
    List<Transaction> getAllTransactions();
    Transaction getTransactionById(Long id);
    void saveTransaction(Transaction transaction);
    List<Transaction> getUserTransactions(Long userId);
    List<Transaction> getOverdueTransactions();
}
